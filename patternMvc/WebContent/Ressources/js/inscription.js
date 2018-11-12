
function validerFormulaire() {
    console.log("validerFormulaire");
    var Nom = document.getElementById("nom");
    console.log(Nom.value);
    var Prenom = document.getElementById("prenom");
    console.log(Prenom.value);
    var phonE =document.getElementById("phone");
    console.log(phonE.value);
    var emaiL = document.getElementById("email");
    console.log(emaiL.value);
    var villE = document.getElementById("ville");
    console.log(villE.value);


    var dateNaissance = document.forms["inscription-forms"].elements["date-naissance"].value;
    console.log(dateNaissance);
    var dateNaissanceFormatDate = new Date(dateNaissance);
    console.log(dateNaissanceFormatDate);
    console.log(new Date());
    if(dateNaissanceFormatDate > new Date () || dateNaissance === "") {
        console.log("erreur dateNaissance ");
        document.getElementById("date-naissance").className = "erreur";

    } else{
        document.getElementById("date-naissance").classList.remove("erreur");
    }

    if (Nom.value =="" || Nom.value.trim() === ""){
         console.log("erreurNom");
         document.getElementById("nom").className = "erreur";
    }else{
        document.getElementById("nom").classList.remove("erreur");
    }
    if(Prenom.value=="" || Prenom.value.trim()=== ""){
        console.log("erreurPrenom");
        document.getElementById("prenom").className="erreur";
    }else {
        document.getElementById("prenom").classList.remove("erreur");
    }
    if(phonE.value=="" || phonE.value.trim()=== ""){
        console.log("erreurphonE");
        document.getElementById("phone").className = "erreur";
    }else{
        document.getElementById("nom").classList.remove("erreur");
    }
    if(emaiL.value=="" || emaiL.value.trim()===""){
        console.log("erreuremaiL");
        document.getElementById("email").className = "erreur";
    }else{
        document.getElementById("email").classList.remove("erreur");
    }
    if (villE.value=="" || villE.value.trim()===""){
        console.log("erreurvillE");
        document.getElementById("ville").className="erreur";
    }else {
        document.getElementById("ville").classList.remove("erreur");
    }

        phonE = document.getElementById("phone");
    console.log(phonE);
    console.log(phonE.value);
    console.log(phonE.value.length);
    if (phonE.value.length<10 || phonE.value.trim()) {
        document.getElementById("phone").className="erreur";

    }else{
        document.getElementById("phone").classList.remove("erreur");
    }

}
