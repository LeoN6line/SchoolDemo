<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import ="java.util.ArrayList,com.Leon.entity.Teacher,com.Leon.dao.teacherDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教师信息管理</title>
<link href = "css\layout.css" rel = "stylesheet" type = "text/css"/>
</head>
<body>
<div class="top"   style='border:1px solid #000;background-color:#c0c0c0'><%@ include file = "a_topmenu.jsp" %></div>
<div class="container" style='background-color:#EEE;text-align:center;padding:30px 0px;'> 
<center>
<p><b>搜索教师</b></p>
<br>
<form method = "get" action="search.jsp" >
请输入教师用户名/姓名：<input type = "text" name ="searchitem"/>
<input type = "submit" value = "搜索">
</form>
<br>
<br>
<a href = "a_addteacher.jsp">添加教师信息</a>
<br>
<br>
<% ArrayList<Teacher> slist = new ArrayList<Teacher>();
	slist = teacherDao.getAll();%>
<table border = "1">
<tr>
<td width = 100dp>教师姓名</td>
<td width = 50dp>性别</td>
<td width = 100dp>用户名</td>
<td width = 50dp>编辑</td>
<td width = 50dp>删除</td>
</tr>
<% for (int i = 0; i <slist.size();i++){
 Teacher stu1= slist.get(i);%>
<tr>

<td><%= stu1.getTname() %></td>
<td><%= stu1.getTsex() %></td>
<td><%= stu1.getUsername() %></td>
<td><a href = "a_EditStudentServlet?id=<%=stu1.getTid()%>">编辑</a></td>
<td><a href = "a_DeleteStudentServlet?id=<%=stu1.getTid()%>">删除</a></td>


</tr>
<%} %>
</table>
</center>
<div class="foot"><%@ include file = "s_footer.jsp" %></div>
</div>




</body>
</html>