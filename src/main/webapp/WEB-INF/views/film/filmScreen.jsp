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
<title>排片</title>

<base href="<%=basePath%>" />
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery-1.9.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.cookie.js"></script>

</head>
<body>
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>时间</th>
				<th>语言</th>
				<th>放映厅</th>
				<th>影院价格</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody id="screenList">
		</tbody>
	</table>
	<%-- <tr>
        <td colspan="6" align="center" bgcolor="#5BA8DE">共${page.totalRecords}条记录 共${page.totalPages}页 当前第${page.pageNo}页<br>
            
            <a href="${path}/course/showAll.do?pageNo=${page.topPageNo }"><input type="button" name="firstPage" value="首页" /></a>
            <c:choose>
              <c:when test="${page.pageNo!=1}">
                
                  <a href="/MovieTicketSnapUp/course/showAll.do?pageNo=${page.previousPageNo }"><input type="button" name="previousPage" value="上一页" /></a>
                
              </c:when>
              <c:otherwise>
                
                  <input type="button" disabled="disabled" name="previousPage" value="上一页" />
                
              </c:otherwise>
            </c:choose>
            <c:choose>
              <c:when test="${page.pageNo != page.totalPages}">
                <a href="${path}/course/showAll.do?pageNo=${page.nextPageNo }"><input type="button" name="nextPage" value="下一页" /></a>
              </c:when>
              <c:otherwise>
                
                  <input type="button" disabled="disabled" name="nextPage" value="下一页" />
                
              </c:otherwise>
            </c:choose>
            <a href="${path}/course/showAll.do?pageNo=${page.bottomPageNo }"><input type="button" name="lastPage" value="尾页" /></a>
        </td>
  	</tr>			 --%>
	<script src="js/filmScreen.js"></script>
</body>
</html>