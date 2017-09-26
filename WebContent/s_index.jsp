<%@ page  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生主页</title>
<link href = "css\layout.css" rel = "stylesheet" type = "text/css"/>
</head>
<body>
<div class="top"   style='border:1px solid #000;background-color:#c0c0c0'><%@ include file = "s_topmenu.jsp" %></div>
<div class="container" style='background-color:#EEE;text-align:center;padding:30px 0px;'> 
<div class="left"style='float:right;width:80%;height:600px'><%@ include file = "s_content.jsp" %></div>
<div class="right"style='width:20%;border:1px solid #000;height:600px;'><%@ include file = "s_leftmenu.jsp" %></div>
<div class="foot"><%@ include file = "s_footer.jsp" %></div>
</div>




</body>
</html>