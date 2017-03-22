<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会员登录</title>

<link rel="stylesheet"
	href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="/MovieTicketSnapUp/nice-validator/jquery.validator.js?local=zh-CN"></script>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-4 col-md-offset-4 column">
				<form id="loginForm" action="/MovieTicketSnapUp/user/processUserLogin.htmls"
					method="post" class="form-horizontal" role="form"
					style="margin-top: 40px;">
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">邮箱</label>
						<div class="col-sm-7">
							<input type="email" class="form-control" name="email" id="email" />
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-3 control-label">密码</label>
						<div class="col-sm-7">
							<input type="password" class="form-control" name="password" id="inputPassword3" />
						</div>
					</div>
					<div class="form-group">
						<label for="yzm" class="col-sm-3 control-label">验证码</label>
						<div class="col-sm-7">
							<span><input type="text" class="form-control" name="yzm" id="yzm" /></span>
							<img style="margin-top: 10px;" id="img"
								src="/MovieTicketSnapUp/authImage/image.htmls"
								style="width:73px; height:35px;" /> <a href='#'
								onclick="javascript:changeImg()"><label>看不清？</label></a>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-3 col-sm-7">
							<div class="checkbox">
								<label><input type="checkbox" name="rememberMe"/>记住我</label>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-3 col-sm-7">
							<button type="submit" class="btn btn-default">登录</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

	<!-- 更改验证码 -->
	<script type="text/javascript">
		function changeImg() {
			var img = document.getElementById("img");
			img.src = "/MovieTicketSnapUp/authImage/image.htmls?date="
					+ new Date();
			;
		}
		
		//使用nice-validator插件进行验证
		$("#loginForm").validator({
		    fields: {
		        "email": "required;email",
		        "password":"required;length(6~16)",
		        "yzm":"required;length(4)",
		    }
		});
	</script>
</body>
</html>