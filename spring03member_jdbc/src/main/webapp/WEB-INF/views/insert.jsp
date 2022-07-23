<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="resources/jquery-3.6.0.min.js"></script>
<script>
	$(function() {
		console.log('onload');

		$('#idCheck').on('click', function() {
			console.log('click');

			$.ajax({
				url : 'http://localhost:8090/jdbc/idCheck.do',
				type : 'get',
				data : {id:$("#id").val()},
				dataType : "text",
				success : function(responseData) {
					console.log('success');
					console.log(responseData);//[]

					$('#result').text(responseData);

				},
				error : function(jqXHR, textStatus, errorThrown) {
					alert("ajax error : " + textStatus + "\n" + errorThrown);
				}
			});
			
			return false;
		});
	});
</script>
</head>
<body>
	<h1>회원가입</h1>

	<form action="insertOK.do" method="post">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id"  id="id" value="admin"></td>
				<td><button id="idCheck">중복체크</button><span id="result"></span></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pw" value="hi1234"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" value="kim"></td>
			</tr>
			<tr>
				<th>폰번</th>
				<td><input type="text" name="tel" value="010"></td>
			</tr>
			<tr>
				<td><input type="submit" value="가입완료"></td>
			</tr>

		</table>
	</form>
</body>
</html>