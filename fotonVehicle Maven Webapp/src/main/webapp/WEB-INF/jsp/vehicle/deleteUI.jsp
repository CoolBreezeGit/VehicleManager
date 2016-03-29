<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>删除车型</title>

<script src="${pageContext.request.contextPath}/script/jquery-2.1.4.js"></script>
<script type="text/javascript">
	
	$(function() {
		//ajax级联查询
		$("#v_Brand").change(function() {
			query("v_Type", "v_Brand", this);
		});

		$("#v_Type").change(function() {
			query("v_Configure", "v_Type", this);
		});

		
	function query(controlId, selfId, _this) {

		//清除控制选项及下级选项的项目
		$("#" + controlId).empty();
		$("#" + controlId).append("<option value=''>请选择</option>");
		if (selfId == "v_Brand") {
			$("#v_Configure").empty();
			$("#v_Configure").append("<option value=''>请选择</option>");
		}

		//alert($(_this).val());

		//如果是选择默认的空项目，则设置下级选项不可选，并清除所有填充数据
		if ($(_this).val() == "" || $(_this).val() == null) {
			
			$("#" + controlId).attr("disabled", true);
			if (selfId == "v_Brand") {
				$("#v_Configure").attr("disabled", true);
			}
			return;
		}

		//发起ajax请求，填充下级选项数据
		$.ajax({
			type : "POST",
			url : "${pageContext.request.contextPath}/vehicleAction_query",
			data : selfId + ".id=" + $(_this).val(),
			success : function(data) {

				data = eval('(' + data + ')');
				data = data.list;

				for (var i = 0; i < data.length; i++) {
					$("#" + controlId).append(
							"<option value="+data[i].id+">" + data[i].name
									+ "</option>");
				}
				//设置控制选项可选
				$("#" + controlId).attr("disabled", false);
			}
		});
	}

		
		//为button添加点击事件
		$("#delBrand").click(function(){	
			if($("#v_Brand").val()==""){
				alert("请选择要删除的品牌！");
				return false;
			}
			if(confirm("确定要删除此品牌以及下属的所有车型及配置吗？")){
				$("#del").val("Brand");
			}else{
				return false;
			}
		});
		
		$("#delType").click(function(){
			if($("#v_Type").val()==""){
				alert("请选择要删除的车型！");
				return false;
			}
			if(confirm("确定要删除此车型以及下属的配置吗？")){
				$("#del").val("Type");
			}else{
				return false;
			}
		});
		
		$("#delConfigure").click(function(){
			if($("#v_Configure").val()==""){
				alert("请选择要删除的配置！");
				return false;
			}
			if(confirm("确定要删除此配置吗？")){
				
				$("#del").val("Configure");
			}else{
				return false;
			}
		});

	});

</script>

</head>

<body>
	<div>
		<s:form id="delForm" action="vehicleAction_delete" method="post">
			<input type="hidden" name="del" id="del">
		
		<div id="column_1">
			<div>
				<label>品牌</label>
				<s:select name="v_Brand.id" id="v_Brand" style="width:20%" list="#v_BrandList" listKey="id"
					listValue="name" headerKey="" headerValue="请选择"></s:select>
				<button id="delBrand">删除品牌</button>
			</div>
		</div>
	
		<div id="column_2">
			<div>
				<label>车型</label> <select name="v_Type.id" id="v_Type" style="width:20%" disabled="disabled">
					<option value="">请选择</option>
				</select>
				<button id="delType">删除车型</button>
			</div>
		</div>
	
		<div id="column_3">
			<div>
				<label>配置</label> <select name="v_Configure.id" id="v_Configure" style="width:20%" disabled="disabled">
					<option value="">请选择</option>
				</select>
				<button id="delConfigure">删除配置</button>
			</div>
		</div>
		
		</s:form>
	</div>

</body>
</html>
