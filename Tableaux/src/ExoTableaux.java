
////-----------------------------------------------------------------------------------------------------17/09/2018

//	Déclaration et affectation d'un tableau de cours
//	Afficher le texte "Veuillez saisir un nom :"
//	Attendre que l'utilisateur entre une valeur 
//	mettre la valeur dans une variable 
//	parcourir le tableau 
//	comparer le contenu du tableau avec la valeur enttée par l'utilisateur 
//	SI la valeur = a la valeur du tableau 
//	Afficher "La valeur " + valeur + " se trouve à l'indice " i
//	SINON 
//	Afficher "La valeur "  + valeur  + " est différente de la valeur présnete dans le tableau à l'indice " + i





import java.util.Scanner;

public class ExoTableaux {

	public static void main(String[] args) {

		String cours[] = {"Java" , "Html", "CSS", "Javascript", "PHP", "C++","NodeJS", "NET", "Typescript", "Golang", "Scala", "Kotlin"};

		System.out.println("Veuillez saisir un nom :");

		Scanner sc = new Scanner(System.in);

		String matiere = sc.next();

		for (int i = 0; i < cours.length; i++) {

			//System.out.println(cours[i]);

			if 	(cours[i].equals(matiere)){
				System.out.println(matiere + " se trouve à l'indice "  + i );
			}


		}
		///// 	

		String recherche = sc.next() ;

		boolean existe = false ;
		for (int i = 0; i < cours.length; i++) {

			if(cours[i].equals(matiere)) {
				existe = true;
			}
		}
		if(existe) {
			System.out.println(" matiere " + recherche + " Existe dans le tableau");
		}else {
			System.out.println(" matiere " + recherche + " n'Existe pas dans le tableau");
			}
		
		}
}