<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<c:url value='/resources/css/adminStyle.css'/>">
        <title>Student Details</title>
   
</head>

<body>
    <div class="container">
    <h2>Student Details</h2>

    <table border="1">
        <tr>
        	<th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Course</th>
            <th>Birthday</th>
            <th>Gender</th>
            <th>Profile pic</th>
            <th>Action</th>
            
        </tr>
        
        <c:forEach var="student" items="${students}">
            <tr>
            	<td>${student.id} </td>
                <td>${student.firstName}</td>
                <td>${student.lastName}</td>
                <td>${student.emailAddress}</td>
                <td>${student.phoneNumber}</td>
                <td>${student.course}</td>               
                <td>${student.birthdayDate}</td>
                <td>${student.gender}</td>
                <td> <img src="data:image/png;base64,${student.base64Image}" alt="Image Not Found" width="100px" height="100px"  /></td>
                <td><button onclick="window.location.href='<c:url value="delete/${ student.id}"/>'"> delete</button>
                <button style="background-color: green" onclick="window.location.href='<c:url value="edit/${ student.id}"/>'"> edit</button></td>
            </tr>
        </c:forEach>
        
    </table>
    <button style="margin-top: 10px" onclick="window.location.href='<c:url value="logout"/>'">Log Out</button>
    </div>
</body>
</html>

