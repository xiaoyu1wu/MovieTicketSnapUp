/**
 * 选座位页面
 */
$(document).ready(function() {
	hiddenNoneSeat();

	var ticketSum=0;
	var order = new Array();
	$("span.st img.hasSeat").click(function(){
		//切换图片
		$(this).attr("src", $(this).attr("src")=="image/zw_kx.gif"?"image/zw_bkx.gif":"image/zw_kx.gif");
		//加入订单
		if($(this).attr("src")=="image/zw_bkx.gif"){
			if($.cookie("userId")){
				location.href = "/MovieTicketSnapUp/user/login.htmls";
			}
			else{
				order.push($(this).attr("title"));
				ticketSum = order.length;
				$("#ticketSum").html(ticketSum);
				var danjia = parseFloat($("#danjia").html());
				$("#allprice").html(ticketSum*danjia + " 元");
			}
		}
		else{
			for(var i=0; i<order.length; ++i){
				if(order[i] == $(this).attr("title")){
					order.splice(i, 1);
				}
			}
		}
		if(order.length == 0){
			$(".slctab").show();
			$("#seatip").show();
			$(".choose-sit").html("");
		}
		else{
			$(".slctab").hide();
			$("#seatip").hide();
			$(".choose-sit").html("");
			
			for(var i=0; i<order.length; i++){
				var li_html = "<li>" + order[i] + "</li>";
				$(".choose-sit").append(li_html);
			}
		}
		
		
	});
	
	var screenId = request("screenId");
	
	showScreenInfo(screenId);

});

/**
 * 获取页面的参数值
 * @param paras
 * @returns
 */
function request(paras){
	var url = location.href;
	var paraString = url.substring(url.indexOf("?")+1,url.length).split("&");
	var paraObj = {}
	for (i=0; j=paraString[i]; i++){
		paraObj[j.substring(0,j.indexOf("=")).toLowerCase()] = j.substring(j.indexOf("=")+1,j.length);
	}
	var returnValue = paraObj[paras.toLowerCase()];
	if(typeof(returnValue)=="undefined"){
		return "";
	}else{
		return returnValue;
	}
}

/**
 * 根据排片id获取json数据
 * @param screenId
 */
function showScreenInfo(screenId){
	$.ajax({
		type:"POST",
		url : "http://localhost:8080/MovieTicketSnapUp/screen/getScreenInfo.htmls",
		data : {
			"screenId" : screenId
		},
		async:true,
		success:function(data, state){
			var screen = $.parseJSON(data);
			$("#changci").html("场次：" + screen.changci);
			$("#moviePath").attr("src", screen.moviePath);
			$("#seatSum").html(screen.seatSum);
			$("#endTime").html("预计结束时间： " + screen.endTime);
			$("#cinemaName").html("电影院: " + screen.cinemaName);
			$("#language").html("语言： " + screen.language);
			$("#movieName").html("电影名： " + screen.movieName);
			$("#leftSeatCount").html(screen.leftSeatCount);
			$("#danjia").html(screen.danjia);
		}
		
	});
}

/**
 * 隐藏不存在的座位号
 */
function hiddenNoneSeat(){
	var noneSeats = $("#noneSeats").val();
	var noneArry = noneSeats.split(",");
	for(var i=0; i<noneArry.length; i++){
		$("#"+noneArry[i]).removeClass("hasSeat");
		$("#"+noneArry[i]).parent().removeClass("st").addClass("empty");
		$("#"+noneArry[i]).attr("src", "image/trans.png");
		$("#"+noneArry[i]).attr("disabled", "true");
	}
}