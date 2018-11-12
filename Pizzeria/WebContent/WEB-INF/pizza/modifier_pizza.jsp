<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Modifier Pizza</title>
</head>
<body>

	<form action="modifier_pizza" method="POST">


		<label for="libelle">Libelle</label> 
		<input type="text" name="libelle"
			placeholder="libelle" id="libelle" value="${pizza.libelle}" /><br>
		<label for="reference">Reference</label>
		 <input type="text"
			name="reference" placeholder="reference" id="reference"
			value="${pizza.ref}" /><br>
			 <label for="prix">Prix</label>
		<input type="text" name="prix" placeholder="prix" id="prix" value="${pizza.prix}"/><br>
		<label for="url">Url</label>
		 <input type="text" name="url"
			placeholder="url" id="url" value="${pizza.url}"/><br>
			<input hidden type="text" name="id" placeholder="ID" id="id" value="${pizza.id }"/>
			 <input type= "submit" value="valider">
			
	</form>


</body>
</html>