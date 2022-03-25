<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
		<div>
			<h3>${boardid}게시판 목록</h3>
		</div>
		<div>
			<table border="1">
				<thead>
					<tr>
						<th>번호</th>
						<th>저목</th>
						<th>관리</th>
					</tr>
				</thead>
				<tbody>
					<c:if test="${list.size() < 1 }">
					<tr>
						<td colspan="3">등록 된 게시판이 없습니다</td>
					</tr>
					</c:if>
					<c:forEach var="item" items="${list}">
					<tr>
						<td>${item.articleid}</td>
						<td><a href="view/${item.articleid}">${item.subject}</a> </td>
						<td><a href="update/${item.articleid}">변경</a> <a href="delete/${item.articleid}">삭제</a> </td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div>
			<a href="add">등록</a>
		</div>
	</div>
</body>
</html>