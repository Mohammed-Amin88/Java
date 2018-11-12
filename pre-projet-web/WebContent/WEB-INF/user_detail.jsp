<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page user detail</title>
<link rel="stylesheet" href="Ressources\css\produit.css">
</head>
<body>

	<div class="produit">


		<img src="${url}" alt="${nom }" title="${nom }" />
		<h3>${prenom}${nom }</h3>


	</div>
	<h4>${dateDeNaissance}</h4>
	<h4>${numeroTelephone}</h4>
	<h4>${mail}</h4>
	<h4>${numeroRue}</h4>
	<h4>${ville}</h4>

	<div id="accueil produit">
		<a href="users">Accueil</a>
	</div>



</body>
</html>