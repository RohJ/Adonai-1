<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Membership Information Updated..</title>

<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">
</head>

<body>

	<div class="container">

		<h2>Membership Information Updated..</h2>
      <table>
         <tr>
            <td>Membership ID:</td>
            <td>${membership.id}</td>
         </tr>
         <tr>
            <td>Person ID:</td>
            <td>${membership.people.peopleId}</td>
         </tr>    
         <tr>
            <td>Person Name:</td>
            <td>${membership.people.firstname}</td>
         </tr>  
      </table> 
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
