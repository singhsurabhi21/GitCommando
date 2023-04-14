<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="style.css">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login System</title>

</head>
<body>

	<br>
	<br>
	<form action="login" method="get">
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card-group mb-0">
					<div class="card p-4">
						<div class="card-body">
							<h1>Login</h1>
							<p class="text-muted">Sign In to your account</p>
							<div class="input-group mb-3">
								<span class="input-group-addon"><i class="fa fa-user"></i></span>
								<input type="text" class="form-control" placeholder="Username" name="admin" required>
							</div>
							<div class="input-group mb-4">
								<span class="input-group-addon"><i class="fa fa-lock"></i></span>
								<input type="password" class="form-control"
									placeholder="Password" name="admin" required>
							</div>
							<div class="row">
								<div class="col-6">
									<button type="button" class="btn btn-primary px-4">Login</button>
								</div>
								<div class="col-6 text-right">
									<button type="button" class="btn btn-link px-0">Forgot
										password?</button>
								</div>
							</div>
						</div>
					</div>
					<div class="card text-white bg-primary py-5 d-md-down-none"
						style="width: 44%">
						<div class="card-body text-center">
							<div>
								<h2>Sign up</h2>
								<p>Register Yourself</p>
								<button type="button" class="btn btn-primary active mt-3">Register
									Now!</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</form>

</body>
</html>