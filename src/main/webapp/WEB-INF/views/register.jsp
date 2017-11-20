
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
		<%@include file="navBarre.jsp"%>
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



		<f:form modelAttribute="profile" method="post"
			action="saveRegistration" name="formProfile">
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
				<br>

				<div class="input-group">
					<span class="input-group-addon">Telephone :</span>
					<f:input path="telephone" class="form-control"
						placeholder=" Numero de téléphone " />
				</div>
				<br>

				<div class="input-group">
					<span class="input-group-addon">Email :</span>
					<f:input type="email" path="email" class="form-control"
						placeholder=" votre mail" />
				</div>
				<br>


				<div class="input-group">
					<span class="input-group-addon">Mot de passe :</span>
					<f:input type="password" path="passwd" class="form-control"
						placeholder=" Mot de passe " />
				</div>
				<br>

			</div>

			<div class="input-group">
				<f:hidden path="idProfile" />
			</div>
			<br>

			<button class="btn btn-default" type="submit" value="Save">
				SAVE</button>

			<br>

		</f:form>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>


