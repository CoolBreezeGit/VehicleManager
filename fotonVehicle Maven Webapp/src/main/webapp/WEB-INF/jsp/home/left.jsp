<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Foton Vehicle</title>

<base target="right">

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>

<body>
	
	<s:a action="vehicleAction_addOrEditUI">添加/修改</s:a>
	<br/>
	<s:a action="vehicleAction_deleteUI">删除</s:a>
	<br/>
	<s:a action="vehicleAction_queryAndCompareUI">查询/对比车型</s:a>
	

</body>




</html>
