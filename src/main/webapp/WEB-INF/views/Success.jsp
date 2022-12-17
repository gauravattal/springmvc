<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link  href="<c:url value="/resources/js/script.js"/>">
<title>Insert title here</title>
</head>
<body>


<img alt="my image" src="<c:url value="/resources/image/022A6793.JPG"/>">

<h1>You have Logged in successfully</h1>
<h1>your email is ${email }</h1>
<h1>your password is ${password }</h1>

</body>
</html>