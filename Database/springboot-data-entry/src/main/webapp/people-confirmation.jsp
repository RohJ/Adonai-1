<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Person Added..</title>

<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">
</head>

<body>

	<div class="container">

		<h2>Person added to the DB successfully</h2>
      <table>
         <tr>
            <td>Person ID: </td>
            <td>${peopleForm.peopleId}</td>
         </tr>    
         <tr>
            <td>Person First Name: </td>
            <td>${peopleForm.firstname}</td>
         </tr>  
         <tr>
            <td>Person Last Name: </td>
            <td>${peopleForm.lastname}</td>
         </tr>
      </table> 
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
