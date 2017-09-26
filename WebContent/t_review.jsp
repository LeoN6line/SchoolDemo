<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.ArrayList,com.Leon.entity.Review,com.Leon.dao.reviewDao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看评价</title>
<link href = "css\layout.css" rel = "stylesheet" type = "text/css"/>
</head>
<body>
<div class="top"  style='border:1px solid #000;background-color:#c0c0c0'><%@ include file = "t_topmenu.jsp" %></div>
<div class="container" style='background-color:#EEE;text-align:center;padding:30px 0px;'> 

<center>
<p><b>评价</b></p>
<%  ArrayList<Review> rlist= new ArrayList<Review>();
	rlist = reviewDao.getAll();%>
<table border = "1">
<tr>
<td width = 100dp>课程代号</td>
<td width = 200dp>课程名</td>
<td width = 100dp>学生姓名</td>
<td width = 300dp>评价</td>
</tr>
<%int i ;
for(i = 0;i<rlist.size();i++){
Review  course = rlist.get(i);%>
<tr>
<td width = 100dp><%=course.getCid() %></td>
<td width = 200dp><%=course.getCname() %></td>
<td width = 100dp><%=course.getSname() %></td>
<td width = 300dp><%=course.getReview() %></td>
</tr>
<%} %>
</table>
</center>
<div class="foot"><%@ include file = "s_footer.jsp" %></div>
</div>




</body>
</html>