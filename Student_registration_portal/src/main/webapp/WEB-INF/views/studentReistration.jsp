<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <!--  <link rel="stylesheet" href="<c:url value='/resources/css/loginStyle.css'/>">  -->
    <link rel="stylesheet" href="/Student_registration_portal/resources/css/registrationStyle.css">
     <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    
</head>
<body>
    

   <section class="vh-100 gradient-custom">
  <div class="container py-5 h-100 mt-3 mb-3">
   <span style="font-size: 20px; margin-left: -550px;" class="fa fa-home glyfi" onclick="window.location.href='<c:url value="/home"/>'"></span>
    <div class="row justify-content-center align-items-center h-100">
      <div class="col-12 col-lg-9 col-xl-7">
       
       <div class="form-box">
            <h2 class="mb-4" style="font-weight: 600;
    font-size: 35px;">Registration Form</h2>
            <div class="toggle-buttons">
                <button id="loginBtn" onclick="window.location.href='<c:url value="/studentLogin"/>'" >Login</button>
                <button id="signupBtn" class="active">Signup</button>
            </div>
            </div>
            </div>
            </div>
            <div>
            <form action="save" method="POST" enctype="multipart/form-data">
              <!-- First Name and Last Name -->
              <div class="row">
                <div class="col-md-6 mb-4">
                  <div data-mdb-input-init class="form-outline">
                    <input type="text" name="firstName" class="form-control form-control-lg" required />
                    <label class="form-label" for="firstName">First Name</label>
                  </div>
                </div>
                <div class="col-md-6 mb-4">
                  <div data-mdb-input-init class="form-outline">
                    <input type="text" name="lastName" class="form-control form-control-lg" required/>
                    <label class="form-label" for="lastName">Last Name</label>
                  </div>
                </div>
              </div>

              <!-- Date of Birth and Gender -->
              <div class="row">
                <div class="col-md-6 mb-4 d-flex align-items-center">
                  <div data-mdb-input-init class="form-outline datepicker w-100">
                    <input type="Date" class="form-control form-control-lg" name="birthdayDate" required/>
                    <label for="birthdayDate" class="form-label">Date of Birth</label>
                  </div>
                </div>
                <div class="col-md-6 mb-4">
                  <h6 class="mb-2 pb-1">Gender: </h6>
                  <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="gender" id="femaleGender" value="Female" checked />
                    <label class="form-check-label" for="femaleGender">Female</label>
                  </div>
                  <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="gender" id="maleGender" value="Male" />
                    <label class="form-check-label" for="maleGender">Male</label>
                  </div>
                  <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="gender" id="otherGender" value="Other" />
                    <label class="form-check-label" for="otherGender">Other</label>
                  </div>
                </div>
              </div>

              <!-- Email and Phone Number -->
              <div class="row">
                <div class="col-md-6 mb-4 pb-2">
                  <div data-mdb-input-init class="form-outline">
                    <input type="email" name="emailAddress" class="form-control form-control-lg" required/>
                    <label class="form-label" for="emailAddress">Email</label>
                  </div>
                </div>
                <div class="col-md-6 mb-4 pb-2">
                  <div data-mdb-input-init class="form-outline">
                    <input type="tel" name="phoneNumber" pattern="[0-9]{10}" class="form-control form-control-lg" required/>
                    <label class="form-label" for="phoneNumber">Phone Number</label>
                  </div>
                </div>
              </div>

              <!-- Course Selection -->
              <div class="row">
                <div class="col-12">
                  <select class="select form-control-lg" name="course">
                    <option value="DSA">DSA</option>
                    <option value="Artificial intelligence">Artificial Intelligence</option>
                    <option value="Java Full Stack">Java Full Stack</option>
                    <option value="Web Full Stack">Web Full Stack</option>
                  </select>
                  <label class="form-label select-label">Choose Course</label>
                </div>
              </div>

              <!-- Profile Image Upload -->
              <div class="row mb-4 mt-4">
                <div class="col-md-12">
                  <label for="profileImage" class="form-label">Profile Image</label>
                  <input type="file" name="profilePic" class="form-control form-control-lg" accept="image/*" />
                </div>
              </div>

              <!-- Submit Button -->
              <div class="mt-4 pt-2">
                <div class="btn-container">              
                  <input data-mdb-ripple-init class="btn btn-primary btn-lg" type="submit" value="Submit" />
                </div>
              </div>

            </form>
            </div>
            </div>
      
   
</section>
            

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>

