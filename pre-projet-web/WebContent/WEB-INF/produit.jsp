
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pege produit</title>
<link rel="stylesheet" href="Ressources\css\produit.css">
</head>
<body>
	
		<div>
			<h1 id="produit alimentaire">Produits Alimentaires</h1>
		</div>
<c:forEach items="${ProduitsAlimentaires }" var="produit">
		<div class="produit">
			<h2>${produit.prix }</h2>
			<a
				href="produit_detail?url=${produit.url }&nom=${produit.nom }&prix=${produit.prix }">

				<img src="${produit.url }" alt="${produit.nom }" title="${produit.nom }" />
			</a>

			<h3>${produit.nom }</h3>
		</div>
	</c:forEach>	


	</fieldset>

	<div>
		<div id="accueil produit">
			<a href="accueil">Accueil</a>
		</div>



	</div>



</body>
</html>