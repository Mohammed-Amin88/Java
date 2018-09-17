
public class IfelseififELsecondition {

	public static void main(String[] args) {


			/*
			 * La condition IF ELSE 
			 * if(condition){
			 * 		traitement1;
			 * } else{
			 * 		traitement2;
			 * }
			 */

			double  moyenne =10 ;
			
			if(moyenne >= 10) {
				System.out.println("Vous avez eu une bonne moyenne");
			}

			if(moyenne <= 10) {
				System.out.println("Vous avez eu une mauvaise moyenne");
			}

			int note = 10 ;
			if(note >= 10) {
				System.out.println("======> Vous avez eu une bonne note");
			}else {
				System.out.println("Vous avez eu une mauvaise note");
			}


			float notes = 15f;
			int coef = 3 ;
			float resultat = notes * coef ; 

			if(resultat >= 50) {
				System.out.println("Resultat = " + resultat);
			}else {
				System.out.println("resultat insuffisant");	
			}	


		



		///  notJava = 14                 coefJava = 3 
		///  notHtml = 14                 coefHtml = 2 
		///   notJavascript = 9            coefJavasc = 3 
		//////   notCss = 14                  coefcss = 1
		//////      moyenne
		/////       moyenne > 18   ==> Très bien 
		/////       moyenne > 15   ==> Bien
		/////       moyenne > 12   ==> Assez bien
		/////       moyenne > 10   ==> Moyen
		/////       moyenne > 8    ==> Il peut faire mieux
		/////       moyenne > 5    ==> Il faut plus de travail 
		/////         SINON               ==> A l’année prochaine, même heure, même endroit




		/////Declaration

		double notejava = 14;
		double notehtml = 14;
		double notejavasc = 9;
		double notecss = 14;
		int coefjava = 3;
		int coefhtml =2;
		int coefjavasc=3;
		int coefcss = 1;
		moyenne =(notejava * coefjava) + (notehtml * coefhtml )+ (notejavasc * coefjavasc) +(notecss * coefcss )/ (coefjava +coefhtml +coefjavasc + coefcss);

		//Affectation

		if (moyenne > 18) {
			System.out.println("Tres bien");
		}else if (moyenne > 15) {
			System.out.println("Bien");
		}else if ( moyenne > 12) {
			System.out.println("Assez bien");
		}else if (moyenne > 10)
			System.out.println("moyen");
		else if (moyenne > 8) System.out.println("Il peut faire mieux");
		else if( moyenne > 5)System.out.println("Il faut plus de travail");

		else {
			System.out.println("A l’année prochaine, même heure, même endroit");
		}
		}
}
	
	
	

