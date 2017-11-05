
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
						<li class="active"><a href="createProfile">Créer un
								profile</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>

	<div class="container">
		<div class="container-fluid">
			<h1>Liste de profiles enregistrés</h1>
			<a href="createProfile"><button type="button" class="btn btn-secondary btn-lg btn-block">
				Créer un CV
			</button></a>
			<br>


			<div class="container">
				<table class="table" class="table-responsive">

					<caption>
						Liste de profiles
					</caption>

					<tr>
						<th>CIVILITE</th>
						<th>NOM</th>
						<th>PRENOM</th>
						<th>AGE</th>
						<!-- 							<th>DATE DE CREATION</th> -->
						<!-- 							<th>DATE DE MISE A JOUR</th> -->
					</tr>
					<c:forEach items="${profiles}" var="p">
						<tr class="warning">
							<td>${p.civilite}</td>
							<td>${p.nom}</td>
							<td>${p.prenom}</td>
							<td>${p.age}</td>
							<%-- 								<td>${p.dateCreate}</td> --%>
							<%-- 								<td>${p.dateUpdate}</td> --%>

							<td class="badge badge-danger"><a
								href="deleteProfile?id=${p.idProfile}"> Supprimer </a></td>

							<td class="badge badge-warning"><a
								href="editProfile?id=${p.idProfile}"> Modifier </a></td>

							<td class="badge badge-success"><a
								href="profile?id=${p.idProfile}"> voir le cv </a></td>
						</tr>

					</c:forEach>

				</table>
			</div>
		</div>
	</div>
</body>
</html>


