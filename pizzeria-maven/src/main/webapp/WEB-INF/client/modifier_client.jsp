<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Modifier Client</title>
</head>
<body>
	<form action="modifier_client" method="POST">
	
	
<input type="text"
			name="id" id="id"
			value="${client.id}" hidden="hidden"/>
		<label for="numero_client">Numero_Client</label> <input type="text"
			name="numero_client" placeholder="numero_client" id="numero_client"
			value="${client.numClient}" /><br> <label for="Nom">Nom</label>
		<input type="text" name="Nom" placeholder="Nom" id="Nom"
			value="${client.nom }" /> <br> <label for="Prenom">Prenom</label>
		<input type="text" name="Prenom" placeholder="Prenom" id="Prenom"
			value="${client.prenom}" /><br> <label for="Adress">Adresse</label>
		<input type="text" name="Adress" placeholder="Adresse" id="Adress"
			value="${client.adresse}" /><br> <label for="Tel_Fixe">Tel_Fixe</label>
		<input type="text" name="Tel_Fixe" placeholder="Tel_Fixe"
			id="Tel_Fixe" value="${client.telFixe}" /><br> <label
			for="Tel_Portable">Tel_Portable</label> <input type="text"
			name="Tel_Portable" placeholder="Tel_Portable" id="Tel_Portable"  value="${client.telPortable}"  /><br>
		<label for="Date_Naissance">Date_Naissance</label> <input type="text"
			name="Date_Naissance" placeholder="Date_Naissance"
			id="Date_Naissance" value="${client.dateNaissance}" /><br> <label
			for="Email">Email</label> <input type="text" name="Email"
			placeholder="Email" id="Email" value="${client.email}" /><br> <input
			type="submit" value="valider">
	</form>






</body>
</html>