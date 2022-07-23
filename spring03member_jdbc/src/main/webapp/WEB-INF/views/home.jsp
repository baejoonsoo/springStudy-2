<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>로그인</h1>
	<h1>${user_id}</h1>

	<c:choose>
		<c:when test="${user_id == null}">
			<form action="loginOK.do" method="post">
				<table>
					<tr>
						<th>아이디</th>
						<td><input type="text" name="id" value="admin"></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" name="pw" value="hi1234"></td>
					</tr>
					<tr>
						<td><input type="submit" value="로그인"></td>
					</tr>

				</table>
			</form>
			<p>
				<a href="insert.do">회원가입</a>
			</p>
		</c:when>
		<c:otherwise>
			<p>
				<a href="logout.do">로그아웃</a>
			</p>
			<p>
				<a href="update.do?id=${user_id}">내정보 수정</a>
			</p>
			<p>
				<a href="deleteOK.do?id=${user_id}">회원탈퇴</a>
			</p>
			<p>
				<a href="selectList.do">회원목록</a>
			</p>
		</c:otherwise>
	</c:choose>



</body>
</html>
