<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>

</head>
<body>
	<div class="container">
		<!-- 幻灯片模块 -->
		<div class="row clearfix">
			<div class="col-md-12 column">
				<nav class="navbar navbar-default navbar-fixed-top" role="navigation"> 
				    <div class="container-fluid"> 
				        <div class="navbar-header"> 
				        	<strong>
				            	<a class="navbar-brand" href="#">电影购票系统</a> 
				            </strong>
				        </div> 
				        <ul class="nav navbar-nav navbar-right"> 
				            <li><a href="#"><span class="glyphicon glyphicon-user"></span> 注册</a></li> 
				            <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li> 
				        </ul> 
				    </div> 
				</nav>
			
				<div class="carousel slide" id="carousel-124024">
					<ol class="carousel-indicators">
						<li class="active" data-slide-to="0" data-target="#carousel-124024">
						</li>
						<li data-slide-to="1" data-target="#carousel-124024">
						</li>
						<li data-slide-to="2" data-target="#carousel-124024">
						</li>
					</ol>
					<div class="carousel-inner">
						<div class="item active">
							<img alt="" src= "<%= basePath %>/image/default.jpg" />
							<div class="carousel-caption">
								<h4>
									First Thumbnail label
								</h4>
								<p>
									Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
								</p>
							</div>
						</div>
						<div class="item">
							<img alt="" src="<%= basePath %>/image/default1.jpg" />
							<div class="carousel-caption">
								<h4>
									Second Thumbnail label
								</h4>
								<p>
									Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
								</p>
							</div>
						</div>
						<div class="item">
							<img alt="" src="<%= basePath %>/image/default2.jpg" />
							<div class="carousel-caption">
								<h4>
									Third Thumbnail label
								</h4>
								<p>
									Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
								</p>
							</div>
						</div>
					</div> <a class="left carousel-control" href="#carousel-124024" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-124024" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
				</div>
			</div>
		</div>
	
		<!-- 电影票表格 -->
		<div class="row clearfix">
			<div class="col-md-12 column">
				
				<div class="jumbotron well">
					<h1>
						你喜欢的, 才是电影!
					</h1>
					<p>
						这是一个简洁大方的电影票抢购系统，选择你喜欢的电影，抢购成功将以邮件的方式通知你！电影票有限，尽快抢购吧，抢到就是赚到！！！
					</p> 
					<p>
						<a class="btn btn-primary btn-large" href="#">点击了解更多哦</a>
					</p>
				</div>
				<nav class="navbar navbar-default" role="navigation">
					<div class="navbar-header">
						 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> 
						 	<span class="sr-only">
						 		Toggle navigation
						 	</span>
						 	<span class="icon-bar">
						 	</span>
						 	<span class="icon-bar">
						 	</span>
						 	<span class="icon-bar">
						 	</span>
						 </button> 
						 <a class="navbar-brand" href="#">Brand</a>
					</div>
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li class="active">
								 <a href="#">Link</a>
							</li>
							<li>
								 <a href="#">Link</a>
							</li>
							<li class="dropdown">
								 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
								<ul class="dropdown-menu">
									<li>
										 <a href="#">Action</a>
									</li>
									<li>
										 <a href="#">Another action</a>
									</li>
									<li>
										 <a href="#">Something else here</a>
									</li>
									<li class="divider">
									</li>
									<li>
										 <a href="#">Separated link</a>
									</li>
									<li class="divider">
									</li>
									<li>
										 <a href="#">One more separated link</a>
									</li>
								</ul>
							</li>
						</ul>
						<form class="navbar-form navbar-left" role="search">
							<div class="form-group">
								<input type="text" class="form-control" />
							</div> <button type="submit" class="btn btn-default">Submit</button>
						</form>
						<ul class="nav navbar-nav navbar-right">
							<li>
								 <a href="#">Link</a>
							</li>
							<li class="dropdown">
								 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
								<ul class="dropdown-menu">
									<li>
										 <a href="#">Action</a>
									</li>
									<li>
										 <a href="#">Another action</a>
									</li>
									<li>
										 <a href="#">Something else here</a>
									</li>
									<li class="divider">
									</li>
									<li>
										 <a href="#">Separated link</a>
									</li>
								</ul>
							</li>
						</ul>
					</div>
				</nav>
				<table class="table table-hover table-striped">
					<thead>
						<tr>
							<th>
								编号
							</th>
							<th>
								电影名
							</th>
							<th>
								上映时间
							</th>
							<th>
								状态
							</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>
								1
							</td>
							<td>
								情圣
							</td>
							<td>
								01/04/2012
							</td>
							<td>
								正在热映中
							</td>
						</tr>
						<tr>
							<td>
								2
							</td>
							<td>
								铁道飞虎
							</td>
							<td>
								01/04/2012
							</td>
							<td>
								已经下架
							</td>
						</tr>
						<tr>
							<td>
								3
							</td>
							<td>
								长城
							</td>
							<td>
								02/04/2012
							</td>
							<td>
								正在热映中
							</td>
						</tr>
						<tr>
							<td>
								4
							</td>
							<td>
								摆渡人
							</td>
							<td>
								03/04/2012
							</td>
							<td>
								已经下架
							</td>
						</tr>
						<tr>
							<td>
								5
							</td>
							<td>
								星球大战外传：侠盗一号
							</td>
							<td>
								04/04/2012
							</td>
							<td>
								Call in to confirm
							</td>
						</tr>
					</tbody>
				</table> 
				
			</div>
			
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column">
				<address class="center-block" style="background-color:#ccc;"> 
					<strong>com.wxy.movie, Inc.</strong><br /> 
					广东工业大学生活西区1栋<br /> 
					广州大学城外环西路100号广东工业大学<br /> 
					<abbr title="Phone">P:</abbr> 13265982191
				</address>
				<address>
  					<strong>吴小宇</strong><br>
  					<a href="mailto:#">1559180670@qq.com</a>
				</address>
			</div>
		</div>
	</div>
</body>
</html>