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
			padding: 50px ;
			display: flex;
			justify-content: center;
			margin: 0 auto;
		}
	</style>

	<div class="main">
		<div class="container">
			<form action="/ctrl/ok" method="post">
				<button class="btn btn-primary">Primary</button>

				<button formmethod="get" class="btn btn-success">Success</button>

				<button formaction="/ctrl/ok?x" class="btn btn-warning">Warning</button>

			</form>
			<h3>Kết quả: ${result}</h3>
		</div>
	</div>

</body>
</html>