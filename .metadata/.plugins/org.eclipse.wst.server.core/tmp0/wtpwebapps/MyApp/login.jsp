<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 String mess = (String)request.getAttribute("message");
%>

<%= mess  %>

<form action="check" >
<jsp:attribute name=""></jsp:attribute>

username <input type = "text" name = "username" ><br>
password <input type = "text" name = "password" ><br>
<button type = "submit"> Submit </button>

</form>

</body>
</html>