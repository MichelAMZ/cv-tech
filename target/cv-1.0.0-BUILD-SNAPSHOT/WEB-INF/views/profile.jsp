<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>CV</title>

<link href="https://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="./myCss/style.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- /////////////////// Menus /////////////////// -->
	<nav class="navbar navbar-default">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

				<a class="navbar-brand" data-toggle="popover"
					title="${profile.nom } ${profile.prenom }"
					data-content="${profile.numeroRue }
				${profile.nomRue }
			${profile.autre } 
			${profile.codePostale }
				${profile.ville }
			${profile.pays } ${profile.telephone } ${profile.email }"
					data-trigger="hover"> <c:if
						test="${profile.civilite == Mr}">
						<div>
							<span class="glyphicon glyphicon-user"></span>
						</div>
					</c:if> <span class="glyphicon glyphicon-user"></span>_${profile.nom }
					${profile.prenom }
				</a>
			</div>
		
		</div>
	</nav>
	<!-- fin navbar -->

	<!-- //////////////////////// Conteneur left-h //////////////////// -->

	<div
		class="container-fluid container-fluid bg-1 text-center text-uppercase">

		<div class="col-sm-2 cg-1 text-left text-lowercase">
			<p>
				<span class="glyphicon glyphicon-phone">
					${profile.telephone }</span>
			</p>
			<p>
				<span class="glyphicon glyphicon-envelope">
					${profile.email }</span>
			</p>

			<!-- INFO DU PROFILE -->
			<a href="#" data-toggle="popover"
				title="${profile.nom } ${profile.prenom }"
				data-content="${profile.numeroRue }
				${profile.nomRue }
			${profile.autre } 
			${profile.codePostale }
				${profile.ville }
			${profile.pays }"
				data-trigger="focus"><span class="glyphicon glyphicon-plus"></span></a>
		</div>
		<h3><c:forEach items="${profile.titre_cv}" var="t">
						${t.titre}
						${t.typePoste}
			

				</c:forEach></h3>
	</div>
	<!--  fin conteneur left-h  -->


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
				<ul class="nav nav-tabs" role="tablist">
					<li class="active"><a href="\cv">Home</a></li>
					<li><a href="profiles">Liste de profiles</a></li>
				</ul>
			</div>
	</footer>
	<!-- fin footer -->

	<script type="text/javascript" src="js/myJS.js"></script>
</body>
</html>

