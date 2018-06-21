<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Admin Title : ${title}</h1>
<h1 align="center">Admin Message : ${message}</h1>

<c:if test="${pageContext.request.userPrincipal.name != null}">
   <h2 align="center">Welcome : ${pageContext.request.userPrincipal.name} 
       | <a href="<c:url value="/j_spring_security_logout" />" > Logout</a></h2>  
</c:if>
</body>
</html>