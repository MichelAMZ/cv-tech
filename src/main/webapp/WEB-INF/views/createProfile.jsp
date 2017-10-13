
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
			<h1>Enregistrement de profile</h1>
			<p>Application CRUD Spring MVC / Bootstrap</p>
			<div class="row">
				<div class="col-sm-4" style="background-color: lavender;">|</div>
				<div class="col-sm-4" style="background-color: lavenderblush;">|</div>

			</div>
			<br>

			<f:form modelAttribute="profile" method="post" action="saveProfile">

				<div class="input-group">
					<span class="input-group-addon">Civilité :</span>
					<f:select path="civilite">
						<f:option value="Mr"> Monsieur</f:option>
						<f:option value="Mme"> Madame</f:option>
						<f:option value="Mle"> Mademoiselle</f:option>
					</f:select>
				</div>

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
				<!-- 					<br> /////////////////////////// ADRESSE -->
				<!-- 					/////////////////////////////////////// -->

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

				<br> /////////////////////////////// TITRE DU CV
					////////////////////////////////////////
					
<div class="container">
	<f:form modelAttribute="titreCV" method="post" action="saveTitreCV">
		<table>
			<tr>
				<th>TITRE DU CV:</th>
				<td><f:input path="titre" /></td>
			</tr>
			<tr>
				<th>POSTE RECHERCHE:</th>
				<td><f:input path="typePoste" /></td>
			</tr>
		
			<tr>
<%-- 				<td><f:hidden path="idTitreCV" /></td> --%>
			</tr>
			<tr>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
		<br>

	</f:form>
</div>



				<!-- 					<div class="input-group"> -->
				<!-- 						<span class="input-group-addon">Poste recherché :</span> -->
				<%-- 						<f:input path="titre_cv.titre" class="form-control" placeholder=" developpeur informatique " /> --%>
				<!-- 					</div> -->

				<!-- 					<div class="input-group"> -->
				<!-- 						<span class="input-group-addon">Type de poste :</span> -->
				<%-- 						<f:input path="titre_cv.typePoste" class="form-control" placeholder=" .Net / java-jee... " /> --%>
				<!-- 					</div> -->

				<br>
				<div class="input-group">
					<f:hidden path="idProfile" />
				</div>
				<br>


				<button class="btn btn-default" type="submit" value="Save">
					SAVE</button>

				<br>
			</f:form>
		</div>

		<br>

	</div>



</body>
</html>


