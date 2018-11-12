<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MVC Detail</title>
<link rel="stylesheet" href="Ressources\css\produit.css">
</head>
<body>
<div class="produit">
		<h2>${prix }</h2>
		<img src="${url }"
			alt="${nom }" title="${nom }" />
		<h3>${nom }</h3>
	</div>

</body>
</html>