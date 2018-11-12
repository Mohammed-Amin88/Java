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


		<img src="${personne.url}" alt="${personne.nom }" title="${personne.nom }" />
		<h3>${personne.prenom} ${personne.nom }</h3>


	</div>
	<h4>${personne.dateDeNaissance}</h4>
	<h4>${personne.numeroTelephone}</h4>
	<h4>${personne.mail}</h4>
	<h4>${personne.numeroRue}</h4>
	<h4>${personne.ville}</h4>

	<div id="accueil produit">
		<a href="users">Accueil</a>
	</div>



</body>
</html>