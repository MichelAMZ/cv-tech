<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container  body-content">
		<!-- Menus -->
		<jsp:include page="navBarre.jsp" />


		<div
			class="container-fluid jumbotron jumbotron-fluid bg-4 text-center">
			<h3>Connectez-vous avec votre email et votre mot de passe.</h3>
			<hr>
			<f:form id="loginForm" modelAttribute="login" action="loginProcess"
				method="post">

				<div class="input-group">
					<span class="input-group-addon">Email :</span>
					<f:input path="Email" class="form-control" placeholder=" Email " />
				</div>

				<div class="input-group">
					<span class="input-group-addon">Mot de passe :</span>
					<f:password path="password" class="form-control"
						placeholder=" Mot de passe " />
				</div>

				<f:button name="login">Login</f:button>
				
			</f:form>
			
			<c:if test="${not empty ErrorLogin}">
				<div
					class="container-fluid jumbotron jumbotron-fluid bg-4 text-center"
					style="color: red;">
					<span>${ErrorLogin }</span>
				</div>
			</c:if>
		</div>
		<!-- //////////// FOOTER /////////////////////// -->

		<%@include file="footer.jsp"%>
		<!-- fin footer -->
	</div>
</body>
</html>