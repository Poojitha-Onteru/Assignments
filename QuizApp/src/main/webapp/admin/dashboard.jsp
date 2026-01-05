<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.project.model.Admin" %>
<%
    Admin admin = (Admin) session.getAttribute("admin");
    if (admin == null) {
        response.sendRedirect(request.getContextPath() + "/admin/login");
        return;
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Dashboard - Quiz App</title>
<style>
/* Reset */
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Roboto', Arial, sans-serif;
}

body {
  background: #f4f6f9;
  color: #333;
  min-height: 100vh;
  display: flex;
}

/* Layout wrapper */
.layout {
  display: flex;
  width: 100%;
  min-height: 100vh;
}

/* Sidebar */
.sidebar {
  width: 260px;
        background: #1f2a44; /* navy */
        color: #ecf0f1;
        display: flex;
        flex-direction: column;
        padding: 25px 20px;
        box-shadow: 4px 0 12px rgba(0,0,0,0.1);
}

.logo {
  font-size: 24px;
  font-weight: 700;
  margin-bottom: 40px;
  text-align: center;
   color: #ffd700;
}

.menu-item {
  display: block;
  padding: 12px 16px;
  margin-bottom: 12px;
  border-radius: 6px;
  text-decoration: none;
  color: #f1f1f1;
  font-weight: 500;
  transition: background 0.3s ease, color 0.3s ease;
}

.menu-item:hover {
  background: #ffd700;
  color: #1e3c72;
}

.menu-item.active {
  background: #43cea2;
  color: #fff;
  font-weight: 600;
}

.logout-btn {
  margin-top: auto;
  padding: 12px;
  border-radius: 6px;
  text-align: center;
  background: #e74c3c;
  color: #fff;
  font-weight: 600;
  text-decoration: none;
  transition: background 0.3s ease;
}

.logout-btn:hover {
  background: #c0392b;
}

/* Main content */
.main-content {
  flex: 1;
  padding: 40px;
  background: #fff;
  overflow-y: auto;
}

.header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 30px;
}

h1 {
  font-size: 30px;
  font-weight: 700;
  color: #2c3e50;
}

.welcome {
  font-size: 16px;
  color: #555;
  font-weight: 500;
}

/* Stats cards */
.stats-grid {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
  gap: 24px;
  margin-bottom: 40px;
}

.stat-card {
  background: #3498db;
  padding: 24px;
  border-radius: 10px;
  color: #fff;
  box-shadow: 0 6px 16px rgba(0,0,0,0.1);
  transition: transform 0.3s ease;
}

.stat-card:hover {
  transform: translateY(-4px);
}

.stat-card h3 {
  font-size: 13px;
  letter-spacing: 1px;
  margin-bottom: 12px;
  color: #ecf0f1;
}

.stat-card .number {
  font-size: 36px;
  font-weight: 700;
}

/* Table section */
.table-container {
  background: #fafafa;
  padding: 28px;
  border-radius: 10px;
  box-shadow: 0 4px 12px rgba(0,0,0,0.08);
}


.table-header h2 {
  font-size: 22px;
  font-weight: 700;
  color: #2c3e50;
  margin-bottom: 12px;
}

p {
  color: #666;
  font-size: 14px;
  line-height: 1.6;
}

.quick-links a {
  display: inline-block;
  padding: 14px 20px;
  border-radius: 8px;
  text-decoration: none;
  font-size: 15px;
  font-weight: 600;       /* bold text */
  color: #2c3e50;         /* dark text */
  background: #ecf0f1;    /* light background */
  transition: all 0.3s ease;
  box-shadow: 0 2px 6px rgba(0,0,0,0.1);
}

.quick-links a:hover {
  background: #3498db;    /* blue hover */
  color: #fff;            /* white text on hover */
}


</style>
</head>
<body>
	<div class="layout">
		<aside class="sidebar">
			<div class="logo">🎯 ONLINE QUIZ</div>
			<a href="${pageContext.request.contextPath}/admin/dashboard"
				class="menu-item active">📊 Dashboard</a> <a
				href="${pageContext.request.contextPath}/admin/quizManager"
				class="menu-item">📝 Quiz Manager</a> <a
				href="${pageContext.request.contextPath}/admin/questionList"
				class="menu-item">❓ Question Manager</a> <a
				href="${pageContext.request.contextPath}/admin/addQuestion"
				class="menu-item">➕ Add New Question</a> <a
				href="${pageContext.request.contextPath}/admin/createQuiz"
				class="menu-item">🆕 Create Quiz</a> <a
				href="${pageContext.request.contextPath}/user/home.jsp"
				class="logout-btn">Logout</a>
		</aside>
		<main class="main-content">
			<div class="header">
				<h1>Dashboard</h1>
				<div class="welcome">
					Welcome,
					<%= admin.getFullName() != null ? admin.getFullName() : admin.getUsername() %>!
				</div>
			</div>
			<section class="stats-grid">
				<div class="stat-card">
					<h3>TOTAL QUIZ</h3>
					<div class="number"><%= request.getAttribute("totalQuiz") != null ? request.getAttribute("totalQuiz") : "0" %></div>
				</div>
				<div class="stat-card" style="background: #9b59b6;">
					<h3>TOTAL QUESTIONS</h3>
					<div class="number"><%= request.getAttribute("totalQuestions") != null ? request.getAttribute("totalQuestions") : "0" %></div>
				</div>
				<div class="stat-card" style="background: #27ae60;">
					<h3>TOTAL USERS</h3>
					<div class="number"><%= request.getAttribute("totalUsers") != null ? request.getAttribute("totalUsers") : "0" %></div>
				</div>
			</section>
			<section class="table-container">
  <div class="table-header">
    <h2>Overview</h2>
  </div>
  <table style="width:100%; margin-top:20px; border-collapse:collapse;">
    <tr style="background:#f0f0f0;">
      <th style="padding:10px; text-align:left;">Category</th>
      <th style="padding:10px; text-align:left;">Count</th>
    </tr>
    <tr>
      <td style="padding:10px;">Quizzes</td>
      <td style="padding:10px;"><%= request.getAttribute("totalQuiz") %></td>
    </tr>
    <tr>
      <td style="padding:10px;">Questions</td>
      <td style="padding:10px;"><%= request.getAttribute("totalQuestions") %></td>
    </tr>
    <tr>
      <td style="padding:10px;">Users</td>
      <td style="padding:10px;"><%= request.getAttribute("totalUsers") %></td>
    </tr>
  </table>
</section>


		</main>
	</div>
</body>
</html>
