<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="com.project.model.Admin, com.project.model.Quiz, java.util.List"%>
<%
Admin admin = (Admin) session.getAttribute("admin");
if (admin == null) {
	response.sendRedirect(request.getContextPath() + "/admin/login");
	return;
}
List<Quiz> quizzes = (List<Quiz>) request.getAttribute("quizzes");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz Manager - Quiz App</title>
<style>
    * {
        margin: 0; padding: 0; box-sizing: border-box;
        font-family: 'Poppins', Arial, sans-serif;
    }
    body {
        background: #f4f6f9; /* light neutral background */
        color: #2d2d2d;
        min-height: 100vh;
        display: flex;
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
        margin-bottom: 30px;
        text-align: center;
         color: #ffd700;
    }
    .menu-item {
        padding: 12px 18px;
        margin-bottom: 10px;
        border-radius: 8px;
        color: #ecf0f1;
        text-decoration: none;
        font-weight: 500;
        transition: background 0.3s ease;
        display: block;
    }
    .menu-item:hover {
        background: #00b894;
        color: #fff;
    }
    .menu-item.active {
        background: #0984e3; /* blue highlight */
        font-weight: 600;
    }
    /* Main content */
    .main-content {
        flex: 1;
        padding: 40px;
        background: #ffffff;
        border-radius: 20px 0 0 20px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.05);
        overflow-x: auto;
    }
    h2 {
        font-weight: 700;
        color: #1f2a44;
        margin-bottom: 25px;
        font-size: 28px;
    }
    /* Table */
    table {
        width: 100%;
        border-collapse: collapse;
        font-size: 15px;
    }
    thead th {
        text-align: left;
        padding: 14px 18px;
        background: #dfe6e9;
        color: #2d3436;
        font-weight: 600;
    }
    tbody tr {
        background: #f9fbfc;
        border-radius: 10px;
        box-shadow: 0 2px 8px rgba(0,0,0,0.05);
        transition: transform 0.2s ease;
    }
    tbody tr:hover {
        transform: scale(1.01);
        box-shadow: 0 6px 15px rgba(0,0,0,0.1);
    }
    tbody td {
        padding: 16px 18px;
        color: #2d3436;
    }
    tbody td:first-child {
        font-weight: 600;
        color: #0984e3;
    }
    /* Buttons */
    .btn {
        padding: 8px 14px;
        border-radius: 6px;
        text-decoration: none;
        font-weight: 600;
        font-size: 13px;
        transition: all 0.3s ease;
        margin-right: 6px;
    }
    .btn-view {
        background: #00b894; /* teal */
        color: #fff;
    }
    .btn-view:hover {
        background: #019875;
    }
    .btn-edit {
        background: #0984e3; /* blue */
        color: #fff;
    }
    .btn-edit:hover {
        background: #0652dd;
    }
    .btn-delete {
        background: #d63031; /* red */
        color: #fff;
        border: none;
    }
    .btn-delete:hover {
        background: #b71c1c;
    }
    form { display: inline; }
    /* Responsive */
    @media (max-width: 768px) {
        body { flex-direction: column; }
        .sidebar {
            width: 100%;
            flex-direction: row;
            overflow-x: auto;
        }
        .logo { font-size: 20px; margin-right: 15px; }
        .menu-item { font-size: 14px; margin-right: 8px; }
        .main-content { padding: 20px; border-radius: 0; }
        h2 { font-size: 22px; }
        table { font-size: 13px; }
        thead th, tbody td { padding: 10px; }
    }
</style>

</head>
<body>
	<div class="sidebar">
		<div class="logo">🎯ONLINE QUIZ</div>
		<a href="${pageContext.request.contextPath}/admin/dashboard"
			class="menu-item">📊 Dashboard</a> <a
			href="${pageContext.request.contextPath}/admin/quizManager"
			class="menu-item active">📝 Quiz Manager</a> <a
			href="${pageContext.request.contextPath}/admin/questionList"
			class="menu-item">❓ Question Manager</a> <a
			href="${pageContext.request.contextPath}/admin/addQuestion"
			class="menu-item">➕ Add New Question</a> <a
			href="${pageContext.request.contextPath}/admin/createQuiz"
			class="menu-item">🆕 Create Quiz</a>
	</div>
	<div class="main-content">
		<h2>Quiz Manager</h2>
		<table>
			<thead>
				<tr>
					<th>Sr No.</th>
					<th>Quiz Title</th>
					<th>Category</th>
					<th>Created At</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<%
				if (quizzes != null && !quizzes.isEmpty()) {
					int srNo = 1;
					for (Quiz quiz : quizzes) {
				%>
				<tr>
					<td><%=srNo++%></td>
					<td><%=quiz.getQuizTitle()%></td>
					<td><%=quiz.getCategory()%></td>
					<td><%=quiz.getCreatedAt()%></td>
					<td><a
						href="${pageContext.request.contextPath}/admin/quizManager?action=view&quizId=<%= quiz.getQuizId() %>"
						class="btn btn-view">View</a> <a
						href="${pageContext.request.contextPath}/admin/quizManager?action=edit&quizId=<%= quiz.getQuizId() %>"
						class="btn btn-edit">Edit</a>
						<form
							action="${pageContext.request.contextPath}/admin/quizManager"
							method="post"
							onsubmit="return confirm('Are you sure you want to delete this quiz?');"
							style="display: inline;">
							<input type="hidden" name="quizId"
								value="<%=quiz.getQuizId()%>"> <input type="hidden"
								name="action" value="delete">
							<button type="submit" class="btn btn-delete">Delete</button>
						</form></td>
				</tr>
				<%
				}
				} else {
				%>
				<tr>
					<td colspan="5"
						style="text-align: center; padding: 30px 0; color: #555;">No
						quizzes found</td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>