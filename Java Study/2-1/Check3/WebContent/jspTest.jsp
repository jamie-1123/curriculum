<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>



<div style="padding-top: 50px; padding-bottom: 50px;">
	<!-- name、idの入力エリアを作成しなさい -->
<table>
	<tr>
		<th><label for="name">name</label></th>
		<td><input type="text" name="name" id="id"></td>
	</tr>
	<tr>
		<th>id</th>
		<td><input type="text" name="name" id="id"></td>
	</tr>
</table>
</div>

	<%@ include file="footer.jsp" %>
</body>
</html>