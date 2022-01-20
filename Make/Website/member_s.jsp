<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입이 완료되었습니다.</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link type="text/css" rel="stylesheet" href="style.css"></link>
		<script>
		function winClose() {
			window.open('','_self').close();     
		}
		</script>
	</head>
	<body>
	<center>
		<script>
			<% 
				request.setCharacterEncoding("UTF-8");
				String strID=request.getParameter("mem_id");
				String strName=request.getParameter("mem_name");
			%>
		</script>
		
		<h1>회원가입이 완료되었습니다</h1>
		<hr>
			<% out.println(strName); %>님, 가입을 환영합니다!
		<br><br>
			<button onclick="winClose()">닫기</button>
	</center>
	</body>
</html>