<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.ArrayList,com.Leon.entity.Qa,com.Leon.dao.qaDao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>答疑信息</title>
<link href = "css\layout.css" rel = "stylesheet" type = "text/css"/>
</head>
<body>
<div class="top"  style='border:1px solid #000;background-color:#c0c0c0'><%@ include file = "t_topmenu.jsp" %></div>
<div class="container" style='background-color:#EEE;text-align:center;padding:30px 0px;'> 

<center>
<p><b>答疑信息</b></p>
<%  ArrayList<Qa> rlist= new ArrayList<Qa>();
	rlist = qaDao.getAll();%>
<table border = "1">
<tr>
<td width = 100dp>学生姓名</td>
<td width = 300dp>问题</td>
<td width = 100dp>回复</td>
</tr>
<%int i ;
for(i = 0;i<rlist.size();i++){
Qa  course = rlist.get(i);%>
<tr>
<td width = 100dp><%=course.getSname() %></td>
<td width = 300dp><%=course.getQuestion() %></td>
<td width = 100dp><a href = "t_AnwserServlet?id=<%=course.getId() %>">回复</a></td>
</tr>
<%} %>
</table>
</center>
<div class="foot"><%@ include file = "s_footer.jsp" %></div>
</div>




</body>
</html>