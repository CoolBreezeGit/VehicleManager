<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>增加车型</title>

</head>

<body>
	<s:form action="vehicleAction_add">
		<div id="column_1">
			<div class="results-data-title">
				<h2>品牌</h2>
				<s:textfield name="v_Brand.name"></s:textfield>
			</div>
		</div>

		<div id="column_2">
			<div class="results-data-title">
				<h2>车型</h2>
				<s:textfield name="v_Type.name"></s:textfield>
			</div>
		</div>

		<div id="column_3">
			<div class="results-data-title">
				<h2>配置</h2>
				<s:textfield name="v_Configure.name"></s:textfield>
			</div>
		</div>
		<div id="column_4">
			<div class="results-data-title">
				<h3>基本参数</h3>
			</div>
		</div>
		<div>
			<table id="data_1" maximumSpeedwidth="80%" border="1" cellpadding="2"
				cellspacing="0">
				<tbody>
					<tr id="SN_9">
						<td class="data-table-item">指导价</td>
						<td class="data-table-val"><s:textfield name="v_Param.p_Base.guidePrice"></s:textfield></td>
					</tr>
					<tr id="SN_261">
						<td class="data-table-item">市场报价</td>
						<td class="data-table-val"><s:textfield
								name="quotedMarketPrice"></s:textfield></td>
					</tr>
					<tr id="SN_44">
						<td class="data-table-item">生产时间(年式)</td>
						<td class="data-table-val"><s:textfield name="productionTime"></s:textfield></td>

					</tr>
					<tr id="SN_19">
						<td class="data-table-item">发动机位置</td>
						<td class="data-table-val"><s:textfield name="EnginePosition"></s:textfield></td>

					</tr>
					<tr id="SN_12">
						<td class="data-table-item">驱动形式</td>
						<td class="data-table-val"><s:textfield name="drivingForm"></s:textfield></td>

					</tr>

					<tr id="SN_52">
						<td class="data-table-item">综合油耗(L/100km)</td>
						<td class="data-table-val"><s:textfield
								name="integratedFuelConsumption"></s:textfield></td>

					</tr>

					<tr id="SN_13">
						<td class="data-table-item">最高车速(km/h)</td>
						<td class="data-table-val"><s:textfield name="maximumSpeed"></s:textfield></td>
					</tr>

				</tbody>
			</table>
			
			<s:submit value="保存"></s:submit>
			
		</div>
		
	</s:form>
</body>
</html>
