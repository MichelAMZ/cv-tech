<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>CV</title>
<link rel="stylesheet" type="text/css" href="/myCss/main.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<!-- Menus -->
	<nav class="navbar navbar-default">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Mon CV</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav nav-tabs" role="tablist">
					<li><a href="profiles">Liste de profiles</a></li>
					<li><a href="createProfile">Créer un CV</a></li>
					<li><a href="titreCV">Titre du cv</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- fin navbar -->

	<div class="container">
		<div class="container-fluid">
			<div class="well">
				<p>${serverTime}</p>
				<h1>PAGE D'ACCUEIL !</h1>
			</div>
		</div>

		<a href="createProfile"><button type="button"
				class="btn btn-secondary btn-lg btn-block">Créer un CV</button></a>

	</div>
</body>
</html>