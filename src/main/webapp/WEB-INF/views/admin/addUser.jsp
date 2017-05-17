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
<title>用户添加</title>

<base href="<%=basePath%>" />
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Nav CSS -->
<link href="css/custom.css" rel="stylesheet">
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
				<h3>新增用户</h3>
				<div class="tab-content">
					<div class="tab-pane active" id="horizontal-form">
						<form class="form-horizontal" action="admin/addUser">
							<div class="form-group">
								<label for="disabledinput" class="col-sm-2 control-label">Disabled
									Input</label>
								<div class="col-sm-8">
									<input disabled="disabled" type="text" class="form-control1"
										id="userId" placeholder="Disabled Input">
								</div>
							</div>

							<div class="form-group">
								<label for="focusedinput" class="col-sm-2 control-label">用户邮箱</label>
								<div class="col-sm-8">
									<input name="userEmail" type="text" class="form-control1" id="focusedinput"
										placeholder="请输入用户邮箱">
								</div>
								<div class="col-sm-2">
									<p class="help-block">请注意邮箱格式</p>
								</div>
							</div>

							<div class="form-group">
								<label for="inputPassword" class="col-sm-2 control-label">用户名</label>
								<div class="col-sm-8">
									<input name="userUsername" type="password" class="form-control1" id="inputPassword"
										placeholder="用户名">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword" class="col-sm-2 control-label">用户昵称</label>
								<div class="col-sm-8">
									<input name="userNickname" type="password" class="form-control1" id="inputPassword"
										placeholder="用户昵称">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword" class="col-sm-2 control-label">用户性别</label>
								<div class="col-sm-8">
									<input name="userSex" type="password" class="form-control1" id="inputPassword"
										placeholder="用户性别">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword" class="col-sm-2 control-label">用户年龄</label>
								<div class="col-sm-8">
									<input name="userAge" type="password" class="form-control1" id="inputPassword"
										placeholder="用户年龄">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword" class="col-sm-2 control-label">用户电话</label>
								<div class="col-sm-8">
									<input name="userPhone" type="password" class="form-control1" id="inputPassword"
										placeholder="用户电话">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword" class="col-sm-2 control-label">出生日期</label>
								<div class="col-sm-8">
									<input name="userBirthday" type="password" class="form-control1" id="inputPassword"
										placeholder="出生日期">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword" class="col-sm-2 control-label">出生地</label>
								<div class="col-sm-8">
									<input name="userBornCity" type="password" class="form-control1" id="inputPassword"
										placeholder="出生地">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword" class="col-sm-2 control-label">居住地</label>
								<div class="col-sm-8">
									<input name="userLivingCity" type="password" class="form-control1" id="inputPassword"
										placeholder="居住地">
								</div>
							</div>


							<div class="panel-footer">
								<div class="row">
									<div class="col-sm-8 col-sm-offset-2">
										<button class="btn-success btn">提交</button>
										<button class="btn-default btn">取消</button>
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>

				<div class="copy_layout">

					<p>Copyright &copy; 2017.Company name All rights reserved by
						wuxiaoyu</p>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- Metis Menu Plugin JavaScript -->
<script src="js/metisMenu.min.js"></script>
<script src="js/custom.js"></script>
</body>
</html>