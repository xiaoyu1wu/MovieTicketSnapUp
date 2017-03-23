<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>

<link rel="stylesheet"
	href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/MovieTicketSnapUp/css/body.css">

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>

<script>
	$(document).ready(function() {
		showScreenSchedule();
	});

	function showScreenSchedule() {
		$.ajax({
					type : "POST",
					url : "http://localhost:8080/MovieTicketSnapUp/screenSchedule/getScreenScheduleList.htmls",
					data : {
						"day" : "2017-02-26",
						"cinemaId" : "1",
						"movie" : "刺客信条"
					},
					async : true,
					success : function(data, textStatus) {
						var screens = $.parseJSON(data);
						$("#movieDataList").empty();//清空列表
						if (screens.length == 0) {

						} else {
							for (var i = 0; i < screens.length; i++) {
								var tr = "<tr>";
								tr += "<td>" + renderTime(screens[i].openTime) + "</td>";
								tr += "<td>" + screens[i].movie.language
										+ "</td>";
								tr += "<td>" + screens[i].hall + "号厅" + "</td>";
								tr += "<td>" + screens[i].price + "元" + "</td>";
								tr += "<td>" + "<a href='javascript:void(0)' onclick='buyTicket("
										+ screens[i].id + ")'>选座购票</a></td>";
								$("#movieDataList").append($(tr));
							}
						}

					}
				});
	}
	function getMovieList() {
		var type = 0; //影片排序类型{0：默认, 1：上映时间, 2：评分}
		$.ajax({
					type : "POST",
					url : "http://localhost:8080/MovieTicketSnapUp/movie/getMovieList.htmls",
					data : {
						"type" : type
					},
					async : true,
					success : function(data, textStatus) {
						var movies = $.parseJSON(data);
						$(".res_cinema").empty();//清空列表

					}
				});
	}

	//格式化时间：HH:mm
	function renderTime(data) {
		var da = eval("new Date(" + data +")");
		var hour = da.getHours();
		var minute = da.getMinutes();
		if(hour < 10) hour = "0" +  hour;
		if(minute < 10) minute = "0" + minute;
		
		return hour + ":" + minute;
	}
</script>
</head>
<body>
	<div class="container">
		<jsp:include page="/WEB-INF/views/common/navigation.html"></jsp:include>
		<div class="row clearfix">
			<div class="col-md-12 column">
				
				<!-- 轮播图 -->
				<div class="carousel slide" id="carousel-124024">
					<ol class="carousel-indicators">
						<li class="active" data-slide-to="0"
							data-target="#carousel-124024"></li>
						<li data-slide-to="1" data-target="#carousel-124024"></li>
						<li data-slide-to="2" data-target="#carousel-124024"></li>
					</ol>
					<div class="carousel-inner">
						<div class="item active">
							<img alt="" src="<%=basePath%>/image/default.jpg" />
							<div class="carousel-caption">
								<h4>First Thumbnail label</h4>
								<p>Cras justo odio, dapibus ac facilisis in, egestas eget
									quam. Donec id elit non mi porta gravida at eget metus. Nullam
									id dolor id nibh ultricies vehicula ut id elit.</p>
							</div>
						</div>
						<div class="item">
							<img alt="" src="<%=basePath%>/image/default1.jpg" />
							<div class="carousel-caption">
								<h4>Second Thumbnail label</h4>
								<p>Cras justo odio, dapibus ac facilisis in, egestas eget
									quam. Donec id elit non mi porta gravida at eget metus. Nullam
									id dolor id nibh ultricies vehicula ut id elit.</p>
							</div>
						</div>
						<div class="item">
							<img alt="" src="<%=basePath%>/image/default2.jpg" />
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
		</div>

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

				<div class="res_cinema col-md-12">
					<div class="rs_movie_in" style="display: none;">
						<div class="res_movie_pic col-md-2 text-right">
							<a href="" target="_blank"> 
								<img alt="" title="" src="" onerror="" height="167" width="117">
							</a>
							<div class="res_picwz" style="display: block;"></div>
							<i class="res_movie_green">3D</i> 
							<span class="res_blue" style="display: none;">IMAX</span> 
							
							<div class="res_movie_ann">
								<a href="" target="_blank">选座购票</a>
							</div>
							
						</div>
						<div class="res_movie_text col-md-6 text-left">
							<div class="res_movie_text_in_title">
								<h3 class="cy_res_title">
									<a class="xh_a" title="" href="" target="_blank"></a>
								</h3>
								<span class="ml5">评分：</span> 
								<em class="redfc"> 
									<span class="f30"></span>
								</em>
							</div>
							<div class="res_movie_text_in">
								类型：<span class="type"></span> <br>
								<div class="time_long"></div>
								<div class="res_movie_dy"></div>
							</div>
						</div>
					</div>
				</div>

				<script>
					var res_cinema = $(".res_cinema");

					var new_rs_movie_in = $(".rs_movie_in").filter("[style='display: none;']").clone();
					new_rs_movie_in.removeAttr("style");

					var res_movie_pic = new_rs_movie_in.children(".res_movie_pic");
					res_movie_pic.find("a").find("img").attr("src", "http://localhost:8080/MovieTicketSnapUp/image/shenghuaweiji.jpg");
					res_movie_pic.find(".res_picwz").html("48小时最热");
					res_movie_pic.find(".res_movie_ann").html("<a href=''" + "class='btn btn-primary'" + " target='_blank'" + ">选座购票</a>");

					var res_movie_text_in_title = new_rs_movie_in.children(".res_movie_text").find(".res_movie_text_in_title");
					res_movie_text_in_title.find(".xh_a").html("生化危机");
					res_movie_text_in_title.find(".f30").html("7.8");

					var res_movie_text_in = new_rs_movie_in.children(".res_movie_text").find(".res_movie_text_in");
					res_movie_text_in.find(".type").html("动作");
					res_movie_text_in.find(".time_long").html("时长：99分钟/英语");
					res_movie_text_in.find(".res_movie_dy").html("导演/演员： 保罗·安德森 / 米拉·乔沃维奇 / 伊恩·格雷 / 艾丽·拉特 / 鲁比·罗丝");

					res_cinema.append(new_rs_movie_in);
				</script>

				<table id="movieList" class="table table-hover table-striped">
					<thead>
						<tr>
							<th>时间</th>
							<th>语言</th>
							<th>放映厅</th>
							<th>影院价格</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody id="movieDataList">
					</tbody>
				</table>

			</div>

		</div>
		<div class="row clearfix">
			<div class="col-md-12 column">
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
	</div>

	<!-- 内联脚本 -->
	<script>
		
	</script>
</body>
</html>