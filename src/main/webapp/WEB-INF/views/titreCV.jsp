
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

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
	<jsp:include page="navBarre.jsp" />
	
		<!-- -------------------------- TTITRE CV -------------------------------------->
		<div class="container-fluid">


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
					<td><f:hidden path="idTitreCV" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Save"></td>
				</tr>
			</table>
			<br>

		</f:form>
	</div>
	
	<div class="container">
		<div class="container-fluid"></div>
		<!-- //////////// FOOTER /////////////////////// -->
	<jsp:include page="footer.jsp">
				<jsp:param name="year" value="2017" />
			</jsp:include>
			<!-- fin footer -->
	</div>
</div>

</body>
</html>