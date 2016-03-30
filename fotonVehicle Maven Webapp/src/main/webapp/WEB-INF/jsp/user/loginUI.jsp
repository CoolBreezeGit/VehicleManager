<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
  <div style="margin-top:200px;margin-left:300px">
    <h1>登录</h1>
    <s:form action="userAction_login" >
    	<s:textfield name="name" label="姓名"></s:textfield><br/><br/>
    	<s:password name="password" label="密码"></s:password><br/><br/>
    	<font color="red"><s:fielderror name="error"></s:fielderror></font>
    	<s:submit value="登录"></s:submit>
    </s:form>
   </div>
    
  </body>
</html>
