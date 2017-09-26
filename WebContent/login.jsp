 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
</head>
<body>
<center>
<h1>欢迎使用教务处系统，请先登录您的账号！</h1>
<br>
<form action="LoginServlet" method = "post">
用户名：
<input type = "text" name = "input_username" size = "30" ><br>
<br>
密	码：
<input type = "text" name = "input_password" size = "30" ><br>
<br>
用户类型：<input type = "radio" name = "usertype" value =  "1" checked = "checked">学生
<input type = "radio" name = "usertype" value =  "2" >教师
<input type = "radio" name = "usertype" value =  "3" >管理员
<br>
<br>
<input type = "submit"  value = "提交">
<input type = "reset" value = "取消">
</form>
</center>
</body>
</html>