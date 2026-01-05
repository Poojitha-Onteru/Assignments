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
    <title>Add Question - Quiz App</title>
    <style>
        /* Reset & base */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        body {
            background: #f5f7fa;
            color: #34495e;
            min-height: 100vh;
        }
        .layout {
            display: flex;
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
            margin-bottom: 36px;
             color: #ffd700;
        }
        .menu-item {
            padding: 14px 18px;
            margin-bottom: 10px;
            border-radius: 8px;
            color: white;
            text-decoration: none;
            font-weight: 600;
            transition: background 0.25s ease;
            display: block;
        }
        .menu-item:hover {
            background: rgba(255, 255, 255, 0.15);
        }
        .menu-item.active {
            background: rgba(255, 255, 255, 0.3);
            box-shadow: inset 3px 0 0 #f1f1f1;
        }
        /* Main content */
        .main-content {
            flex: 1;
            padding: 40px 50px;
            background: #fff;
            box-shadow: inset 0 0 20px #f0f0f0;
            overflow-y: auto;
        }
        /* Form container */
        .form-container {
            max-width: 800px;
            background: #f9fafc;
            padding: 36px 40px;
            border-radius: 14px;
            box-shadow: 0 4px 15px rgba(46, 61, 73, 0.1);
        }
        h2 {
            font-weight: 700;
            font-size: 28px;
            color: #2c3e50;
            margin-bottom: 32px;
            user-select: none;
        }
        /* Alerts */
        .success, .error {
            padding: 14px 18px;
            border-radius: 8px;
            margin-bottom: 24px;
            font-weight: 600;
            user-select: none;
        }
        .success {
            background: #d4edda;
            color: #155724;
        }
        .error {
            background: #f8d7da;
            color: #721c24;
        }
        /* Form groups */
        .form-group {
            margin-bottom: 28px;
        }
        label {
            display: block;
            font-weight: 700;
            margin-bottom: 10px;
            color: #5a636d;
            user-select: none;
        }
        input[type="text"],
        textarea,
        select {
            width: 100%;
            padding: 14px 18px;
            border: 1.5px solid #ddd;
            border-radius: 10px;
            font-size: 16px;
            transition: border-color 0.25s ease;
        }
        input[type="text"]:focus,
        textarea:focus,
        select:focus {
            border-color: #4e73df;
            outline: none;
        }
        textarea {
            resize: vertical;
            min-height: 90px;
            font-family: inherit;
            font-size: 16px;
            line-height: 1.4;
        }
        /* Button */
        .btn {
            padding: 14px 36px;
            background: linear-gradient(135deg, #4e73df 0%, #224abe 100%);
            color: white;
            border: none;
            border-radius: 10px;
            font-size: 18px;
            font-weight: 700;
            cursor: pointer;
            transition: background 0.3s ease, transform 0.15s ease;
            user-select: none;
        }
        .btn:hover {
            background: linear-gradient(135deg, #667eea 0%, #3b55d6 100%);
            transform: translateY(-2px);
        }
    </style>
</head>
<body>
    <div class="layout">
        <aside class="sidebar">
            <div class="logo">🎯ONLINE QUIZ</div>
            <a href="${pageContext.request.contextPath}/admin/dashboard" class="menu-item">📊 Dashboard</a>
            <a href="${pageContext.request.contextPath}/admin/quizManager" class="menu-item">📝 Quiz Manager</a>
            <a href="${pageContext.request.contextPath}/admin/questionList" class="menu-item">❓ Question Manager</a>
            <a href="${pageContext.request.contextPath}/admin/addQuestion" class="menu-item active">➕ Add New Question</a>
            <a href="${pageContext.request.contextPath}/admin/createQuiz" class="menu-item">🆕 Create Quiz</a>
        </aside>
        <main class="main-content">
            <div class="form-container">
                <h2>Add New Question</h2>

                <% if (request.getAttribute("success") != null) { %>
                    <div class="success"><%= request.getAttribute("success") %></div>
                <% } %>

                <% if (request.getAttribute("error") != null) { %>
                    <div class="error"><%= request.getAttribute("error") %></div>
                <% } %>

                <form action="${pageContext.request.contextPath}/admin/addQuestion" method="post">
                    <div class="form-group">
                        <label for="questionText">Question</label>
                        <textarea id="questionText" name="questionText" required></textarea>
                    </div>

                    <div class="form-group">
                        <label for="option1">Option 1</label>
                        <input type="text" id="option1" name="option1" required>
                    </div>

                    <div class="form-group">
                        <label for="option2">Option 2</label>
                        <input type="text" id="option2" name="option2" required>
                    </div>

                    <div class="form-group">
                        <label for="option3">Option 3</label>
                        <input type="text" id="option3" name="option3" required>
                    </div>

                    <div class="form-group">
                        <label for="option4">Option 4</label>
                        <input type="text" id="option4" name="option4" required>
                    </div>

                    <div class="form-group">
                        <label for="correctOption">Correct Option</label>
                        <select id="correctOption" name="correctOption" required>
                            <option value="">Select Correct Option</option>
                            <option value="1">Option 1</option>
                            <option value="2">Option 2</option>
                            <option value="3">Option 3</option>
                            <option value="4">Option 4</option>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="category">Category</label>
                        <input id="category" type="text" name="category" placeholder="e.g., GENERAL" required>
                    </div>

                    <button type="submit" class="btn">Add Question</button>
                </form>
            </div>
        </main>
    </div>
</body>
</html>
