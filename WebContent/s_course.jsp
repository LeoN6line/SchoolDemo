<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.ArrayList,com.Leon.entity.Course,com.Leon.dao.gradeDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看已选课程</title>
<link href = "css\layout.css" rel = "stylesheet" type = "text/css"/>
</head>
<body>
<div class="top" style='border:1px solid #000;background-color:#c0c0c0'><%@ include file = "s_topmenu.jsp" %></div>
<div class="container" style='background-color:#EEE;text-align:center;padding:30px 0px;'> 
<center>
<p><b>已选课程</b></p>
<%  ArrayList<Course> clist= new ArrayList<Course>();
	clist = gradeDao.getAll();%>
<table border = "1">
<tr>
<td width = 100dp>课程代号</td>
<td width = 200dp>课程名</td>
<td width = 100dp>教师</td>
<td width = 200dp>时间</td>
<td width = 200dp>地点</td>
<td width = 100dp>是否退课</td>
</tr>
<tr>
<%int i ;
for(i = 0;i<clist.size();i++){
Course  course = clist.get(i);%>
<td width = 100dp><%= course.getCid() %></td>
<td width = 200dp><%= course.getCname() %></td>
<td width = 100dp><%= course.getTname() %></td>
<td width = 200dp><%= course.getCtime() %></td>
<td width = 200dp><%= course.getAddress() %></td>
<td width = 100dp><a href = "s_DeleteCourseServlet?id=<%=course.getCid()%>">退课</a></td>
</tr>
<% }%>
</table>
<a href = "s_pickcourse.jsp">返回选课页面</a>
</center>
<div class="foot"><%@ include file = "s_footer.jsp" %></div>
</div>




</body>
</html>