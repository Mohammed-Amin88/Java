<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page perssones</title>
<link rel="stylesheet" href="Ressources\css\produit.css">


</head>
<body>


<div>
			<h1>Perssones</h1>
		</div>
<c:forEach items="${Personnes}" var="persone" varStatus="i">
		<div class="produit">
			<a href="user_detail_session
			?id=${i.index }
			
			">

				<img src="${persone.url }" alt="${persone.nom }" title="${persone.prenom }" />
			</a>

			<h3>${persone.nom } ${persone.prenom }</h3>
			
		</div>
	</c:forEach>	

</body>
</html>