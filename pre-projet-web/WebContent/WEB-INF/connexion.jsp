<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page connexion</title>
<link rel="stylesheet" href="Ressources\css\connexion.css">
</head>
<body>
<div>
    <fieldset id="fieldset1">
         <h1>Bonjour <span id="goffa">goffa</span></h1>
         <h2>vous etes : <span id="connecté">connecté</span> </h2>
    </fieldset>


</div>



<div>

    <fieldset id="fieldset2">

    <form>
        <h1>formulaire</h1>
        <label for="login">  Login   </label><input type="text" id="login"/>
        <label for="password"> password </label><input type="text" id="password"/>

    </form>
    </fieldset>

    <fieldset id="fieldset3">

       <form>
             <label for="number"> Number </label><input type="number" id="number"/>
            <label for="date"> Date naissance  </label><input type="date" id="date"/>
       </form>


        <form>
             <label for="time"> Time </label><input type="time" id="time"/>
             <label for="color"> Color  </label><input type="color" id="color"/>
        </form>

        <form>

            <label for="radio"> Radio </label><input type="radio" id="radio"/>
            <label for="checkbox"> Checkbox  </label><input type="checkbox" id="checkbox"/>

        </form>




    </fieldset>


</div>
<form
        method="post" action="">

</form>


<div>
    <a href="accueil"> Accueil </a>
</div>



</body>
</html>