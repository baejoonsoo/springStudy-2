<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 정보 수정</title>
<script type="text/javascript">
	window.onload = function() {
		var btn_idCheck = document.getElementById("idCheck");
		btn_idCheck.onclick = function(event) {
			console.log("onclick....");
			event.preventDefault();
		};
	};
</script>
</head>
<body>
	<h1>내 정보 수정</h1>

	<form action="updateOK.do" method="post">
		<table>
			<tr>
				<th>번호</th>
				<td><input type="text" name="num" value="${vo2.num}" hidden>${vo2.num}</td>
			</tr>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id" value="${vo2.id}" hidden>${vo2.id}</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pw" value="${vo2.pw}"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" value="${vo2.name}"></td>
			</tr>
			<tr>
				<th>폰번</th>
				<td><input type="text" name="tel" value="${vo2.tel}"></td>
			</tr>
			<tr>
				<td><button>업데이트 완료</button></td>
			</tr>
		</table>
	</form>
</body>
</html>