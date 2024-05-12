<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
          + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>welcome you </title>
  <style>
    html, body {
      margin: 10% auto;
      width: 50%;
      text-align: center;
    }
  </style>
</head>
<body>
<a href="loginer.jsp">登录</a><br>
<a href="register.jsp">注册</a><br>
</body>
</html>


