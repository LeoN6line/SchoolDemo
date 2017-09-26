<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑问题</title>
<link href = "css\layout.css" rel = "stylesheet" type = "text/css"/>
</head>
<body>
<div class="top" style='border:1px solid #000;background-color:#c0c0c0'><%@ include file = "s_topmenu.jsp" %></div>
<div class="container" style='background-color:#EEE;text-align:center;padding:30px 0px;'> 
<center>

<p><b>编辑问题</b></p>
<form action = "s_AskTeacherServlet" method = "get">
<p>学生姓名</p>
<input type = "text" name = "input_sname" size = "30">

<p>教师姓名</p>
<input type = "text" name = "input_tname" size = "30">

<p>问题详情</p>
<input type = "text" name = "input_question" size = "90">

<br><br/><br/>
<input type = "submit" value = "提交"> &nbsp &nbsp<a href = "s_index.jsp">返回</a>
</form>
</center>
<div class="foot"><%@ include file = "s_footer.jsp" %></div>
</div>




</body>

</html>