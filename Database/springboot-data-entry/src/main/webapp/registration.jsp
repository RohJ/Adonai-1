<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />
	<title>Log in with your account</title>
	
<!--     Fonts and icons     -->
<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
<!-- CSS Files -->
<link href="${contextPath}/resources/login/css/material-kit.css?v=2.0.7" rel="stylesheet" />
<!-- CSS Just for demo purpose, don't include it in your project 
<link href="${contextPath}/resources/demo/demo.css" rel="stylesheet" />	-->
</head>

<body>

<!--	<div class="container">

		<form:form method="POST" modelAttribute="userForm" class="form-signin">
			<h2 class="form-signin-heading">Create your account</h2>
			<spring:bind path="username">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<form:input type="text" path="username" class="form-control"
						placeholder="Username" autofocus="true"></form:input>
					<form:errors path="username"></form:errors>
				</div>
			</spring:bind>

			<spring:bind path="password">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<form:input type="password" path="password" class="form-control"
						placeholder="Password"></form:input>
					<form:errors path="password"></form:errors>
				</div>
			</spring:bind>

			<spring:bind path="passwordConfirm">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<form:input type="password" path="passwordConfirm"
						class="form-control" placeholder="Confirm Your Password"></form:input>
					<form:errors path="passwordConfirm"></form:errors>
				</div>
			</spring:bind>

			<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
		</form:form>

	</div>	-->

	<div class="section section-signup page-header">
		<div class="container">
		  <div class="row">
			<div class="col-lg-4 col-md-6 mx-auto">
			  <div class="card card-login">
				<form:form method="POST" modelAttribute="userForm" class="form">
				  <div class="card-header card-header-primary text-center">
					<h4 class="card-title">New User</h4>
				  </div>
				  <p class="description text-center">Enter your details</p>
				  
				  <div class="card-body">
					<p class="description text-center" style="color: #f44336;">${message}</p>
					<spring:bind path="username">
						<span class="bmd-form-group">
							<div class="input-group">
					  			<div class="input-group-prepend">
									<span class="input-group-text">
						  				<i class="material-icons">face</i>
									</span>
					 		 	</div>
					 			<form:input type="text" path="username" class="form-control" placeholder="Username"></form:input>
					  			<form:errors path="username"></form:errors>
							</div>
						</span>
					</spring:bind>
					<spring:bind path="password">
						<span class="bmd-form-group">
						  	<div class="input-group">
								<div class="input-group-prepend">
									<span class="input-group-text">
										<i class="material-icons">lock_outline</i>
						  			</span>
								</div>
								<form:input path="password" type="password" class="form-control" placeholder="Password" autocomplete=""></form:input>
								<form:errors path="password"></form:errors>
					  		</div>
						</span>
					</spring:bind>
					<spring:bind path="passwordConfirm">
						<span class="bmd-form-group">
						  	<div class="input-group">
								<div class="input-group-prepend">
									<span class="input-group-text">
										<i class="material-icons">lock_outline</i>
						  			</span>
								</div>
								<form:input path="passwordConfirm" type="password" class="form-control" placeholder="Password" autocomplete=""></form:input>
								<form:errors path="passwordConfirm"></form:errors>
					  		</div>
						</span>
					</spring:bind>
				  </div>
				  <div class="footer text-center">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
					<button class="btn btn-primary btn-link btn-wd btn-lg" type="submit">Create</button>
				  </div>				  
				</form:form>
			  </div>
			</div>
		  </div>
		</div>
	  </div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
