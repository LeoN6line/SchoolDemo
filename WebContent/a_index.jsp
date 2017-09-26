<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import ="java.util.ArrayList,com.Leon.entity.Student,com.Leon.dao.studentDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息管理</title>
<link href = "css\layout.css" rel = "stylesheet" type = "text/css"/>
</head>
<% Student stu = (Student)session.getAttribute("stu"); %>
<body>
<div class="top" style='border:1px solid #000;background-color:#c0c0c0'><%@ include file = "a_topmenu.jsp" %></div>
<div class="container" style='background-color:#EEE;text-align:center;padding:30px 0px;'> 
<center>
<p><b>搜索学生</b></p>
<br>
<form method = "get" action="a_SearchServlet" >
请输入学生用户名/姓名：<input type = "text" name ="searchitem"/>
<input type = "submit" value = "搜索">

<%
if(stu!=null){%>
<table border = "1">
<tr>
<th width = "100px">学生姓名</th>
<th width = "50px">性别</th>
<th width = "75px">用户名</th>
<th width = "200px">学院</th>
<th width = "50px">编辑</th>
<th width = "50px">删除</th>
</tr>
<tr>

<td><%= stu.getSname() %></td>
<td><%= stu.getSsex() %></td>
<td><%= stu.getUsername() %></td>
<td><%= stu.getDept() %></td>
<td><a href = "a_EditStudentServlet?id=<%=stu.getSid()%>">编辑</a></td>
<td><a href = "a_DeleteStudentServlet?id=<%=stu.getSid()%>">删除</a></td>
</tr>
</table>
<%} %></form>

<br>
<br>
<a href = "a_addstudent.jsp">添加学生信息</a>
<br>
<br>
<% ArrayList<Student> slist = new ArrayList<Student>();
	slist = studentDao.getAll();%>
<table border = "1">
<tr>
<th width = "100px">学生姓名</th>
<th width = "50px">性别</th>
<th width = "75px">用户名</th>
<th width = "200px">学院</th>
<th width = "50px">编辑</th>
<th width = "50px">删除</th>
</tr>
<% for (int i = 0; i <slist.size();i++){
 Student stu1= slist.get(i);%>
<tr>

<td><%= stu1.getSname() %></td>
<td><%= stu1.getSsex() %></td>
<td><%= stu1.getUsername() %></td>
<td><%= stu1.getDept() %></td>
<td><a href = "a_EditStudentServlet?id=<%=stu1.getSid()%>">编辑</a></td>
<td><a href = "a_DeleteStudentServlet?id=<%=stu1.getSid()%>">删除</a></td>


</tr>
<%} %>
</table>
</center>
<div class="foot"><%@ include file = "s_footer.jsp" %></div>
</div>




</body>
</html>