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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>

<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

<base href="<%=basePath%>" />
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery-1.9.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/body.css">
<link rel="stylesheet" href="css/index.css">
<!-- Custom CSS -->
<!--
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet">  -->
</head>
<body>
	<div class="container">
		<!-- 导航栏 -->
		<jsp:include page="/WEB-INF/views/common/navigation.html"></jsp:include>
		<!-- end 导航栏 -->
		
		<!-- 轮播图 -->
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="carousel slide" id="carousel-124024">
					<ol class="carousel-indicators">
						<li class="active" data-slide-to="0"
							data-target="#carousel-124024"></li>
						<li data-slide-to="1" data-target="#carousel-124024"></li>
						<li data-slide-to="2" data-target="#carousel-124024"></li>
					</ol>
					<div class="carousel-inner">
						<div class="item active">
							<img alt="" src="image/default.jpg" />
							<div class="carousel-caption">
								<h4>First Thumbnail label</h4>
								<p>Cras justo odio, dapibus ac facilisis in, egestas eget
									quam. Donec id elit non mi porta gravida at eget metus. Nullam
									id dolor id nibh ultricies vehicula ut id elit.</p>
							</div>
						</div>
						<div class="item">
							<img alt="" src="image/default1.jpg" />
							<div class="carousel-caption">
								<h4>Second Thumbnail label</h4>
								<p>Cras justo odio, dapibus ac facilisis in, egestas eget
									quam. Donec id elit non mi porta gravida at eget metus. Nullam
									id dolor id nibh ultricies vehicula ut id elit.</p>
							</div>
						</div>
						<div class="item">
							<img alt="" src="image/default2.jpg" />
							<div class="carousel-caption">
								<h4>Third Thumbnail label</h4>
								<p>Cras justo odio, dapibus ac facilisis in, egestas eget
									quam. Donec id elit non mi porta gravida at eget metus. Nullam
									id dolor id nibh ultricies vehicula ut id elit.</p>
							</div>
						</div>
					</div>
					<a class="left carousel-control" href="#carousel-124024"
						data-slide="prev"><span
						class="glyphicon glyphicon-chevron-left"></span></a> <a
						class="right carousel-control" href="#carousel-124024"
						data-slide="next"><span
						class="glyphicon glyphicon-chevron-right"></span></a>
				</div>
			</div>
		</div><!-- end 轮播图 -->

		<!-- 电影票表格 -->
		<div class="row clearfix">
			<div class="col-md-12 column">

				<div class="jumbotron well">
					<h2>你喜欢的, 才是电影!</h2>
					<p>
						这是一个简洁大方的电影票抢购系统，选择你喜欢的电影，抢购成功将以邮件的方式通知你！电影票有限，尽快抢购吧，抢到就是赚到！！！</p>
					<p>
						<a class="btn btn-primary btn-large" href="#">点击了解更多哦</a>
					</p>
				</div>
				
			<div class="row clearfix">
				<div class="col-md-12">
					<div class="movieType">
							<ul>
								<li class="typename">类型：</li>
								<li><a href="common/index.htmls?type=动作">动作</a></li>
								<li><a href="common/index.htmls?type=喜剧">喜剧</a></li>
								<li><a href="common/index.htmls?type=犯罪">犯罪</a></li>
								<li><a href="common/index.htmls?type=科幻">科幻</a></li>
								<li><a href="common/index.htmls?type=剧情">剧情</a></li>
								<li><a href="common/index.htmls?type=冒险">冒险</a></li>
								<li><a href="common/index.htmls?type=爱情">爱情</a></li>
								<li><a href="common/index.htmls?type=奇幻">奇幻</a></li>
								<li><a href="common/index.htmls?type=悬疑">悬疑</a></li>
								<li><a href="common/index.htmls?type=惊悚">惊悚</a></li>
								<li><a href="common/index.htmls?type=动画">动画</a></li>
								<li><a href="common/index.htmls?type=恐怖">恐怖</a></li>
							</ul>
					</div>
				</div>
			</div>
				
				<c:if test="${not empty requestScope.movies}">
					<c:forEach items="${movies}" var="movie">
					<!-- 电影列表 -->
						<div class="res_cinema col-md-12" style="margin-top:50px;">
							<div class="rs_movie_in">
								<div class="res_movie_pic col-md-2 text-right">
									<a href="" target="_blank"> 
										<img alt="" title="" src="${movie.picturePath}" onerror="" height="167" width="117">
									</a>
									<div class="res_picwz" style="display: block;"></div>
									<i class="res_movie_green">3D</i> 
									<span class="res_blue" style="display: none;">IMAX</span> 
									
									<div class="res_movie_ann">
										<a href="screen/showScreenList.htmls?movieId=${movie.movieId}" class="btn btn-primary" target="_blank">选座购票</a>
									</div>
									
								</div>
								<div class="res_movie_text col-md-6 text-left">
									<div class="res_movie_text_in_title">
										<h3 class="cy_res_title">
											<a class="xh_a" title="" href="common/showMovie.htmls?id=${movie.movieId}" target="_blank">
												<c:out value="${movie.movieName}"></c:out>
											</a>
										</h3>
										<span class="ml5">
											<strong>评分：</strong>
										</span> 
										<em class="redfc"> 
											<span class="f30">
												<c:out value="${movie.grade}"></c:out>
											</span>
										</em>
									</div>
									<div class="res_movie_text_in">
										<strong>类型：</strong>
										<span class="type">
											<c:out value="${movie.type}"></c:out>
										</span> <br>
										<div class="time_long">
											<strong>时长：</strong>
											<c:out value="${movie.timeRange}"></c:out>
											<c:out value="分钟"></c:out>
										</div>
										<div class="res_movie_dy">
											<strong>导演：</strong>
											<c:out value="${movie.directors}"></c:out>
										</div>
										<div class="res_movie_dy">
											<strong>演员：</strong>
											<c:out value="${movie.actors}"></c:out>
										</div>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
				</c:if>
				<!-- end 电影列表 -->
				<c:if test="${empty requestScope.movies}">
					<div class="res_cinema col-md-12" style="margin-top:50px;">
						<h3 style="color:red">暂无该类型的电影，请换个条件搜索</h3>
					</div>
				</c:if>
			</div>

		</div>
		<!-- footer -->
		<div class="row clearfix">
			<div class="col-md-12 column" style="margin-top:50px;">
				<address class="center-block" style="background-color: #ccc;">
					<strong>com.wxy.movie, Inc.</strong><br /> 广东工业大学生活西区1栋<br />
					广州大学城外环西路100号广东工业大学<br /> <abbr title="Phone">P:</abbr>
					13265982191
				</address>
				<address>
					<strong>吴小宇</strong><br> <a href="mailto:#">1559180670@qq.com</a>
				</address>
			</div>
		</div>
		<!-- end footer -->
	</div>
	
	<script src="js/index.js"></script>
</body>
</html>