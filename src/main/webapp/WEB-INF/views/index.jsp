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
<h1>Start here</h1> 

<%
String s =(String)request.getAttribute("name");
List<String> city=(List<String>)request.getAttribute("city");
%>

<h1>name is <%=s%> </h1>

<%     
for(String s2:city)
{
out.println(s2);
}
%>



</body>
</html>

