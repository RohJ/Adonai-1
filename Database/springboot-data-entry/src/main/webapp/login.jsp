<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

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
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <link href="${contextPath}/resources/demo/demo.css" rel="stylesheet" />

  </head>

  <body>

    <div class="section section-signup page-header">
      <div class="container">
        <div class="row">
          <div class="col-lg-4 col-md-6 mx-auto">
            <div class="card card-login">
              <form method="POST" action="${contextPath}/login" class="form">
                <div class="card-header card-header-primary text-center">
                  <h4 class="card-title">Login</h4>
                </div>
                <p class="description text-center">Enter your credentials</p>
                
                <div class="card-body">
                  <p class="description text-center" style="color: #f44336;">${message}</p>
                  <span class="bmd-form-group"><div class="input-group">
                    <div class="input-group-prepend">
                      <span class="input-group-text">
                        <i class="material-icons">face</i>
                      </span>
                    </div>
                    <input type="text" name="username" class="form-control" placeholder="Username">
                  </div></span>
                  <span class="bmd-form-group">
                    <div class="input-group">
                      <div class="input-group-prepend">
                        <span class="input-group-text">
                          <i class="material-icons">lock_outline</i>
                        </span>
                      </div>
                      <input name="password" type="password" class="form-control" placeholder="Password" autocomplete="">
                    </div>
                  </span>
                </div>
                
                <div class="footer text-center">
                  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                  <button class="btn btn-primary btn-link btn-wd btn-lg" type="submit">Login</button>
                  <a href="${contextPath}/registration" class="btn btn-primary btn-link btn-wd btn-lg">Create new user</a>
                  <p class="description text-center" style="color: #f44336;">${error}</p>
                </div>
                
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  </body>
</html>
