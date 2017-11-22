
<%@ page session="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%><html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>CV</title>
</head>
<body>
<div class="container">
		<!-- Menus -->
		<nav class="navbar navbar-default">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<!-- 				<a class="navbar-brand" href="#">Trouver un CV</a> -->
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav nav-tabs" role="tablist">
						<li class="active"><a href="/cv">Home</a></li>
						<li><a href="profiles">Liste de profiles</a></li>
<!-- 						<li><a href="experience">Experinces</a></li> -->
					</ul>
				</div>
		</nav>
		
		
	</div>
</body>
</html>