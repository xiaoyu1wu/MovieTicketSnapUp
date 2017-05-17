/**
 * 用户管理页面
 */
$(document).ready(function() {

	showUserList();
});

/**
 * 展示所有用户信息
 */
function showUserList() {
	$
			.ajax({
				type : "GET",
				url : "http://localhost:8080/MovieTicketSnapUp/admin/getUserList.htmls",
				data : {

				},
				async : true,
				success : function(data, textStatus) {
					var users = $.parseJSON(data);
					$("#userList").empty();// 清空列表
					if (users.length == 0) {
						var tr = "<tr>" + "<td colspan='11'>暂无数据</td>"
								+ "</tr>";
						$("#userList").append(tr);
					} else {
						for (var i = 0; i < users.length; i++) {
							if(!users[i].userUsername){
								users[i].userUsername = "无";
							}
							if(!users[i].userNickname){
								users[i].userNickname = "无";
							}
							if(!users[i].userSex){
								users[i].userSex = "无";
							}
							if(!users[i].userAge){
								users[i].userAge = "无";
							}
							if(!users[i].userPhone){
								users[i].userPhone = "无";
							}
							if(!users[i].userBirthday){
								users[i].userBirthday = "无";
							}
							else{
								users[i].userBirthday = renderDate(users[i].userBirthday);
							}
							if(!users[i].userBornCity){
								users[i].userBornCity = "无";
							}
							if(!users[i].userLivingCity){
								users[i].userLivingCity = "无";
							}
							var tr = "<tr>";
							tr += "<td>" + users[i].userId + "</td>";
							tr += "<td>" + users[i].userEmail + "</td>";
							tr += "<td>" + users[i].userUsername + "</td>";
							tr += "<td>" + users[i].userNickname + "</td>";
							tr += "<td>" + users[i].userSex + "</td>";
							tr += "<td>" + users[i].userAge + "</td>";
							tr += "<td>" + users[i].userPhone + "</td>";
							tr += "<td>" + users[i].userBirthday + "</td>";
							tr += "<td>" + users[i].userBornCity + "</td>";
							tr += "<td>" + users[i].userLivingCity + "</td>";
							tr += "<td>"
									+ "<a class='btn-primary' href='javascript:void(0)' onclick='updateUserPage("
									+ users[i].userId
									+ ")'>修改</a>"
									+ "&nbsp;&nbsp;&nbsp;"
									+ "<a class='btn-primary' href='javascript:void(0)' onclick='deleteUser("
									+ users[i].userId + ")'>删除</a>" + "</td>";
							tr += "</tr>";
							$("#userList").append($(tr));
						}
					}

				},
				error : function(data) {
					alert("json报错");
				}
			});
}

//格式化时间：yyyy-MM-dd
function renderDate(data) {
	var da = eval("new Date(" + data +")");
	return da.toLocaleDateString();
}