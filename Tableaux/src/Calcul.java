
//------------------------------------------------------------------------------------------------------------------------------------------18/09/20181

///Affiche le message "Veuillez saisir un nombre 1 :"
///Demander � l'utilisateur de saisir un nombre et l'affecter � une variable 
//Afficher e message "Veuillez choisir l'op�ration" 
//Demander � l'utilisateur de saisir un caract�re et l'affecter � une variable 
//Afficher le message "Veuillez saisir un nombre 2 :"
//V�rifier le type d'op�ration et faire le calcul en fonction de lu caract�re saisi par l'utilisateur
//SI l'op�ration ==  '+' faire une addition du nombre 1 et du nombre 2 et affecter le r�sultat � une variable result 
//SINON SI l'op�ration == '-' faire une soustraction du nombre 1 et du nombre 2 et affecter le r�sultat � une variable result 
//SINON SI l'op�ration == '*' faire une multiplication du nombre 1 et du nombre 2 et affecter le r�sultat � une variable result 
//SINON SI l'op�ration == '/' faire une division du nombre 1 et du nombre 2 et affecter le r�sultat � une variable result 
//Afficher  nombre1 op nombre2 = result 
//Exemple 
//SI l'utilisateur saisi 5 ensuite + puis 10 on affiche 
//5 + 10 = 15 


import java.util.Scanner;

public class Calcul {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Veuillez saisir un nombre 1 :");

		int nombre1 = sc.nextInt();

		System.out.println("Veuillez choisir l'op�ration  " );

		String operation = sc.next();

		System.out.println("Veuillez saisir un nombre 2 :");
		int nombre2 = sc.nextInt();
		int resultat = 0;
		if(operation.equals("+")) {
			System.out.println(" resultat = " + (nombre1 + nombre2));
		}else if (operation.equals("-")) {
			System.out.println("resultat = "  + (nombre1 - nombre2));
		}else if (operation.equals("*")){
			System.out.println(" resultat = " + (nombre1 * nombre2));
		}else if(operation.equals("/")){ 
			System.out.println ("resultat  = " + (nombre1 / nombre2));
		}
	}

}



