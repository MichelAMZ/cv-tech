<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE >
<html  xmlns:p="http://primefaces.org/ui"
		xmlns:h="http://xmlns.jcp.org/jsf/html">
<head>
<title>${profile.nom }_${profile.prenom }</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href="/css/main.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>COUCOU MY CV PAGES §</h1>
	
	<div class="container">
		<div class="container-fluid"></div>
		<!-- //////////// FOOTER /////////////////////// -->
		
	<%@include file="footer.jsp"%>
		<!-- fin footer -->
	</div>
</body>
</html>