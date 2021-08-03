<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css">
</head>
<body>
<%@ include file="header.jsp" %>/

<div align="center">
 <h2> <%= request.getAttribute("message") %></h2>
</div>
<br>
<%@ include file="footer.jsp" %>
</body>
</html>