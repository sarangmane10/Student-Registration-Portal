<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page isELIgnored="false" %>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<c:url value='/resources/css/formStyle.css'/>">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hiie ${img}
 <img alt="xyz" src="<c:url value="/resources/images/${img }"/>">
	hii
	<img alt="gh" src="${pageContext.request.contextPath}/resources/images/g.png"/>
</body>
</html>