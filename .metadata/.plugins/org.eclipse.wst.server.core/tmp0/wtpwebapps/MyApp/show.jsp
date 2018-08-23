<%@page import="com.pojo.Employee"%>
<%@page import="java.util.List"%>
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
	List<Employee> list = (List<Employee>) request.getAttribute("employees");
%>
<table border = "30">
<%	
	for(Employee emp: list){
%><tr>
	<td><%=(emp.getEmpId()) %></td>
	<td><%=(emp.getName()) %></td>
	<td><%=(emp.getSalary()) %></td>
</tr>
			
<%	
	}

%>
</table>
</body>
</html>