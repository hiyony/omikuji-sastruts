
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String birthday = (String) session.getAttribute("birthday");
%>

<html>
<head>
<meta charset="UTF-8">
<title>Omikuji Web Service</title>
</head>
<body>
	<h1>今日の運勢はどうですか？</h1>
	今日の運勢は「<%= birthday %>」です！
	<div id = "list">
		<ul>
			<li>願い事 : </li>
			<li>商い : </li>
			<li>学問 : </li>
		</ul>
	</div>
		<br><input type = "button" value = "戻る" onclick = "location.href = '/omikuji-sastruts/input/'">
</body>
</html>