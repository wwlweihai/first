<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
</head>
<body>
这是首页，欢迎<sec:authentication property="name"/><br>
access_token	 accesstoken，访问api资源的凭证
expires_in	 accesstoken过期时间，以系统返回的过期时间为准，注意过期时提醒用户重新授权
openid	 用户统一标识，可以唯一标识一个用户
openkey	 与openid对应的用户key，是验证openid身份的验证密钥
<h3>access_token = ${param.access_token}</h3><br>
<h3>expires_in = ${param.expires_in}</h3><br> 
<h3>openid = ${param.openid}</h3><br> 
<h3>openkey = ${param.openkey}</h3><br> 
<h3>refresh_token = ${param.refresh_token}</h3><br>

<a href="https://open.t.qq.com/api/user/info?oauth_consumer_key=801519817&access_token=${param.access_token}&openid=${param.openid}&clientip=<%=request.getRemoteAddr() %>&oauth_version=2.a&scope=all">获取用户信息</a>
<a href="https://open.t.qq.com/cgi-bin/oauth2/access_token?openid=${param.openid}&openkey=${param.openkey}&client_id=801519817&grant_type=refresh_token&refresh_token=${param.access_token}">刷新access_token</a>

</body>
</html>