  <%@ page isELIgnored="false" %>
   
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success message</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/homeStyle.css">
</head>
<body>
    <div class="container">
        <h1>Student Registration Form</h1>
        <p>This is a simple web page for admin and user.</p>
        <button class="btn-learn" onclick="window.location.href='<c:url value="/registrationform"/>'">Registration</button>
        <button class="btn-contact" onclick="window.location.href='<c:url value="/admin"/>'">Admin</button> 
        
        <!-- <button class="btn-learn" onclick="window.location.href='/registrationForm/registrationform';">Registration</button>
    	<button class="btn-contact" onclick="window.location.href='/registrationForm/admin';">Admin</button>  -->
        
    </div>

   <!--  <script>
        function registration() {
        	window.location = "registrationform";
        }

        function admin() {
        	window.location = "admin";
        }
    </script>
     -->
</body>
</html>
