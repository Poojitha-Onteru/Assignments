<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online Quiz Portal</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to bottom right, #fdfbfb, #ebedee); 
            color: #1a1a1a;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
        }
       .navbar {
    background: linear-gradient(90deg, #4facfe, #00f2fe);
    padding: 18px 60px;
    display: flex;
    justify-content: space-between;
    align-items: center;
    box-shadow: 0 4px 12px rgba(0,0,0,0.2);
}
.logo {
    color: #fff;
    font-size: 30px;
    font-weight: 800;
    letter-spacing: 2px;
}
.nav-links a {
    color: #fff;
    text-decoration: none;
    margin-left: 30px;
    font-size: 18px;
    font-weight: 600;
    position: relative;
}
.nav-links a::after {
    content: '';
    display: block;
    height: 2px;
    width: 0;
    background: #fff;
    transition: width 0.3s;
    margin-top: 4px;
}
.nav-links a:hover::after {
    width: 100%;
}
.hero {
    flex: 1;
    background: linear-gradient(to right, #ffecd2, #fcb69f); /* warm gradient */
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    text-align: center;
    padding: 80px 20px;
}
.hero h1 {
    font-size: 56px;
    font-weight: 900;
    margin-bottom: 20px;
    color: #222;
    animation: fadeInDown 1s ease;
}
.hero p {
    font-size: 20px;
    margin-bottom: 40px;
    font-weight: 500;
    color: #333;
    max-width: 650px;
}
@keyframes fadeInDown {
    from { opacity: 0; transform: translateY(-30px); }
    to { opacity: 1; transform: translateY(0); }
}
.btn-login-hero {
    background: linear-gradient(90deg, #43cea2, #185a9d); /* teal-blue gradient */
    color: white;
    padding: 16px 48px;
    border-radius: 50px;
    font-size: 20px;
    font-weight: 700;
    text-decoration: none;
    box-shadow: 0 6px 20px rgba(24,90,157,0.4);
    transition: transform 0.3s ease, box-shadow 0.3s ease;
}
.btn-login-hero:hover {
    transform: translateY(-3px);
    box-shadow: 0 10px 30px rgba(24,90,157,0.6);
}

      @media (max-width: 700px) {
    .navbar {
        flex-direction: column;
        align-items: flex-start;
        padding: 15px 25px;
    }
    .nav-links {
        margin-top: 10px;
    }
    .nav-links a {
        margin: 10px 0;
        font-size: 16px;
    }
    .hero h1 {
        font-size: 40px;
    }
    .hero p {
        font-size: 18px;
        max-width: 90%;
    }
}

    </style>
</head>
<body>
    <nav class="navbar">
        <div class="logo">ONLINE QUIZ</div>
        <div class="nav-links">
            <a href="${pageContext.request.contextPath}/admin/login">Admin Login</a>
            <a href="${pageContext.request.contextPath}/user/login">Login/Signup</a>
        </div>
    </nav>

    <div class="hero">
        <h1>Online Quiz Portal — where learning meets challenge.</h1>
        <p>Challenge your mind, sharpen your knowledge, and grow stronger with every quiz you take!</p>
        <a href="${pageContext.request.contextPath}/user/login" class="btn-login-hero">Start</a>
    </div>
</body>
</html>
