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
    <title>用户注册</title>
    <style>
        html, body {
            margin: 10% auto;
            width: 50%;
            text-align: center;
        }
    </style>
</head>
<body>
<h1>用户注册</h1>
<form action="user_register.action" method="post">
    用户名：<input type="text" name="bb.username"><br>
    密码：<input name="bb.password" type="password"><br>
    <input type="submit" value="注册">
</form>
<a href="index.jsp">返回登录</a><br>
</body>
</html>
