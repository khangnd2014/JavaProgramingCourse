<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bai 1</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<style>
.main {
	padding: 50px;
	display: flex;
	justify-content: center;
	margin: 0 auto;
}
</style>

	<div class="main">
		<div class="container">
			<h1>${message}</h1>
			<h1>${param.message}</h1>
		</div>
	</div>

</body>
</html>