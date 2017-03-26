<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>

<link rel="stylesheet" href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/MovieTicketSnapUp/css/mynav.css">
<link rel="stylesheet" href="/MovieTicketSnapUp/css/body.css">
<link rel="stylesheet" href="/MovieTicketSnapUp/css/seatPlan.css">

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
</head>
<body>
	<div class="container">
		<jsp:include page="/WEB-INF/views/common/navigation.html"></jsp:include>
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="seatShowsct" id="resultSeat_jquery" style="">
	 				<div class="seatShowInn">
						<div class="seatArea" style="margin-left: 151.5px;">
	    
							<div class="seatRow">
				 
			 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
			 					
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="1|2" alt="8101733" title="" data-num="1排1座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="1|3" alt="8101734" title="" data-num="1排2座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="1|4" alt="8101735" title="" data-num="1排3座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="1|5" alt="8101736" title="" data-num="1排4座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="1|6" alt="8101737" title="" data-num="1排5座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="1|7" alt="8101738" title="" data-num="1排6座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="1|8" alt="8101739" title="" data-num="1排7座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="1|9" alt="8101740" title="" data-num="1排8座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="1|10" alt="8101741" title="" data-num="1排9座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="1|11" alt="8101742" title="" data-num="1排10座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="1|12" alt="8101743" title="" data-num="1排11座" height="19" width="23"></span>
			 				
							</div>
				
							<div class="seatRow">
				 
			 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
			 					
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="2|2" alt="8101744" title="" data-num="2排1座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="2|3" alt="8101745" title="" data-num="2排2座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="2|4" alt="8101746" title="" data-num="2排3座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="2|5" alt="8101747" title="" data-num="2排4座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="2|6" alt="8101748" title="" data-num="2排5座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="2|7" alt="8101749" title="" data-num="2排6座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="2|8" alt="8101750" title="" data-num="2排7座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="2|9" alt="8101751" title="" data-num="2排8座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="2|10" alt="8101752" title="" data-num="2排9座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="2|11" alt="8101753" title="" data-num="2排10座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="2|12" alt="8101754" title="" data-num="2排11座" height="19" width="23"></span>
			 				
							</div>
							
							<div class="seatRow">
				 
			 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
			 					
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="3|2" alt="8101755" title="" data-num="3排1座" height="19" width="23"></span>
				 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="3|3" alt="8101756" title="" data-num="3排2座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="3|4" alt="8101757" title="" data-num="3排3座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="3|5" alt="8101758" title="" data-num="3排4座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="3|6" alt="8101759" title="" data-num="3排5座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="3|7" alt="8101760" title="" data-num="3排6座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="3|8" alt="8101761" title="" data-num="3排7座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="3|9" alt="8101762" title="" data-num="3排8座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="3|10" alt="8101763" title="" data-num="3排9座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="3|11" alt="8101764" title="" data-num="3排10座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="3|12" alt="8101765" title="" data-num="3排11座" height="19" width="23"></span>
			 				
							</div>
							
							<div class="seatRow">
				 
			 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
			 					
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="4|2" alt="8101766" title="" data-num="4排1座" height="19" width="23"></span>
				 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="4|3" alt="8101767" title="" data-num="4排2座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="4|4" alt="8101768" title="" data-num="4排3座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="4|5" alt="8101769" title="" data-num="4排4座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="4|6" alt="8101770" title="" data-num="4排5座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="4|7" alt="8101771" title="" data-num="4排6座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="4|8" alt="8101772" title="" data-num="4排7座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="4|9" alt="8101773" title="" data-num="4排8座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="4|10" alt="8101774" title="" data-num="4排9座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="4|11" alt="8101775" title="" data-num="4排10座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="4|12" alt="8101776" title="" data-num="4排11座" height="19" width="23"></span>
			 				
							</div>
							
							<div class="seatRow">
							 
				 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
				 					
				 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="5|2" alt="8101777" title="" data-num="5排1座" height="19" width="23"></span>
				 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="5|3" alt="8101778" title="" data-num="5排2座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="5|4" alt="8101779" title="" data-num="5排3座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="5|5" alt="8101780" title="" data-num="5排4座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="5|6" alt="8101781" title="" data-num="5排5座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="5|7" alt="8101782" title="" data-num="5排6座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="5|8" alt="8101783" title="" data-num="5排7座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="5|9" alt="8101784" title="" data-num="5排8座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="5|10" alt="8101785" title="" data-num="5排9座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="5|11" alt="8101786" title="" data-num="5排10座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="5|12" alt="8101787" title="" data-num="5排11座" height="19" width="23"></span>
			 				
				</div>
				
				<div class="seatRow">
				 
				 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
				 					
				 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="6|2" alt="8101788" title="" data-num="6排1座" height="19" width="23"></span>
				 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="6|3" alt="8101789" title="" data-num="6排2座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="6|4" alt="8101790" title="" data-num="6排3座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="6|5" alt="8101791" title="" data-num="6排4座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="6|6" alt="8101792" title="" data-num="6排5座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="6|7" alt="8101793" title="" data-num="6排6座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="6|8" alt="8101794" title="" data-num="6排7座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="6|9" alt="8101795" title="" data-num="6排8座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="6|10" alt="8101796" title="" data-num="6排9座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="6|11" alt="8101797" title="" data-num="6排10座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="6|12" alt="8101798" title="" data-num="6排11座" height="19" width="23"></span>
			 				
				</div>
				
				<div class="seatRow">
				 
				 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
				 					
				 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="7|2" alt="8101799" title="" data-num="7排1座" height="19" width="23"></span>
				 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="7|3" alt="8101800" title="" data-num="7排2座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="7|4" alt="8101801" title="" data-num="7排3座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="7|5" alt="8101802" title="" data-num="7排4座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="7|6" alt="8101803" title="" data-num="7排5座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="7|7" alt="8101804" title="" data-num="7排6座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="7|8" alt="8101805" title="" data-num="7排7座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="7|9" alt="8101806" title="" data-num="7排8座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="7|10" alt="8101807" title="" data-num="7排9座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="7|11" alt="8101808" title="" data-num="7排10座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="7|12" alt="8101809" title="" data-num="7排11座" height="19" width="23"></span>
			 				
				 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
				 					
				 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
				 					
				 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="7|15" alt="8101810" title="" data-num="7排12座" height="19" width="23"></span>
				 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="7|16" alt="8101811" title="" data-num="7排13座" height="19" width="23"></span>
			 				
				</div>
				
				<div class="seatRow">
				 
				 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
				 					
				 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="8|2" alt="8101812" title="" data-num="8排1座" height="19" width="23"></span>
				 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="8|3" alt="8101813" title="" data-num="8排2座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="8|4" alt="8101814" title="" data-num="8排3座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="8|5" alt="8101815" title="" data-num="8排4座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="8|6" alt="8101816" title="" data-num="8排5座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="8|7" alt="8101817" title="" data-num="8排6座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="8|8" alt="8101818" title="" data-num="8排7座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="8|9" alt="8101819" title="" data-num="8排8座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="8|10" alt="8101820" title="" data-num="8排9座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="8|11" alt="8101821" title="" data-num="8排10座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="8|12" alt="8101822" title="" data-num="8排11座" height="19" width="23"></span>
			 				
				 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
				 					
				 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
				 					
				 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="8|15" alt="8101823" title="" data-num="8排12座" height="19" width="23"></span>
				 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="8|16" alt="8101824" title="" data-num="8排13座" height="19" width="23"></span>
			 				
				</div>
				
				<div class="seatRow">
				 
				 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
				 					
				 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="9|2" alt="8101825" title="" data-num="9排1座" height="19" width="23"></span>
				 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="9|3" alt="8101826" title="" data-num="9排2座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="9|4" alt="8101827" title="" data-num="9排3座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="9|5" alt="8101828" title="" data-num="9排4座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="9|6" alt="8101829" title="" data-num="9排5座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="9|7" alt="8101830" title="" data-num="9排6座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="9|8" alt="8101831" title="" data-num="9排7座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="9|9" alt="8101832" title="" data-num="9排8座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="9|10" alt="8101833" title="" data-num="9排9座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="9|11" alt="8101834" title="" data-num="9排10座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="9|12" alt="8101835" title="" data-num="9排11座" height="19" width="23"></span>
			 				
				 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
				 					
				 					<span class="empty"><img src="<%=basePath%>/image/trans.png" height="19" width="23"></span>
				 					
				 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="9|15" alt="8101836" title="" data-num="9排12座" height="19" width="23"></span>
				 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="9|16" alt="8101837" title="" data-num="9排13座" height="19" width="23"></span>
			 				
				</div>
				
				<div class="seatRow">
				 
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|1" alt="8101838" title="" data-num="10排1座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|2" alt="8101839" title="" data-num="10排2座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|3" alt="8101840" title="" data-num="10排3座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|4" alt="8101841" title="" data-num="10排4座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|5" alt="8101842" title="" data-num="10排5座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|6" alt="8101843" title="" data-num="10排6座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|7" alt="8101844" title="" data-num="10排7座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|8" alt="8101845" title="" data-num="10排8座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|9" alt="8101846" title="" data-num="10排9座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|10" alt="8101847" title="" data-num="10排10座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|11" alt="8101848" title="" data-num="10排11座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeated" src="<%=basePath%>/image/zw_bkx.gif" id="10|12" alt="8101849" title="" data-num="10排12座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|13" alt="8101850" title="" data-num="10排13座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|14" alt="8101851" title="" data-num="10排14座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|15" alt="8101852" title="" data-num="10排15座" height="19" width="23"></span>
			 				
			 					<span class="st"><img name="hasSeat" class="hasSeat" src="<%=basePath%>/image/zw_kx.gif" id="10|16" alt="8101853" title="" data-num="10排16座" height="19" width="23"></span>
			 				
				</div>
				
			</div>
			
	<div class="mid_line" id="ml" style="left: 434.5px; height: 343px;"></div><div class="mid_line" id="ml1" style="left: 404.5px; height: 343px;"></div></div>	
	<!-- 行数 -->
	<ol class="seatRN">
	<li><p class="rwNm">1</p></li><li><p class="rwNm">2</p></li><li><p class="rwNm">3</p></li><li><p class="rwNm">4</p></li><li><p class="rwNm">5</p></li><li><p class="rwNm">6</p></li><li><p class="rwNm">7</p></li><li><p class="rwNm">8</p></li><li><p class="rwNm">9</p></li><li><p class="rwNm">10</p></li>
	</ol>
	<form name="orderForm" action="" method="post">
		<input name="rowId" id="rowId" value="9" type="hidden">
		<input name="maxSeatNum" id="maxSeatNum" value="16" type="hidden">
		<input name="chooseSeatId" id="chooseSeatId" value="111" type="hidden">
		<input name="oldOrderId" id="oldOrderId" value="" type="hidden">
		<input name="seatIdList" id="seatIdList" value="" type="hidden">
		<input name="seatParmList" id="seatParmList" value="" type="hidden">
		<input name="seqNo" id="seqNo" value="0170100000000000043091486" type="hidden">
		<input name="ticket_clientToken" id="ticket_clientToken" value="" type="hidden">
		
		<input name="batchFlag" id="batchFlag" value="n" type="hidden">
	</form>
	<script type="text/javascript">
	/*选座效果*/
	var img_url="/img/img_ticket/";
	var zw_kx=img_url+"zw_kx.gif";
	var zw_bkx=img_url+"zw_bkx.gif";
	var zw_yx=img_url+"zw_yx.gif";
	var zw_ql=img_url+"zw_ql.gif";
	var sawidth=$(".seatArea").width();
	var saheight=$(".seatArea").height();
	var siwidth=$(".seatShowInn").width();
	var ssInnLeft;
	$().ready(function(){
		var result = "";
		if(result!=null && result.length > 0){
			$(".seatchs #wxz").hide();
			$(".seatchs").prepend(result);
			var i =$(".seatchs").find("li").length-1;
			$("#seatip").html("已选择&lt;span class='redff' > "+ i +"&lt;/span > 个座位&lt;span id='cancleButton' > ，再次点击取消&lt;/span > ");
			$("#priceForUserStr").html($("#danjia").html()*i);
			$("#priceForUserAllStr").html("¥0.0");
			//tipsWindownNew("当前场次您的账户有笔未支付订单，确认继续吗？", "280", "120","1");
			//当前场次您的账户有笔未支付订单，确认继续吗？
			$("#orderForm").addClass("none");
			$("#orderFormConfirm").removeClass("none");
		}
		$('.st img').click(function(){
			getseat($(this));
		});

		var tpx = 40;
		var tpy = 50; //设置提示框相对于偏移位置，防止遮挡鼠标  
		/* $(".st img").hover(function(e) { //鼠标移上事件
			myTitle = $(this).attr("data-num"); //把title的赋给自定义属性 myTilte ，屏蔽自带提示
			var tooltipHtml = "&lt;p class='seatip patl' > " + myTitle + "&lt;img alt='' src='/img/img_ticket/ico_arrow2.png' > &lt;/p > "; //创建提示框  
			$("body").prepend(tooltipHtml); //添加到页面中  
			$(".seatip").css({
				"top": (e.pageY - tpy) + "px",
				"left": (e.pageX - tpx) + "px"
			}).show("fast"); //设置提示框的坐标，并显示  
		}, function() { //鼠标移出事件  
			// this.title = this.myTitle;  //重新设置title  
			$(".seatip").remove(); //移除弹出框  
		}).mousemove(function(e) { //跟随鼠标移动事件  
			$(".seatip").css({
				"top": (e.pageY - tpy) + "px",
				"left": (e.pageX - tpx) + "px"
			});
		}); */
	});
	/***取消座位*/
	function del(now) {
		var seatid = $(now).parents('li').attr('data-stid');
		var classname = $(now).parents('li').attr("data-stcls");
		var dfturl ;
		var seatid2;
		if(classname=="hasSeat"){
			dfturl=zw_kx;
			$(now).parents('li').remove();
			$("#"+seatid.replace("|","\\|")).attr("name",classname).attr("src",dfturl);
		/***情侣座***/
		}else if(classname == "loversHasSeatOne"){
			dfturl = zw_ql;
			seatid2=$(now).parents('li').next('li').attr('data-stid');
			$(now).parents('li').next('li').remove();
			$(now).parents('li').remove();			
			$(document.getElementById(seatid)).attr("name","loversHasSeatOne").attr("src",dfturl);
			$(document.getElementById(seatid2)).attr("name","loversHasSeatTwo").attr("src",dfturl);
			selectedSeat.remove(seatid2);
			selectedSeatId.remove($(document.getElementById(seatid2)).attr("alt"));
		}else if(classname == "loversHasSeatTwo"){
			dfturl = zw_ql;
			seatid2=$(now).parents('li').prev('li').attr('data-stid');
			$(now).parents('li').prev('li').remove();
			$(now).parents('li').remove();			
			$(document.getElementById(seatid)).attr("name","loversHasSeatTwo").attr("src",dfturl);
			$(document.getElementById(seatid2)).attr("name","loversHasSeatOne").attr("src",dfturl);
			selectedSeat.remove(seatid2);
			selectedSeatId.remove($(document.getElementById(seatid2)).attr("alt"));
		}
		var chsnum = $('.seatchs').find('li').length;
		if(chsnum  >  1){
			var i=chsnum-1;
			$("#seatip").html("已选择&lt;span class='redff' > "+ i +"&lt;/span > 个座位&lt;span id='cancleButton' > ，再次点击取消&lt;/span > ");
		}else if (chsnum == 1){
			$(".seatchs #wxz").show();
			$("#seatip").html("请先在&lt;span class='redff' > 左侧选座&lt;/span > ，每次可选&lt;span id=\"singleSeat\" > "+singleSeat+"&lt;/span > 座");
			$("#orderForm").val("请选择座位");
			$("#orderForm").removeClass("none");
			$("#orderFormConfirm").addClass("none");
		}
		selectedSeat.remove(seatid);
		selectedSeatId.remove($(document.getElementById(seatid)).attr("alt"));
		$("#seatIdList").val(selectedSeatId);
		$("#seatParmList").val(selectedSeat);
		/**计算票价小计金额**/
		calculateAmount();
	};
	//座位图展示
	$(".seatslt").hide();
	if(sawidth > siwidth){
		var url = ticket_host + "/jquery-first048.html?id="+'0170100000000000043091486';
		$.post(url,null,function(data){
		    var result = data.getElementsByTagName("item");
		    var bool = result[0].childNodes[0].nodeValue;
		    var $tip=$(bool);
			$("#seat_slt").html($tip);
			$(".stpst").show();
		});
		var seatArea_top=$(".seatArea").offset().top;
		ssInnLeft=sawidth-siwidth;
		$(".seatslt").find(".stpst").css("left","0");
		$(".seatShowInn").animate({
			scrollLeft: ssInnLeft/2
		},1500,"linear");		
		var scleft_percent;
		var pst;
		var tst;
		$(".seatShowInn").scroll(function(){
			$(".seatslt").show();
			reset_slt_top();
			$(window).scroll(function(){
				reset_slt_top();
			})
			scleft_percent=$(this).scrollLeft()/ssInnLeft;
			pst=($(".seatslt").width()-110)*scleft_percent;
			$(".stpst").css("left",pst);
			var dcscltop=$(document).scrollTop();
			if(dcscltop > seatArea_top){
				var chaheight=dcscltop-seatArea_top;
				var scTop_percent=chaheight/saheight;
				tst=($(".seatslt").height()-74)*chaheight/saheight;
				$(".stpst").css("top",tst);
			}
			clearTimeout(t1);
			t1=setTimeout(function(){
				$(".seatslt").fadeOut();
			},1000)
		});
	}else{
		ssInnLeft=siwidth-sawidth;
		$(".seatArea").css("margin-left",ssInnLeft/2);
	};
	function reset_slt_top(){
		var swp_top=$(".seatShowWp").offset().top;
		var sta_top=$(".seatArea").offset().top;
		var scltop=$(document).scrollTop();
		var chaheight=scltop-sta_top;
		
		if(scltop > swp_top){
			var top_px=50+(scltop-swp_top);
			$(".seatslt").css("top",top_px+"px");
		}
		else{
			$(".seatslt").css("top","-15px");
		}
	};
	Array.prototype.indexOf = function(val) {
    	for (var i = 0; i < this.length; i++) {
        	if (this[i] == val) return i;
    	}
    	return -1;
	};
    Array.prototype.remove = function(val) {
        var index = this.indexOf(val);
        if (index  >  -1) {
            this.splice(index, 1);
        }
    };
	function chos(now) {
		$(now).siblings('span').removeClass('chs');
		$(now).addClass('chs');
	}
	/**没用如果是情侣座就返回第二个对象**/
	function getnObjTwo(objId,classname){
		if(objId.indexOf("|")){
			var objIdArray = objId.split("|");
			var rowId = objIdArray[0];
			var columnId = objIdArray[1];
			var objTwoId ;
			var objTwo;
			if(classname == "loversCheckSeatOne"){
				 objTwoId = rowId + "\\|" + (parseInt(columnId) + 1);
				 objTwo = $("#"+objTwoId);
			}else if(classname == "loversHasSeatTwo"){
				 objTwoId = rowId + "\\|" + (parseInt(columnId) - 1);
				 objTwo = $("#"+objTwoId);
			}
			return objTwo;
		}
	}
	//弹出框
	$("#orderFormConfirm").click(function(){
		orderConfirm();
	})
	</script>
	
</div>
			</div>
		</div>
	</div>
	
</body>
</html>