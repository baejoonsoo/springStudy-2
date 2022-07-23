<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>회원목록</title>
</head>
<body>
	<h1>회원목록</h1>
	<h1>${user_id}</h1>

	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>아이디</th>
				<th>이름</th>
				<th>폰번</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="vo" items="${vos}">
				<tr>
					<td>${vo.num}</td>
					<td><a href="update.do?id=${vo.id}">${vo.id}</a></td>
					<td>${vo.name}</td>
					<td>${vo.tel}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>
