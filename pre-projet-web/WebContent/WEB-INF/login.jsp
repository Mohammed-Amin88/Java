<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

<c:out value="bonjour"/><br/>

<c:out value=" ${helloJstl}"/><br/>


Nom : ${jackInfos.nom }<br/>
Prenom :${jackInfos.prenom}<br/>
Date de naissance :${jackInfos.dateDeNaissance }<br/>
Numero de telephone :${jackInfos.numeroTelephone}<br/>
E.mail :${jackInfos.mail}<br/>
Numero de rue :${jackInfos.numeroRue}<br/>
Ville :${jackInfos.ville}<br/>

Login :<input type="text" value="${login }" id="login"/><br/>

Password :<input type="text" value="${passWord}" id="password"/><br/>


Resultat1 = ${nombre1 + nombre2 }<br/>
Resultat2 = ${nombre1 - nombre2 }<br/>
Resultat3 = ${nombre1 * nombre2 }<br/>
Resultat4 = ${nombre1 / nombre2}<br/>

5 > 10 :${5 gt 10 }<br/>
10 < 5 :${10 lt 5}<br/>
5 == 4 : ${5 eq 4 }<br/>
10 <= 10 :${10 le 10 }<br/>
15 >= 10 : ${15 ge 10}<br/>
15 * 10 : ${15 * 10 }<br/>
Gestion des variables nombre1 et nombre2 : <br/>
$(nombre1)gt $(nombre2):${nombre1 gt nombre2}<br/>
${nombre1} / ${nombre2 }: ${nombre1 div nombre2 }<br/>
${empty "g"}<br/>











</body>
</html>