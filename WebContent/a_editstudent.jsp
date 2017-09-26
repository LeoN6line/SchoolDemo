<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="com.Leon.entity.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑学生</title>
</head>
<body>
<center>
<%Student stu = (Student)request.getAttribute("stu"); %>
<form action="a_AddStudentServlet" method="get">
		学生姓名<input type="text" name="sname" value="<%=stu.getSname()%>"/> <br /><br />
	    性别<input type="radio" name="ssex" value="男" <%="男".equals(stu.getSsex())? "checked='checked'":"" %>/>男
	          <input type="radio" name="ssex" value="女" <% if("女".equals(stu.getSsex())){ out.print("checked='checked'");} %>/>女 <br />
	   
	          用户名<input type="text" name="username" value="<%=stu.getUsername()%>"/> <br /><br />
	   专业<select name="dept">
	             <option value="光电学院"<%="光电学院".equals(stu.getDept())? "selected='selected'":"" %>>光电学院</option>
	             <option value="能动学院"<%="能动学院".equals(stu.getDept())? "selected='selected'":"" %>>能动学院</option>
	             <option value="机械学院"<%="机械学院".equals(stu.getDept())? "selected='selected'":"" %>>机械学院</option>
	         </select> <br /><br />
	    <input type="submit" value="添加学生">  
	    <a href ="a_index.jsp">返回</a>
   </form> 
   </center> 
</body>
</html>