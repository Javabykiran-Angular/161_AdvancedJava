<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="/bootstrap/bootstrap.css" rel="stylesheet">
</head>
<body>
<h2>Hi Welcome to MVC</h2>

	<div class="container">
		<div class="row">
			<div class="col-2 col-sm-4 col-md-6">
			
				<form action="login" method="post">
				
				<div class="mb-3 mt-2">
					<label>Username::</label>
					<input type="text" name="username"  class="form-control" placeholder="Enter the Username"><br>
					
					<label>Password::</label>
					<input type="password" name="password" class="form-control" placeholder="Enter the Password"><br>
					
					<button class="btn btn-success" >Login</button>
				</div>
				</form>
				<br>
				<h2> ${msg}  </h2>
				
			</div>
		</div>
	</div>
	

	


</body>
</html>