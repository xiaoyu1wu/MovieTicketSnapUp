<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>

<base href="<%=basePath%>" />
<!-- Nav CSS -->
<link href="css/custom.css" rel="stylesheet">
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet"> 

<script src="js/jquery-1.9.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<div id="wrapper">
		<!-- 导航栏 -->
		<jsp:include page="/WEB-INF/views/admin/adminNavigation.html"></jsp:include>
		<!-- end 导航栏 -->
		<div id="page-wrapper">
			<div class="graphs">
				<div class="xs">
					<h3>用户管理</h3>
					<div class="panel-body1">
						<table class="table">
							<thead>
								<tr>
									<th>#</th>
									<th>用户邮箱</th>
									<th>用户名</th>
									<th>用户昵称</th>
									<th>用户性别</th>
									<th>用户年龄</th>
									<th>联系方式</th>
									<th>出生日期</th>
									<th>用户出生地</th>
									<th>用户居住地</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody id="userList">
								
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="copy_layout">

				<p>Copyright &copy; 2017.Company name All rights reserved by
					wuxiaoyu</p>
			</div>
		</div>
		<!-- /#page-wrapper -->
	</div>
	<!-- /#wrapper -->

	<!-- Metis Menu Plugin JavaScript -->
	<script src="js/metisMenu.min.js"></script>
	<script src="js/custom.js"></script>
	<script src="js/admin.js"></script>
</body>
</html>