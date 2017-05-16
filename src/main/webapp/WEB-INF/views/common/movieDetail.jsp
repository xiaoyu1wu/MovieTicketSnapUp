<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电影详情</title>

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
	
	<!-- 电影详情 -->
	<c:if test="${not empty requestScope.movie}">
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
						<a href="common/showMovie.htmls?id=${movie.movieId}" class="btn btn-primary" target="_blank">选座购票</a>
					</div>
					
				</div>
				<div class="res_movie_text col-md-6 text-left">
					<div class="res_movie_text_in_title">
						<h3 class="cy_res_title">
							<c:out value="${movie.movieName}"></c:out>
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
		
		<div class="col-md-12">
			<h3>电影简介</h3>
			<div>
				<p>
					   <c:out value="${movie.description}"></c:out>
				</p>
			</div>
		</div>
		<div class="col-md-12">
			<h3>排片购票</h3>
			<div>
			</div>
		</div>
		<div class="col-md-12">
			<h3>电影影评</h3>
			<div>
				<c:choose>
					<c:when test="${not empty comments}">
						<c:forEach items="${comments}" var="comment">
							<p>
								<c:out value="${comment.commentContent}"></c:out>
							</p>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<strong>
							<c:out value="暂无评论"></c:out>
						</strong>
					</c:otherwise>
				</c:choose>
				
			</div>
		</div>
	</c:if>
</div>
	
</body>
</html>