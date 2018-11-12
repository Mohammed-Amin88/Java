<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page ajout pizza </title>

</head>
<body>
	<form action="ajout_pizza" method="POST">


		<label for="libelle">Libelle</label> <input type="text" name="libelle"
			placeholder="libelle" id="libelle" /><br> 
			<label for="reference">Reference</label> 
			<input type="text" name="reference" placeholder="reference" id="reference" /><br> 
			<label for="prix">Prix</label>
		<input type="text" name="prix" placeholder="prix" id="prix" /><br>
		<label for="url">Url</label> 
		<input type="text" name="url" placeholder="url" id="url" /><br> 
			<input type="submit" value="valider">
	</form>
	


</body>
</html>