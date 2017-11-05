
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>
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
			<div class="container">
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
					</ul>
				</div>
			</div>
		</nav>
	</div>


	<div class="container">

		<div class="container-fluid">
			<f:form modelAttribute="address" method="post" action="saveAdresse">

				<div class="input-group">
					<span class="input-group-addon">Numero :</span>
					<f:input path="numeroRue" class="form-control"
						placeholder=" Numero de la rue " />
				</div>
				<br>

				<div class="input-group">
					<span class="input-group-addon">Nom :</span>
					<f:input path="nomRue" class="form-control"
						placeholder=" Nom de votre rue " />
				</div>
				<br>

				<div class="input-group">
					<span class="input-group-addon">Autre :</span>
					<f:input path="autre" class="form-control" placeholder=" Autre " />
				</div>
				<br>

				<div class="input-group">
					<span class="input-group-addon">Code postale :</span>
					<f:input path="CodePostale" class="form-control"
						placeholder=" le code postale" />
				</div>
				<br>

				<div class="input-group">
					<span class="input-group-addon">Ville :</span>
					<f:input path="ville" class="form-control" placeholder=" Ville " />
				</div>
				<br>

				<div class="input-group">
					<span class="input-group-addon">pays :</span>
					<f:input path="pays" class="form-control" placeholder=" Pays " />
				</div>
				<br>

				<div class="input-group">
					<span class="input-group-addon">Telephone :</span>
					<f:input path="telephone" class="form-control"
						placeholder=" Numero de téléphone " />
				</div>
				<br>

				<div class="input-group">
					<span class="input-group-addon">Email :</span>
					<f:input path="Email" class="form-control" placeholder=" Email " />
				</div>

				<div>
					<f:hidden path="idAdresse" />
				</div>
				
					<button class="btn btn-default" type="submit" value="Save">
							SAVE</button>

		<br>
			</f:form>
		</div>
	</div>
</body>
</html>