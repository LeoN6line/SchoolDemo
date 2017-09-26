<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>课程信息管理</title>
<link href = "css\layout.css" rel = "stylesheet" type = "text/css"/>
</head>
<body>
<div class="top"   style='border:1px solid #000;background-color:#c0c0c0'><%@ include file = "a_topmenu.jsp" %></div>
<div class="container" style='background-color:#EEE;text-align:center;padding:30px 0px;'> 
<center>
<p><b>搜索课程</b></p>
<br>
<form method = "get" action="search.jsp" >
请输入学生课程代号/课程名：<input type = "text" name ="searchitem"/>
<input type = "submit" value = "搜索">
</form>
<br>
<br>
<a href = "a_addcourse.jsp">添加课程信息</a>
<br>
<br>
<table border = "1">
<tr>
<td width = 100dp>课程代号</td>
<td width = 200dp>课程名</td>
<td width = 200dp>时间</td>
<td width = 100dp>教室</td>
<td width = 200dp>地点</td>
<td width = 50dp>编辑</td>
<td width = 50dp>删除</td>
</tr>
</table>
</center>
<div class="foot"><%@ include file = "s_footer.jsp" %></div>
</div>




</body>
</html>