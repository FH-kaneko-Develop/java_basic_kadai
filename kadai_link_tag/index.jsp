<%@ page contentType="text/html; charset=UTF-8" %>
<%
String message = (String) request.getAttribute("message");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>kadai_link_tag</title>
</head>
<body>
    <a href="<%= request.getContextPath() %>/link?name=侍太郎">名前「侍太郎」をServletに送信</a>

    <% if (message != null) { %>
        <p><%= message %></p>
    <% } %>
</body>
</html>
