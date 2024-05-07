<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bai 2</title>
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

button{
	margin-top: 10px;
}
</style>

	<div class="main">
		<div class="container">
			<form action="/param/save/2021" method="post">
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Y Value:
					</label> 
					<input name="y" value="${yVal}" class="form-control">
				</div>
				 <button type="submit" class="btn btn-primary mb-3">Confirm</button>

			</form>
			<h3>X: ${x}</h3>
			<h3>Y: ${y}</h3>
		</div>
	</div>

</body>
</html>