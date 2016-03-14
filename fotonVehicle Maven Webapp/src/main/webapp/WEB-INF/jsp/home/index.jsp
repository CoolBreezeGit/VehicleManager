<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>Foton Vehicle</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  
    <frameset cols="200px,*">
    	<frame name="left" src="${pageContext.request.contextPath}/homeAction_left.action"></frame>
    	<frame name="right" src="${pageContext.request.contextPath}/homeAction_right.action"></frame>
    </frameset>
    
</html>
