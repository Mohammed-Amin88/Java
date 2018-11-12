<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Clients</title>
</head>
<style>
td, tr, th, table {
	border: green 2px solid;
	border-collapse: collapse;
}
</style>
<body>
	<table>
		<tr>

			<th>ID</th>
			<th>NUMERO CLIENT</th>
			<th>NOM</th>
			<th>PRENOM</th>
			<th>ADRESSE</th>
			<th>TEL-FIXE</th>
			<th>TEL-PORTABLE</th>
			<th>DATE NAISSANCE</th>
			<th>E.MAIL</th>
		</tr>




		<c:forEach items="${listeClients }" var="client">
			<tr>





				<td>${client.id }</td>
				<td>${client.numClient }</td>
				<td>${client.nom }</td>
				<td>${client. prenom}</td>
				<td>${client.adresse }</td>
				<td>${client.telFixe}</td>
				<td>${client.telPortable }</td>
				<td>${client.dateNaissance }</td>
				<td>${client.email }</td>
				<td><a href="client?id=${client.id}" />Detail</td>
				<td><a href="modifier_client?id=${client.id}" />Modifier</td>




			</tr>







		</c:forEach>





	</table>
	
	<a href="ajout_client"> Ajouter Client</a>


</body>
</html>