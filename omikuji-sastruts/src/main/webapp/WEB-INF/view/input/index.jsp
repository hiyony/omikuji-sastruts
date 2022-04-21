<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji Web Service</title>
<style>
	body{
		text-align : center;
	}
	input {
		padding : 5px 10px;
		text-align : center;
	}
	div {
		color : red;
	}
</style>
</head>
<body>
	<h1>Omikuji Web Service</h1>
	
	<s:form>
		<span>お誕生日を入力してください！</span>
		<html:text property = "birthday" /> (yyyyMMddの形式)
		<html:errors property = "birthday" />
		<input type = "submit"
			   name = "btn"
			   value = "確認"
			   formaction = "<%= request.getContextPath() %> /InputAction"
			   formmethod = "POST" />
		<div>
			<html:errors />
		</div>
		<br><br>
		上にお誕生日を入力してクリックしてください！<br>
		<input type = "submit" 
			   name = "btn"
			   value = "過去半年の結果リスト"
			   formaction = "<%= request.getContextPath() %> /HalfAction"
			   formmethod = "POST" />
		<input type = "submit"
			   name = "btn"
			   value = "過去半年のおみくじ割合" 
			   formaction = "<%= request.getContextPath() %> /PercentAction"
			   formmethod = "POST" />
	</s:form>
</body>
</html>