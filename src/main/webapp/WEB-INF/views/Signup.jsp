<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Signup Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<h2 class="text-center">Signup</h2>
				<form action="saveuser" method="post">
					<div class="mb-3">
						<label for="firstName" class="form-label">First Name</label> <input
							type="text" class="form-control" value="${user.firstName}" name="firstName"
							placeholder="Enter your first name"> <span
							class="text-danger">
							${result.getFieldError("firstName").getDefaultMessage()}</span>
					</div>
					<div class="mb-3">
						<label for="lastName" class="form-label">Last Name</label> <input
							type="text" class="form-control" name="lastName"  value="${user.lastName}" 
							placeholder="Enter your last name"> <span
							class="text-danger">
							${result.getFieldError("lastName").getDefaultMessage()} </span>
					</div>
					<div class="mb-3">
						<label for="email" class="form-label">Email address</label> <input
							type="text" class="form-control" name="email"  value="${user.email}" 
							placeholder="Enter your email"> <span class="text-danger">
							${result.getFieldError("email").getDefaultMessage()} </span>
					</div>
					<div class="mb-3">
						<label for="password" class="form-label">Password</label> <input
							type="password" class="form-control" name="password"
							placeholder="Enter your password"> <span
							class="text-danger">
							${result.getFieldError("password").getDefaultMessage()} </span>
					</div>
					<button type="submit" class="btn btn-primary w-100">Sign
						Up</button>
				</form>
				<a href="login">Login</a>

			</div>

		</div>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
