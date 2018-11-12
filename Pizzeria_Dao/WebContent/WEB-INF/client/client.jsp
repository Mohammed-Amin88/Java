<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Client Detail</title>
</head>
<body>
	<h1> Id : ${client.id }</h1>
	<h1>Num_client :${client.numClient }</h1>
	<h1>Nom:${client.nom }</h1>
	<h1>Prenom:${client. prenom}</h1>
	<h1>Adress:${client.adresse }</h1>
	<h1>Tel_fixe :${client.telFixe}</h1>
	<h1>Tel_portable:${client.telPortable }</h1>
	<h1>Date naissance :${client.dateNaissance }</h1>
	<h1>E.mail :${client.email }</h1>

</body>
</html>

