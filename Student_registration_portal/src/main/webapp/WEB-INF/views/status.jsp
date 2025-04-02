<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Web Page</title>
	<link rel="stylesheet" href="<c:url value='/resources/css/successStyle.css'/>">
</head>
<body>
     <div id="popupMessage" class="popup">
        <p>${message }!</p>
        <p> ${reasone }</p>
        
        <c:if test="${url=='admin'}">
        <button onclick="window.location.href='<c:url value="/adminValidate"/>'">Close</button>
        </c:if>
        <c:if test="${url!='admin'}">
        <button onclick="window.location.href='<c:url value="/home"/>'">Close</button>
        </c:if>
       
        </div>
    
</body>
</html>
