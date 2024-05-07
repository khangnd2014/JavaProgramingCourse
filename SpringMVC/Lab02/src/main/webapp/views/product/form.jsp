<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bai 4</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<style>
.main {
	padding: 50px;
	margin: 0 auto;
}

button {
	margin-top: 10px;
}
</style>

	<div class="main">
		<div class="container">
			<form action="/product/save" method="post">
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Name
						Product: </label> <input name="name" value="${name}" class="form-control">
				</div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Price
						Product: </label> <input name="price" value="${price}"
						class="form-control">
				</div>
				<button type="submit" class="btn btn-primary mb-3">Save</button>
			</form>


			<h4>Product name: ${name}</h4>
			<h4>Product price: ${price}</h4>

		</div>
		<hr>
		<h5><strong>Product 1</strong></h5>
		<h5>Name: ${product1.name }</h5>
		<h5>Price: ${product1.price }</h5>

		<hr>
		<div style="display: flex;">
			<c:forEach var="item" items="${items}">
				<div class="card" style="width: 200px; margin: 0px 5px" >
					<div class="card-header primary">
						<h5>${item.name}</h5>
					</div>
					<div class="card-body">
						<p class="card-text">Price: ${item.price}</p>
					</div>
				</div>
			</c:forEach>
		</div>


	</div>

</body>
</html>