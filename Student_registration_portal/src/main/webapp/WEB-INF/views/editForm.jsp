<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link rel="stylesheet"
	href="<c:url value='/resources/css/formStyle.css'/>">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<title>Update Form</title>
</head>
<body>
	<section class="vh-100 gradient-custom" style="display: grid;
  height: 100%;
  width: 100%;
  place-items: center;
  background: -webkit-linear-gradient(left, #003366,#004080,#0059b3
, #0073e6);">
		<div class="container py-5 h-100">
			<div class="row justify-content-center align-items-center h-100 text-center">
				<div class="col-12 col-lg-9 col-xl-7">
					<div class="card shadow-2-strong card-registration"
						style="border-radius: 15px;">
						<div class="card-body p-4 p-md-5">
							<h3 class="mb-4 pb-2 pb-md-0 mb-md-5">Edit Details
							</h3>

							<form action="${pageContext.request.contextPath }/save"
								method="POST"  enctype="multipart/form-data">
								<input type="hidden" name="id" value="${student.id}" />
								<div class="row">
									<div class="col-md-6 mb-4">

										<div data-mdb-input-init class="form-outline">
											<input type="text" name="firstName"
												value="${student.firstName}"
												class="form-control form-control-lg" required /> <label
												class="form-label" for="firstName">First Name</label>
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div data-mdb-input-init class="form-outline">
											<input type="text" name="lastName"
												value="${student.lastName}"
												class="form-control form-control-lg" required /> <label
												class="form-label" for="lastName">Last Name</label>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 d-flex align-items-center">

										<div data-mdb-input-init class="form-outline datepicker w-100">
											<input type="Date" class="form-control form-control-lg"
												value="${student.birthdayDate}" name="birthdayDate" required />
											<label for="birthdayDate" class="form-label">Date of
												Birth</label>
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<h6 class="mb-2 pb-1">Gender:</h6>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio" name="gender"
												id="femaleGender" value="Female"
												${student.gender=="Female" ? "checked":""} /> <label
												class="form-check-label" for="femaleGender">Female</label>
										</div>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio" name="gender"
												id="maleGender" value="Male"
												${student.gender=="Male" ? "checked":""} /> <label
												class="form-check-label" for="maleGender">Male</label>
										</div>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio" name="gender"
												id="otherGender" value="Other"
												${student.gender=="Other" ? "checked":""} /> <label
												class="form-check-label" for="otherGender">Other</label>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 pb-2">

										<div data-mdb-input-init class="form-outline">
											<input type="email" name="emailAddress"
												value="${student.emailAddress}"
												class="form-control form-control-lg" required /> <label
												class="form-label" for="emailAddress">Email</label>
										</div>

									</div>
									<div class="col-md-6 mb-4 pb-2">

										<div data-mdb-input-init class="form-outline">
											<input type="tel" name="phoneNumber"
												value="${student.phoneNumber}" pattern="[0-9]{10}"
												class="form-control form-control-lg" required /> <label
												class="form-label" for="phoneNumber">Phone Number</label>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-12">

										<select class="select form-control-lg" name="course">
											<option value="DSA">DSA ${student.course=="DSA" ? "selected":""}
											</option>
											<option value="Artificial intelligence"
												${student.course=="Artificial intelligence" ? "selected":""}>Artificial
												intelligence</option>
											<option value="Java Full Stack"
												${student.course=="Java Full Stack" ? "selected":""}>Java
												Full Stack</option>
											<option value="Web Full Stack"
												${student.course=="Web Full Stack" ? "selected":""}>Web
												Full Stack</option>
										</select> <label class="form-label select-label">Choose Course</label>

									</div>
								</div>
								<div class="row mb-4 mt-4">
									<div class="col-md-12">
										<label for="profileImage" class="form-label">Profile
											Image</label> <input type="file" name="profilePic"
											class="form-control form-control-lg" accept="image/*" />
									</div>
								</div>
								<div class="mt-4 pt-2">
									<div class="btn-container">
										<input data-mdb-ripple-init class="btn btn-primary btn-lg"
											type="submit" value="Submit" />
									</div>
								</div>

							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
</body>
</html>