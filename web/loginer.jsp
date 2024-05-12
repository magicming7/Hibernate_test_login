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
    <title>login</title>
    <style>
        html, body {
            margin: 10% auto;
            width: 50%;
            text-align: center;
        }
    </style>
</head>
<body>
<form action="user.action" method="post">
    用户名:<input type="text" name="bb.username"><br>
    密码:<input name="bb.password" type="password"><br>
    <input type="submit" value="登录">
</form>
<a href="register.jsp">注册</a><br>
<a href="${basePath}show.action">游客登录</a><br>

</body>
</html>
