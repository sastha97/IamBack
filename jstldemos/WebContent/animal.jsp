<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="animal_name" value="${param.animal }"></c:set>
<c:choose>
	<c:when test="${animal_name=='Tiger' }">
		it is a tigor
	</c:when>
	<c:when test="${animal_name=='Lion' }">
		it is a Leo
		</c:when>
	<c:when test="${animal_name eq'Elephant' }">
		it is a eleph
		</c:when>
	<c:otherwise>
		Congrats! You discovered a new species
	</c:otherwise>		
</c:choose>
</body>
</html>