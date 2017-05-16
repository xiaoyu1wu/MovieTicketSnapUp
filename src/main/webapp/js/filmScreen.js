/**
 * 电影排片表页面
 */
$(document).ready(function() {
	var movieName = $.cookie("movieName");
	var cinemaId = 1;
	if($.cookie("cinemaId")){
		cinemaId = $.cookie("cinemaId");
	}
	
//	showScreenSchedule(getNowDate(), cinemaId ,movieName);
	showScreenSchedule("2017-03-27", cinemaId ,movieName);
});

/*function showMovies(movies) {
	var res_cinema = $(".res_cinema");

	var new_rs_movie_in = $(".rs_movie_in").filter("[style='display: none;']").clone();
	new_rs_movie_in.removeAttr("style");

	var res_movie_pic = new_rs_movie_in.children(".res_movie_pic");
	res_movie_pic.find("a").find("img").attr("src", "image/shenghuaweiji.jpg");
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
}*/

/**
 * 根据日期、电影、电影院加载排片
 */
function showScreenSchedule(day, cinemaId, movie) {
	$.ajax({
				type : "POST",
				url : "http://localhost:8080/MovieTicketSnapUp/screen/getScreenList.htmls",
				data : {
					"day" : day,
					"cinemaId" : cinemaId,
					"movie" : movie
				},
				async : true,
				success : function(data, textStatus) {
					var screens = $.parseJSON(data);
					$("#screenList").empty();//清空列表
					if (screens.length == 0) {
						var tr = "<tr>" 
							+ "<td colspan='5'>暂无数据</td>"
							+ "</tr>";
						$("#screenList").append(tr);
					} else {
						for (var i = 0; i < screens.length; i++) {
							var tr = "<tr>";
							tr += "<td>" + renderTime(screens[i].openTime) + "</td>";
							tr += "<td>" + screens[i].movie.language + "</td>";
							tr += "<td>" + screens[i].hall.hallId + "号厅" + "</td>";
							tr += "<td>" + screens[i].movie.price*screens[i].discount + "元" + "</td>";
							tr += "<td>" + "<a href='javascript:void(0)' onclick='buyTicket("
									+ screens[i].screenId + ")'>选座购票</a></td>";
							tr += "</tr>";
							$("#screenList").append($(tr));
						}
					}

				},
				error : function(data) {
					alert("json报错");
				}
			});
}

//获取当前日期
function getNowDate() { 
	var today = new Date();       
	var day   = today.getDate();    
	 
	//获取当前日(1-31)                
	var month = today.getMonth() + 1;//显示月份比实际月份小1,所以要加1   
	var year  = today.getFullYear();   
	 
	//获取完整的年份(4位,1970-????) 
	month     = month<10?"0"+month:month;//数字<10，实际显示为，如5，要改成05   
	day       = day<10?"0"+day:day;    
	var date  = year + "-" + month + "-" + day; 
	var date2 = year + "-" + month + "-" + day; 
	
	return date;
}


/**
 * 根据电影院选座位
 * @param screensId
 */
function buyTicket(screensId){
	window.open("http://localhost:8080/MovieTicketSnapUp/cinema/showSeatPlan.htmls?screenId=" + screensId);
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