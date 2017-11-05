<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE >
<html>
<head>
<title>${profile.nom } ${profile.prenom }</title>
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
	<div class="container">
<!-- Barre de menus -->
<div class="container">
		<!-- Menus -->
		<nav class="navbar navbar-default" style="background-color: #e3f2fd;">
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
				
			<div class="collapse navbar-collapse" id="myNavbar">
				<h6>${welcome} ${profile.nom } ${profile.prenom }</h6>
			</div>
			</div>
		</nav>
	</div>

<!-- Fin barre de menus -->

	<!-- /////////////////// Menus ///////////////////  TODO Si profile afficher sinon msg rien à afficher-->

		<div class="media well well-lg">
		

			<div class="media-left">
				<c:if test="${profile.civilite == Mr}">
					<div>
						<span class="glyphicon glyphicon-user media-object"
							style="width: 60px"></span>
					</div>
				</c:if>

				<span class="glyphicon glyphicon-user"></span>
			</div>
			<div class="media-body">
				<h4 class="media-heading">${profile.nom } ${profile.prenom }</h4>
				

				<c:forEach items="${profile.adresse}" var="ad">
					<p>
						<span class="glyphicon glyphicon-phone"> ${ad.telephone }</span>
					</p>
					<p>
						<span class="glyphicon glyphicon-envelope"> ${profile.email }</span>
					</p>

					<!-- INFO DU PROFILE -->
					
					<button type="button" class="btn btn-primary" data-toggle="collapse"
						data-target="#demo">
						Adresse <span class="caret"></span>
					</button>
					<div style="border:2px solid white; width: 20rem; border-left: 6px solid red; background-color: white;" id="demo" class="collapse"><br>
						<p>${ad.numeroNomRue } <br>
						${ad.autre }<br>
						${ad.codePostale } ${ad.ville }<br>
						${ad.pays }</p>
					</div>
				
					
					
				</c:forEach>
			</div>
			<!-- 				</a> -->
			<%-- 			</c:forEach> --%>

			<div class="media-body ">
				<c:forEach items="${profile.titre_cv}" var="t">
					<h2 class="media-heading">${t.titre}</h2>

					<h3 class="media-heading">${t.typePoste}</h3>

				</c:forEach>
			</div>

		</div>


		<!-- /////////////////// Conteneur left-b //////////////////////-->
		<div class="container-fluid"></div>
		<!-- fin conteneur left-b -->

		<!-- Conteneur right- H -->
		<div class="container-fluid"></div>
		<!-- Conteneur middle-1 -->
		<div class="container-fluid"></div>

		<!-- Conteneur left-R -->
		<div class="container-fluid"></div>

		<!-- LE DIV CONTENEUR -->
		<div class="container-fluid"></div>
		<!-- //////////// FOOTER /////////////////////// -->
		<footer class="container-fluid bg-4 text-center">
			<div class="collapse navbar-collapse" id="myNavbar">
				<h5>${welcome} ${profile.nom } ${profile.prenom }</h5>
			</div>
		</footer>
		<!-- fin footer -->
	</div>
	<script type="text/javascript" src="js/myJS.js"></script>
</body>
</html>

