<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加学生信息</title>
</head>
<body>
<center>
<form action="a_AddStudentServlet" method="get">
		学生姓名<input type="text" name="sname" /> <br /><br />
	    性别<input type="radio" name="ssex" value="男" checked="checked"/>男
	          <input type="radio" name="ssex" value="女" />女 <br /><br />
	          用户名<input type="text" name="username" /> <br /><br />
	   专业<select name="dept">
	             <option value="光电学院">光电学院</option>
	             <option value="能动学院">能动学院</option>
	             <option value="机械学院">机械学院</option>
	         </select> <br /><br />
	    <input type="submit" value="添加学生">  
	    <a href ="a_index.jsp">返回</a>
   </form> 
   </center>      
</body>
</html>