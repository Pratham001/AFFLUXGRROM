<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>




<c:set var="contextRoot" value="${pageContext.request.contextPath }" />

<!DOCTYPE html>
<html lang="en">

<head>
<spring:url var="css" value="/resources/css" />
<spring:url var="img" value="/resources/img" />
<spring:url var="js" value="/resources/js" />



<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>AffluxGroom -${title}</title>


<script>
	window.menu = "${title}"
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.css" rel="stylesheet">

<!-- bootstrap flaty theme -->
<link href="${css}/theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">

		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>
		
		
		<!-- Page Content -->
		<div class="content">

			<c:if test="${userClickHome == true}">
				<%@include file="home.jsp"%>
			</c:if>

			<c:if test="${userClickAbout == true}">
				<%@include file="about.jsp"%>
			</c:if>

			<c:if test="${userClickContact == true}">
				<%@include file="contact.jsp"%>
			</c:if>
			
			<c:if test="${userClickAllSalons == true or userClickServiceSalons == true}">
				<%@include file="listsalons.jsp"%>
			</c:if>
			
			
		</div>
		
		
		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>


		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery-3.3.1.min.js"></script>
		<script src="${js}/bootstrap.js"></script>
		<script src="${js}/myapp.js"></script>

	</div>
</body>

</html>
