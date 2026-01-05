<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Admin Login - Quiz Portal</title>
<style>
/* Reset and basics */
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Roboto', Arial, sans-serif;
}

body, html {
	height: 100%;
	background: linear-gradient(135deg, #ffecd2, #fcb69f);
	display: flex;
	align-items: center;
	justify-content: center;
	color: #333;
}

.login-container {
	background: #fff;
	border: 1px solid #ddd;
	border-radius: 8px;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.08);
	max-width: 800px;
	width: 90%;
	display: flex;
	overflow: hidden;
	min-height: 380px;
}

.login-image {
	flex: 1;
	background: #e0e7ef;
	display: flex;
	align-items: center;
	justify-content: center;
	padding: 30px;
}

.login-image img {
	width: 180px;
	height: 180px;
	border-radius: 50%;
	object-fit: cover;
	border: 4px solid #fff;
	box-shadow: 0 2px 6px rgba(0, 0, 0, 0.15);
}

.login-form {
	flex: 1;
	padding: 50px 40px;
	display: flex;
	flex-direction: column;
	justify-content: center;
}

h2 {
	font-size: 28px;
	margin-bottom: 30px;
	font-weight: 600;
	color: #222;
	text-align: center;
}

.form-group {
	margin-bottom: 22px;
}

label {
	display: block;
	margin-bottom: 6px;
	font-weight: 500;
	color: #555;
	font-size: 14px;
}

input[type="text"], input[type="password"] {
	width: 100%;
	padding: 12px 14px;
	border: 1px solid #ccc;
	border-radius: 6px;
	font-size: 15px;
	transition: border-color 0.2s ease, box-shadow 0.2s ease;
}

input[type="text"]:focus, input[type="password"]:focus {
	border-color: #0077cc;
	outline: none;
	box-shadow: 0 0 6px rgba(0, 119, 204, 0.3);
}

.btn-login {
	width: 100%;
	padding: 14px;
	background: #0077cc;
	border: none;
	border-radius: 6px;
	font-size: 16px;
	font-weight: 600;
	color: #fff;
	cursor: pointer;
	transition: background 0.3s ease, transform 0.2s ease;
}

.btn-login:hover {
	background: #005fa3;
	transform: translateY(-2px);
}

.error {
	background: #ffecec;
	color: #cc0000;
	padding: 12px 16px;
	border-radius: 6px;
	margin-bottom: 20px;
	font-weight: 500;
	border: 1px solid #f5c2c2;
}

@media ( max-width : 720px) {
	.login-container {
		flex-direction: column;
		min-height: auto;
	}
	.login-image, .login-form {
		flex: none;
		width: 100%;
		padding: 30px 20px;
	}
	.login-image {
		border-radius: 8px 8px 0 0;
	}
	.login-form {
		border-radius: 0 0 8px 8px;
	}
}
</style>

</head>
<body>

	<div class="login-container">
	
		<div class="login-image">
			<img src="https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
				alt="Admin" width="180" height="180" />


		</div>
		<div class="login-form">
			<h2>Welcome Back!</h2>
			<%
			if (request.getAttribute("error") != null) {
			%>
			<div class="error"><%=request.getAttribute("error")%></div>
			<%
			}
			%>
			<form action="${pageContext.request.contextPath}/admin/login"
				method="post" autocomplete="off">
				<div class="form-group">
					<label for="username">User Name</label> <input type="text"
						id="username" name="username" required autofocus />
				</div>
				<div class="form-group">
					<label for="password">Password</label> <input type="password"
						id="password" name="password" required />
				</div>
				<button type="submit" class="btn-login">Login</button>
			</form>
		</div>
	</div>
</body>
</html>
