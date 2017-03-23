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
<title>会员注册</title>

<link rel="stylesheet"
	href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="/MovieTicketSnapUp/nice-validator/jquery.validator.js?local=zh-CN"></script>

</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-4 col-md-offset-4 column">

				<form id="regeditForm"
					action="/MovieTicketSnapUp/user/processUserRegedit.htmls"
					method="post" class="form-horizontal" role="form"
					style="margin-top: 40px;">
					<c:if test="${not empty error}">
						<c:out value="${error}"></c:out>
					</c:if>

					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">邮箱</label>
						<div class="col-sm-7">
							<input type="email" class="form-control" name="email" id="email" />
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword" class="col-sm-3 control-label">密码</label>
						<div class="col-sm-7">
							<input type="password" class="form-control" name="password"
								id="inputPassword" />
						</div>
					</div>
					<div class="form-group">
						<label for="confirmPassword" class="col-sm-3 control-label">确认密码</label>
						<div class="col-sm-7">
							<input type="password" class="form-control"
								name="confirmPassword" id="confirmPassword" />
						</div>
					</div>
					<div class="form-group">
						<label for="yzm" class="col-sm-3 control-label">验证码</label>
						<div class="col-sm-7">
							<span><input type="text" class="form-control" name="yzm"
								id="yzm" /></span> <img style="margin-top: 10px;" id="img"
								src="/MovieTicketSnapUp/authImage/image.htmls"
								style="width:73px; height:35px;" /> <a href='#'
								onclick="javascript:changeImg()"><label>看不清？</label></a>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-3 col-sm-7">
							<div class="checkbox">
								<label><input type="checkbox" name="rememberMe" />我已阅读并同意《电影购票系统用户协议》</label>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-3 col-sm-7">
							<button type="submit" class="btn btn-default" id="btn_regedit"
								onclick="javascript:confirmPwd()">注册</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>


	<script type="text/javascript">
	<!-- 更改验证码 -->
		function changeImg() {
			var img = document.getElementById("img");
			img.src = "/MovieTicketSnapUp/authImage/image.htmls?date="
					+ new Date();
			;
		}

		//使用nice-validator插件进行表单验证
		$("#regeditForm").validator({
			fields : {
				"email" : "required;email",
				"password" : "required;length(6~16)",
				"confirmPassword" : "required;length(6~16)",
				"yzm" : "required;length(4)",
				"rememberMe" : "checked"
			}
		});
	</script>
</body>
</html>