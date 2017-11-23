
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%><!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<title>CV</title>
</head>
<body>
	${ welcome}

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
	<!-- --------------------------------- EN TETE------------------------------------------------ -->
	<div class="container">
		<div class="container-fluid">
			<h1>Enregistrement de profile</h1>
			<p>Application CRUD Spring MVC / Bootstrap</p>
			<div class="row">
				<div class="col-sm-4" style="background-color: lavender;">|</div>
				<div class="col-sm-4" style="background-color: lavenderblush;">|</div>

			</div>
			<br>
		</div>



		<!-- ---------------------------FORMS PROFILE----------------------------- -->

		<f:form modelAttribute="profile" method="post" action="saveProfile"
			name="formProfile">

<c:forEach items="${adresses}" var="ad" varStatus="teamsLoop">
<c:set value="${ad.numeroNomRue}" var="numeroNom" scope="request"/>

</c:forEach>


			<div class="container-fluid">
				<div class="input-group">
					<span class="input-group-addon">Civilité :</span>
					<f:select path="civilite" class="form-control">
						<f:option value="Mr"> Monsieur</f:option>
						<f:option value="Mme"> Madame</f:option>
						<f:option value="Mle"> Mademoiselle</f:option>
					</f:select>
				</div>
				<br>

				<div class="input-group">
					<span class="input-group-addon">Nom :</span>
					<f:input path="nom" class="form-control" placeholder=" Votre Nom" />
				</div>
				<br>

				<div class="input-group">
					<span class="input-group-addon">Prénom :</span>
					<f:input path="prenom" class="form-control"
						placeholder=" Votre prenom" />
				</div>
				<br>

				<div class="input-group">
					<span class="input-group-addon">Date de naissance :</span>
					<f:input type="date" path="dateNaiss" class="form-control"
						placeholder=" Votre date de naissance" />
				</div>
				<br> <br>
				<div class="input-group">
					<span class="input-group-addon">Email :</span>
					<f:input path="Email" class="form-control" placeholder=" Email " />
				</div>
			</div>

			<!-- -------------------------- TTITRE CV -------------------------------------->
			<div class="container-fluid">
				<f:form modelAttribute="titreCV" method="post" action="saveTitreCV"
					name="formTitrecv">

					<!-- -------------------------- ADRESSE -------------------------------------->

					<div class="container-fluid">
						<f:form modelAttribute="adresse" method="post"
							action="saveAdresse" name="formAdresse">

							<div class="input-group">
								<span class="input-group-addon">Numero :</span>
								<f:input path="numeroNomRue" class="form-control"
									placeholder=" Numero et nom de la rue " />
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
							
							<div>
								<f:hidden path="idAdresse" />
							</div>

							<!-- 					<input type="submit" value="Save"> -->

						</f:form>
					</div>
					<br>

					<div class="input-group">
						<span class="input-group-addon">TITRE DU CV:</span>
						<f:input path="titre" class="form-control"
							placeholder="TITRE: développeur java ..." />
					</div>

					<div class="input-group">
						<span class="input-group-addon">POSTE RECHERCHE:</span>
						<f:input path="typePoste" class="form-control"
							placeholder=" JEE / ASP.NET ... " />
					</div>

					<div>
						<f:hidden path="idTitreCV" />
					</div>
					<div class="input-group">
						<input type="submit" value="Save">
					</div>

				</f:form>
			</div>


			<br>
			<div class="input-group">
				<f:hidden path="idProfile" />
			</div>
			<br>

			<!-- 			<button class="btn btn-default" type="submit" value="Save"> -->
			<!-- 				SAVE</button> -->

			<br>

		</f:form>
	</div>
<!-- //////////// FOOTER /////////////////////// -->
		<jsp:include page="footer.jsp">
			<jsp:param name="year" value="2017" />
		</jsp:include>

</body>
</html>


