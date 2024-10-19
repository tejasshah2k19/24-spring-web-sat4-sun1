<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add New Product</title>
<!-- Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container mt-5">
		<h2 class="text-center">Add New Product</h2>

		<form action="saveproduct" method="post" class="mt-4">
			<!-- Product Name -->
			<div class="form-group">
				<label for="name">Product Name</label> <input type="text"
					class="form-control" id="name" name="name"
					placeholder="Enter product name" required>
			</div>

			<!-- Product Category -->
			<div class="form-group">
				<label for="category">Category</label> <select class="form-control"
					id="category" name="category">
					<option value="electronics">Electronics</option>
					<option value="fashion">Fashion</option>
					<option value="home">Home & Living</option>
					<option value="beauty">Beauty</option>
					<option value="sports">Sports</option>
				</select>
			</div>

			<!-- Product Price -->
			<div class="form-group">
				<label for="price">Price</label> <input type="text"
					class="form-control" id="price" name="price"
					placeholder="Enter product price" required>
			</div>

			<!-- Product Quantity -->
			<div class="form-group">
				<label for="qty">Quantity</label> <input type="text"
					class="form-control" id="qty" name="qty"
					placeholder="Enter product quantity" required>
			</div>

			<!-- Product Discount -->
			<div class="form-group">
				<label for="discount">Discount (RS)</label> <input type="text"
					class="form-control" id="discount" name="discount"
					placeholder="Enter discount percentage" required>
			</div>

			<!-- Submit Button -->
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

	<!-- Bootstrap JS and dependencies -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
