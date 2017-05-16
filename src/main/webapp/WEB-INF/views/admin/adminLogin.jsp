<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<title>欢迎管理员登录系统</title>
<base href="<%=basePath%>" />

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Modern Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<script src="js/jquery-1.9.1.min.js"></script>
<!----webfonts--->
<!-- 
<link href='http://fonts.useso.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
 -->
 <!---//webfonts--->  
<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>

</head>
<body id="login">
  <div class="login-logo">
    <img src="image/logo.png" alt=""/>
  </div>
  <h2 class="form-heading">欢迎管理员登录    <i style="color:red">电影购票后台管理系统</i></h2>
  <div class="app-cam">
	  <form action="admin/processAdminLogin.htmls" method="POST">
	  	<!-- <input type="hidden" name="adminId" value="1"> -->
		<input type="text" name="adminName" class="text" placeholder="帐号" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '帐号';}">
		<input type="password" name="adminPassword" placeholder="密码" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '密码';}">
		<div class="submit"><input type="submit" value="登录"></div>
		
		<ul class="new">
			<li class="new_left"><p><a href="#">忘记密码 ?</a></p></li>
			<li class="new_right"><p class="sign">还没帐号 ?<a href="register.html"> 注册</a></p></li>
			<div class="clearfix"></div>
		</ul>
	</form>
  </div>
   <div class="copy_layout login">
      <p>Copyright &copy; 2017.Company name All rights reserved by wuxiaoyu </p>
   </div>
</body>
</html>