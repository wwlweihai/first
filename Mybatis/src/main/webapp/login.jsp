<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆页面</title>
<script type="text/javascript" src="http://mat1.gtimg.com/app/openjs/openjs.js"></script>
<script src="http://mat1.gtimg.com/app/openjs/widget/connect.js"></script>
</head>
<body>
这是一个xx系统给出的登陆页面
<h3>用户登陆</h3>
<form action="testServlet" method='POST'>
		<table>
		   <tr><td>用户名:</td><td><input type='text' name='j_username' value=''></td></tr>
		   <tr><td>密码:</td><td><input type='password' name='j_password'/></td></tr>
		   <tr>
		   		<td>
		   			<input name="submit" type="submit" value="log_in"/>
			   	</td>
		   </tr>
		</table>
	</form>
</body>
</html>