<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="e" class="com.pojo.Employee" scope="application"></jsp:useBean>
<%-- <jsp:setProperty property="name" name="e"/>
<jsp:setProperty property="empId" name="e"/>
<jsp:setProperty property="salary" name="e"/>
 --%>
 <jsp:setProperty property="*" name="e"/>


</body>
</html>