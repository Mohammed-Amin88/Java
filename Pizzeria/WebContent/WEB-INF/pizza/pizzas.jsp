<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="ressources/css/produit.css">
<meta charset="ISO-8859-1">
<title>Page pizzeria JDBC</title>
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
			<th>Libelle</th>
			<th>Reference</th>
			<th>Prix</th>
			<th>Url</th>
		</tr>

		<c:forEach items="${listePizza}" var="pizza">
			<tr>
				<td>${pizza.id }</td>
				<td>${pizza.libelle }</td>
				<td>${pizza.ref }</td>
				<td>${pizza.prix }</td>
				<td>${pizza.url}</td>
				<td><a href="modifier_pizza?id=${pizza.id}" />Modifier Pizza</td>
				<td><a href="suppression_pizza?id=${pizza.id}" />Supprimer
					Pizza</td>

			</tr>
		</c:forEach>

	</table>


	<a href="ajout_pizza"> Ajouter Pizza</a>
	<c:forEach items="${listePizza}" var="pizza">
		<div class="pizza">
			<h2>${pizza.prix }</h2>
			<a
				href="pizza_detail?url=${pizza.url }&nom=${pizza.libelle }&prix=${pizza.prix }">

				<img src="ressources/images/${pizza.url }" alt="${pizza.libelle }"
				title="${pizza.libelle }" />
			</a>

			<h3>${pizza.libelle }</h3>
		</div>
	</c:forEach>

</body>
</html>