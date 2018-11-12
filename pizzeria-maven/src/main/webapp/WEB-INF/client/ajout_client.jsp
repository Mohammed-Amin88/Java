<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Ajout Client</title>
</head>
<body>

	<form action="ajout_client" method="POST">

		<label for="numero_client">Numero_Client</label> <input type="text"
			name="numero_client" placeholder="numero_client" id="numero_client" /><br>
		<label for="Nom">Nom</label> <input type="text" name="Nom"
			placeholder="Nom" id="Nom" /><br> <label for="Prenom">Prenom</label>
		<input type="text" name="Prenom" placeholder="Prenom" id="Prenom" /><br>
		<label for="Adress">Adresse</label> <input type="text" name="Adress"
			placeholder="Adresse" id="Adress" /><br> <label for="Tel_Fixe">Tel_Fixe</label>
		<input type="text" name="Tel_Fixe" placeholder="Tel_Fixe"
			id="Tel_Fixe" /><br> <label for="Tel_Portable">Tel_Portable</label>
		<input type="text" name="Tel_Portable" placeholder="Tel_Portable"
			id="Tel_Portable" /><br> <label for="Date_Naissance">Date_Naissance</label>
		<input type="text" name="Date_Naissance" placeholder="Date_Naissance"
			id="Date_Naissance" /><br> <label for="Email">Email</label> <input
			type="text" name="Email" placeholder="Email" id="Email" /><br>



		<input type="submit" value="valider">
	</form>





</body>
</html>