<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page test jstl</title>
</head>
<body>


<a href = "http://localhost:8080/pre-projet-web/test_jstl?param1=10&param2=20">10/20</a></br>
<a href = "http://localhost:8080/pre-projet-web/test_jstl?param1=20&param2=30">20/30</a></br>
<a href = "http://localhost:8080/pre-projet-web/test_jstl?param1=30&param2=40">30/40</a></br>
<a href = "http://localhost:8080/pre-projet-web/test_jstl?param1=40&param2=50">40/50</a></br>

<a href = "http://localhost:8080/pre-projet-web/test_jstl?param1=${ligneRandom}&param2=${colonneRandom}">Random</a></br>

<%-- 
	<c:forEach var="i" begin="1" end="10" step="1">
		<c:if test="${i ne 5 }">
			<h1>${i}</h1>
		</c:if>


	</c:forEach>
 --%>	<table>
		<tr>
			<c:set var="nombre" value="0" />
			<c:forEach var="i" begin="1" end="3">
				<c:forEach var="j" begin="1" end="5">

					<td>${nombre=nombre+1}</td>
				</c:forEach>
		</tr>

		</c:forEach>
	</table>


	<c:set var="nombre" value="0" />
	<c:set var="l" value="10" />
	<c:set var="c" value="15" />

	<table>
		<tr>
			<c:forEach var="i" begin="1" end="${l}" step="2">

				<c:forEach var="j" begin="1" end="${c}">
					<td>${nombre=nombre+2 }</td>
				</c:forEach>
		</tr>
		<tr>
			</c:forEach>
	</table>

	<c:set var="nombre" value="0" />
	<c:set var="l" value="10" />
	<c:set var="c" value="15" />

	<table>
		<tr>
			<c:forEach var="i" begin="1" end="${l}">

				<c:forEach var="j" begin="1" end="${c}">
					<td>${nombre=nombre+1 }</td>

				</c:forEach>
		</tr>
		<tr>
			</c:forEach>
			

			
	</table>


	<c:set var="nombre" value="1" />


	<table>
	
	<tr>
		<c:forEach var="i" begin="1" end="${ligne}">

			<c:forEach var="j" begin="1" end="${colonne}">

				<c:choose>
					<c:when test="${nombre mod 5 !=0 }">
						<td>${nombre}</td>

					</c:when>
					<c:otherwise>
						<td>*</td>
					</c:otherwise>
				</c:choose>
				<c:set var="nombre" value="${nombre + 1}"/>
			</c:forEach>
			</tr>
			<tr>
		</c:forEach>
	</table>
	
	
	
	
	
</body>
</html>