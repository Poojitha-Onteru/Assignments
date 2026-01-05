<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Login - Quiz Portal</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', Arial, sans-serif;
}

body {
	min-height: 100vh;
	background: linear-gradient(135deg, #ffecd2, #fcb69f);
	display: flex;
	align-items: center;
	justify-content: center;
	padding: 20px;
	color: #222;
}

/* Card */
.glass-card {
	background: #fff;
	border-radius: 16px;
	box-shadow: 0 8px 24px rgba(0, 0, 0, 0.2);
	padding: 40px 30px;
	width: 100%;
	max-width: 380px;
	animation: fadeIn 0.8s ease;
}

@
keyframes fadeIn {from { opacity:0;
	transform: translateY(20px);
}

to {
	opacity: 1;
	transform: translateY(0);
}

}
.glass-card h2 {
	font-size: 26px;
	font-weight: 700;
	margin-bottom: 25px;
	text-align: center;
	color: #1e3c72;
}

/* Form */
.form-group {
	margin-bottom: 18px;
}

label {
	font-size: 14px;
	font-weight: 600;
	margin-bottom: 6px;
	display: block;
	color: #333;
}

input[type="email"], input[type="password"] {
	width: 100%;
	padding: 12px 14px;
	border: 1px solid #ccc;
	border-radius: 8px;
	background: #fdfdfd;
	font-size: 15px;
	transition: border-color 0.3s ease, box-shadow 0.3s ease;
}

input[type="email"]:focus, input[type="password"]:focus {
	outline: none;
	border-color: #2a5298;
	box-shadow: 0 0 6px rgba(42, 82, 152, 0.4);
}

/* Button */
.btn-login {
	width: 100%;
	padding: 12px;
	background: linear-gradient(90deg, #43cea2, #185a9d);
	/* teal-blue gradient */
	border: none;
	border-radius: 8px;
	font-size: 16px;
	font-weight: 600;
	color: white;
	cursor: pointer;
	margin-top: 10px;
	transition: transform 0.2s ease, box-shadow 0.2s ease;
}

.btn-login:hover {
	transform: translateY(-2px);
	box-shadow: 0 6px 16px rgba(24, 90, 157, 0.4);
}

/* Links */
.forgot-password {
	text-align: right;
	font-size: 13px;
	margin-top: -5px;
	margin-bottom: 12px;
}

.forgot-password a {
	color: #185a9d;
	text-decoration: none;
}

.forgot-password a:hover {
	text-decoration: underline;
}

.register-link {
	text-align: center;
	margin-top: 18px;
	font-size: 14px;
	color: #444;
}

.register-link a {
	color: #2a5298;
	font-weight: 600;
	text-decoration: none;
}

.register-link a:hover {
	text-decoration: underline;
}

/* Social login */
.social-login {
	text-align: center;
	margin: 18px 0 10px;
	color: #555;
}

.social-buttons {
	display: flex;
	gap: 12px;
	justify-content: center;
}

.social-btn {
	background: #f1f1f1;
	border: none;
	border-radius: 6px;
	padding: 8px 12px;
	cursor: pointer;
	transition: background 0.3s ease;
}

.social-btn:hover {
	background: #e0e0e0;
}

.social-btn img {
	width: 20px;
	height: 20px;
}

/* Alerts */
.error, .success {
	padding: 10px;
	border-radius: 6px;
	margin-bottom: 18px;
	text-align: center;
	font-weight: 600;
	font-size: 14px;
}

.error {
	background: #ff4b5c;
	color: #fff;
}

.success {
	background: #38b2ac;
	color: #fff;
}
</style>
</head>
<body>

	<div class="glass-card">
		<h2>Login</h2>

		<%
		if (request.getAttribute("success") != null) {
		%>
		<div class="success"><%=request.getAttribute("success")%></div>
		<%
		}
		%>

		<%
		if (request.getAttribute("error") != null) {
		%>
		<div class="error"><%=request.getAttribute("error")%></div>
		<%
		}
		%>

		<form action="${pageContext.request.contextPath}/user/login"
			method="post">
			<div class="form-group">
				<label>Email</label> <input type="email" name="email"
					placeholder="username@gmail.com" required>
			</div>

			<div class="form-group">
				<label>Password</label> <input type="password" name="password"
					placeholder="••••••••" required>
			</div>

			<div class="forgot-password">
				<a href="#">Forgot Password?</a>
			</div>

			<button type="submit" class="btn-login">Sign in</button>
		</form>

		<div class="social-login">
			<p>or continue with</p>
			<div class="social-buttons">
				<button type="button" class="social-btn">
					<img
						src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/google/google-original.svg"
						alt="Google">
				</button>
				<button type="button" class="social-btn">
					<img
						src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original.svg"
						alt="GitHub">
				</button>
				<button type="button" class="social-btn">
					<img
						src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/linkedin/linkedin-original.svg"
						alt="LinkedIn">
				</button>
			</div>
		</div>

		<div class="register-link">
			Don’t have an account? <a
				href="${pageContext.request.contextPath}/user/register">Register
				free</a>
		</div>
	</div>

</body>
</html>
