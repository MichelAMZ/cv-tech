<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE >
<html xmlns:p="http://primefaces.org/ui"
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

<script type="text/javascript" src="./js/myJS.js"></script>
</head>
<body>
	<div class="container">
		<!-- Barre de menus -->
		<div class="container-fluid badge badge-success">

			<jsp:include page="navBarre.jsp" />
		</div>

		<hr>

		<form action="loginDeconneted" method="GET">
			<span class="badge badge-pill badge-success">${welcome }
				${profile.prenom } ${profile.nom }</span>
			<c:if test="${not empty deconn}">
				<input class="btn btn-primary btn-xs" type="submit" name="action"
					value=${deconn } />
			</c:if>

		</form>
		<hr>
		<!-- Fin barre de menus -->

		<!-- /////////////////// Menus ///////////////////  TODO Si profile afficher sinon msg rien à afficher-->

		<div class="media well well-lg">

			<div class="media-left">
				<c:if test="${profile.civilite == Mr}">
					<div>
						<span class="glyphicon glyphicons-girl media-object"
							style="width: 60px"></span>
					</div>
				</c:if>

				<span class="glyphicon glyphicon-user"></span>
			</div>
			<div class="media-body">
				<h4 class="media-heading">${profile.nom }${profile.prenom }</h4>


				<c:forEach items="${profile.adresse}" var="ad">
					<p>
						<span class="glyphicon glyphicon-phone">
							${profile.telephone }</span>
					</p>
					<p>
						<span class="glyphicon glyphicon-envelope"> ${profile.email }</span>
					</p>

					<!-- INFO DU PROFILE -->


				</c:forEach>
			</div>

			<div class="media-body ">
				<c:forEach items="${profile.titre_cv}" var="t">
					<h2 class="media-heading">${t.titre}</h2>

					<h3 class="media-heading">${t.typePoste}</h3>

				</c:forEach>
			</div>
			<hr>
			<a href="titreCV?id=${profile.idProfile}">
				<button type="button"
					class="btn-primary btn-sm btn-block btn btn-warning">
					Ajouter ou modifier le titre</button>
			</a>

		</div>

		<!-- ----------------------------------- Adresse CARD ------------------------------------>
		<div class="alert alert-success" role="alert">
			<h4 class="alert-heading">ADRESSE :</h4>
			<c:forEach items="${profile.adresse}" var="ad">

				<p>${ad.numeroNomRue }
					<br> ${ad.autre }<br> ${ad.codePostale } ${ad.ville }<br>
					${ad.pays }
				</p>
			</c:forEach>
			<hr>
			<a href="adresse?id=${profile.idProfile}"><button type="button"
					class="btn-primary btn-sm btn-block btn btn-warning">
					Ajouter ou modifier le l'adresse</button> </a>
		</div>
		<!-- Fin adresse card  -->

<c:if test="${not empty deconn}">
<%-- 		<a href="myCV?id=${profile.nom }_${profile.prenom }"><button type="button" --%>
<!-- 				class="btn-primary btn-sm btn-block btn btn-warning"> -->
<!-- 				Voir le CV</button> </a> -->
				
				
		<a href="myCV?id=${profile.idProfile}"><button type="button"
				class="btn-primary btn-sm btn-block btn btn-warning">
				Voir le CV</button> </a>
</c:if>
		<!-- LE DIV CONTENEUR -->
		<!-- //////////// FOOTER /////////////////////// -->
		<jsp:include page="footer.jsp">
			<jsp:param name="year" value="2017" />
		</jsp:include>
		<!-- fin footer -->
	</div>
	<!-- 	<script type="text/javascript" src="./js/myJS.js"></script> -->
</body>
</html>

