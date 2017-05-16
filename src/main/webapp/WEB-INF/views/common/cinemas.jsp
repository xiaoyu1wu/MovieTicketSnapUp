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
<title>影院详情</title>

<base href="<%=basePath%>">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery-1.9.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/mynav.css">
<link rel="stylesheet" href="css/body.css">
<link rel="stylesheet" href="css/index.css">


</head>
<body>
<div class="container">
	<!-- 导航栏 -->
	<jsp:include page="/WEB-INF/views/common/navigation.html"></jsp:include>
	<!-- end 导航栏 -->
	
	<div class="col-md-8 col-md-offset-2" style="margin-top:50px;">
		<form role="form" class="form-inline" method="post" action="/MovieTicketSnapUp/common/searchCinema.htmls">
			<div class="form-group">
				<label for="moviename" class="sr-only">电影院</label>
				<input type="text" class="form-control col-md-10" name="name" id="name" placeholder="请输入电影院名称">
			</div>
				<button type="submit" class="btn btn-primary">点击搜索</button>
		</form>
	</div>
	
	<c:if test="${not empty requestScope.cinemas}">
	<c:forEach items="${cinemas}" var="cinema">
	<div class="res_cinema col-md-12" style="margin-top:50px;">
		<div class="res_movie_pic col-md-2 text-right">
			<c:choose>
				<c:when test="${not empty cinema.picturePath}">
					<a href="" target="_blank"> 
						<img alt="" title="" src="${cinema.picturePath}" onerror="" height="167" width="117">
					</a>
				</c:when>
				<c:otherwise>
					<a href="" target="_blank">
						<img alt="" title="" src="image/notJpg.jpg" onerror="" height="167" width="117">
					</a>
				</c:otherwise>
			</c:choose>
			
			<div class="res_picwz" style="display: block;"></div>
			<i class="res_movie_green">3D</i> 
			<span class="res_blue" style="display: none;">IMAX</span> 
			
			<div class="res_movie_ann">
				<a href="common/cinemaDetail.htmls?id=${cinema.cinemaId}" class="btn btn-primary" target="_blank">选座购票</a>
			</div>
			
		</div>
		<div class="res_cinema col-md-6 col-md-offset-1">
				<div class="rs_movie_in">
					
					<div class="res_movie_text text-left">
						<div class="res_movie_text_in_title">
							<h3 class="cy_res_title">
								<c:out value="${cinema.name}"></c:out>
							</h3>
							<span class="ml5">
								<strong>交通：</strong>
							</span> 
							<em class="redfc"> 
								<span class="f30">
									<c:out value="${cinema.traffic}"></c:out>
								</span>
							</em>
						</div>
						<div class="res_movie_text_in">
							<div class="res_movie_dy">
								<strong>城市：</strong>
								<c:out value="${cinema.city}"></c:out>
							</div>
							<div class="res_movie_dy">
								<strong>地区：</strong>
								<c:out value="${cinema.area}"></c:out>
							</div>
							
							<strong>电话：</strong>
							<span class="type">
								<c:out value="${cinema.telephone}"></c:out>
							</span> <br>
							<div class="time_long">
								<strong>电影院介绍：</strong>
								<c:out value="${cinema.description}"></c:out>
							</div>
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</c:forEach>
	</c:if>
</div>
</body>