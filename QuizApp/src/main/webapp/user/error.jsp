<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
    <h2>${errorMessage}</h2>
    <p>Please go back and try again.</p>
    <a href="<%= request.getContextPath() %>/user/dashboard">Return to Dashboard</a>
</body>
</html>
