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

	<div class="container body-content">

		<!-- Menus -->
		<jsp:include page="navBarre.jsp" />
		<!-- fin navbar -->
		<hr>

		<div class="page-header jumbotron jumbotron-fluid bg-4 text-center"
			style="color: green">
			<h1>CV Tech</h1>

			<p>${serverTime}</p>
		</div>

		<!-- 		<a href="createProfile"><button type="button" -->
		<!-- 				class="btn btn-secondary btn-lg btn-block">Créer un CV</button></a> -->

		<br>
		<div class="container-fluid">
			<div class="row" align="center">
				<div class="col-md-4">
					<h2>Enregistrez-vous</h2>
					<p>Créez un compte pour pouvoir vous enregister.</p>
					<p>
						<a class="btn btn-default" href="register">S'enregistrer</a>
					</p>
				</div>
				<div class="col-md-4">
					<h2>Connectez-vous</h2>
					<p>Pour allez sur votre compte</p>
					<p>
						<a class="btn btn-default" href="login">Login</a>
					</p>
				</div>
				<div class="col-md-4">
					<h2>Liste de CV</h2>
					<p>Vous pouvez voir la liste des CV.</p>
					<p>
						<a class="btn btn-default" href="profiles">Liste de CV</a>
					</p>
				</div>
			</div>
		</div>




		<!-- //////////// FOOTER /////////////////////// -->

		<jsp:include page="footer.jsp">
			<jsp:param name="year" value="2017" />
		</jsp:include>
		<!-- fin footer -->

	</div>

</body>
</html>