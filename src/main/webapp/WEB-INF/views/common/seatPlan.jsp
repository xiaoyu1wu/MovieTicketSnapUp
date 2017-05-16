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
<title>选座位</title>

<base href="<%=basePath%>">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery-1.9.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.cookie.js"></script>
<link rel="stylesheet" href="css/mynav.css">
<link rel="stylesheet" href="css/body.css">
<link rel="stylesheet" href="css/seatPlan.css">

</head>
<body>
	<div class="container">
		<jsp:include page="/WEB-INF/views/common/navigation.html"></jsp:include>
		<div class="row clearfix">
			<div class="col-md-8 column">
				<div style="margin-top: 65px; margin-bottom: 5px">
				</div>
				<div class="choose w860" id="ypxx">
					<div class="choose-film">
						<a href="" target="_blank" title="">
						<img id="moviePath" src="" onerror="javascript:this.src='http://pic.spider.com.cn/pic//common/images/film_mobile.jpg'" class="fl " width="60" height="80"></a>
						<div class="fl ml10 pr h70 w178">
							<h2 class="f16 fb fs0"><a id="movieName" href="" class="fs2b_a" target="_blank" title="">摔跤吧！爸爸</a></h2>
						</div>
					</div>
					<div class="choose-info pt5 patr5">
						<ul class="clear  f14">
							<li class="fs0 chfo1" id="cinemaName" title="">影院：</li>
							<li class="fs0 chfo2" id="language">语言/版本：印度语&nbsp;2D </li>
							<li class="redfc chfo1" id="changci">场次：</li>
							<li class="fs7e pr chfo2">
							 
								<div class="fl" id="endTime">预计21:40散场</div>
								<div id="ghcc" class="fl ml10">
									<div id="ghBtn" class="choose-icon back_blue">
										<span class="w63 tc fl">更换场次</span>
										<div class="choose-icon-xl fr white_bg ">
											<i></i>
										</div>
									</div>
									<div class="choose-session bdc9 fs0" style="display: none;">
											<div class="gb fw fs9 pa" id="gb">x</div>
											<div class="back_bluetwo pl10 lh38 bdb_blue">
												05月15日
	                						                (星期一)
	                						            </div>
											<ul>
												<li>
												 <a href="">		
													<span class="tc" style="width:50px;">15:40</span>    
													<span class="tc" style="width:30px;">2D</span>
													<span class="tc" style="width:85px;">印度语</span>  
													<span class="tc" style="width:80px;"> 6号厅  </span>    
													<span class="tc mt7" style="width:30px;"> <img class="seatmin" id="0170100000000000045913905" src="/img/common/trans.png" width="18" height="13">  </span>    
				                                    <span class="w60"><s>100.0</s><em class="redfc">53</em></span>
				                                  	</a>
												</li>
											</ul>
											<input type="submit" name="button" id="yyh" value="+ 展开全部" class="choose-icon back_blue ml130 mt15 mb20">
					   	  			</div>
								</div>
							</li>
			     		</ul>
						<p class="fs9 fl ml10"></p>
					</div>
				</div>
				
				<h3 style="float:left">请选座：</h3>
				<div class="seatShowsct" id="resultSeat_jquery" style="">
					<div class="seatShowInn">
						<div>
							总共<span><i id="seatSum"></i>座位,&nbsp;&nbsp;&nbsp;</span><span>剩余<i id="leftSeatCount"></i>座位</span>
						</div>
						<div class="seatArea"
							style="margin-left: 151.5px; margin-top: 10px;">
							<c:if test="${not empty requestScope.hall}">
								<input type="hidden" value="${hall.noneSeats}" id="noneSeats" />
								<c:forEach begin="1" end="${hall.rows}" var="i">
									<div class="seatRow">
	
										<c:forEach begin="1" end="${hall.cols}" var="j">
											<span class="st"><img class="hasSeat"
												src="image/zw_kx.gif" title="${i}排${j}座"
												data-num="${i}_${j}" id="${i}_${j}" height="19" width="23"
												style="margin: 5px"></span>
										</c:forEach>
									</div>
								</c:forEach>
							</c:if>
						</div>
					</div>
				</div>

			</div>
			<div class="col-md-4">
				<div id="right" style="margin-top: 0px;">
					<div class="choose-seat bdb_blue">
						<h3 class="fb f14 fst">您选择的座位：</h3>
						<ul class="clear choose-sit redfc seatchs" id="selectSeatStr">
							<li class="slctab" id="wxz">还未选择座位</li>
						</ul>
						<p id="seatip" class="mt10 fst">
							请先在<span class="redff">左侧选座</span>
						</p>
					</div>

					<div class="bdb_blue mt10 p10 fs0" id="mobileinfo">
						<h3 class="f14 fb">请输入取票的手机号码：</h3>
						<table class="mt20">
							<colgroup>
								<col width="60">
								<col width="*">
							</colgroup>
							<tbody>
								<tr>
									<td class="f14">手机号：</td>
									<td><input type="text" name="mobile" id="mobile" value="" class="ipTxt1 bdc9 w178" maxlength="11"></td>
								</tr>
								<tr>
									<td class="f14" height="70">验证码：</td>
									<td>
										<input type="text" id="vericode" name="vericode" class="ipTxt1 bdc9 w63 fl" onkeydown="InputOnkeydown();" maxlength="4"> 
										<img src="http://film.spider.com.cn/verifycode.jsp" id="verifycode_id_login" class="fl ml5"	onclick="randomidbetter(this)" width="76" align="left" height="37"> 
										<a onclick="jQuery('#verifycode_id_login').click();" href="javascript:void(0)" class=" mt15 ml5 fl fs6e_a">换一张</a>
									</td>
								</tr>
							</tbody>
						</table>
					</div>

					<div class="mt20 choose-tik fs0 pr">
						票数：<span id="ticketSum">0</span>（单价¥<span id="danjia"></span>）

						<br> 小计：<span class="redff f18" id="allprice">0 元</span>
					</div>
					<div style="margin-top:10px">
						<a class="btn btn-primary" onclick="orderTicket()"> 提交订单  </a>
					</div>
					
					<a href="javascript:void(0)" class="ib gray_btn fs9 tc w224" id="orderForm">请选择座位</a> 
					<a href="javascript:void(0)" class="ib red_btn w224 tc none" id="orderFormConfirm">提交订单</a> 
					<a href="javascript:void(0)" class="ib red_btn w254 tc none" onclick="orderConfirmNew('2-zhankai-nojoinbutton');"id="orderFormConfirming">不参加0元购，去提交订单</a> 
					<a href="javascript:void(0)" class="ib red_btn fs9 w224 tc red_dj none" id="zhankai-nobutton-2">订单正在提交中..	&gt;&gt;</a> 
					<a href="javascript:void(0)" class="ib w224 red_btn tc none" onclick="orderConfirmNew('0yuan')"	id="0yuanConfirm">确认并提交订单</a>

					<!-- 邀约提示div -->
					<div class="choose-shw mt10 pr" style="display: none"></div>

				</div>

			</div>
		</div>
	</div>
	<script src="js/seat.js"></script>
</body>
</html>