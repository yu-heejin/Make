<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<title>로그인성공</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<script>
			function findName(str) {
				if(str == member_id[0]) {
					return member_name[0];
				}
			}
		</script>
		
		<style>
			p {
				border-style:double;
				border-color:#cd77fc;
				border-width:2px;
				box-shadow:2px 2px 3px 2px gray;
				padding:5px;
				border-top-left-radius:15px;
				border-bottom-right-radius:15px;
			}
			
			p:hover {
				box-shadow:none;
			}
		</style>
		<link type="text/css" rel="stylesheet" href="style.css"></link>
	</head>
	<body>
	<script src="list.js"></script>
	<center>
		<form name="logForm" action="index.html" target="_top">
			<fieldset>
				<script>
					<% String strID=request.getParameter("id"); %>
					var strName = "<%=strID%>";
					document.write(findName(strName) + "님");
				</script>
				<hr>
				<button>마이페이지</button>
				<button>로그아웃</button>
			</fieldset>
		</form>
		<br>
		<p><a href="#" onclick="javascript:window.open('inform_category.html','')"><b>Information</b></a></p>
		<p><a href="#" onclick="javascript:window.open('shop_category.html','')"><b>Shopping mall</b></a></p>
		<p><a href="#" onclick="javascript:window.open('hos_category.html','')"><b>Hospital</b></a></p>
		
	</center>
	</body>
</html>