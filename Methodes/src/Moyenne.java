
public class Moyenne {

	public static void main(String[] args) {
		float noteJava = 14f ; 
		float noteHtml = 13f ; 
		float noteJavascript = 9f ; 
		float noteCss = 8.5f ;


		int coefJava = 3 ; 
		int coefHtml = 2; 
		int coefJavascript = 3 ; 
		int coefCSs = 1;

		float moyenne = ((noteJava * coefJava ) 
				+ (noteHtml * coefHtml) 
				+ (noteJavascript * coefJavascript) 
				+ (noteCss * coefCSs) )
				/ (coefJava + coefHtml + coefJavascript + coefCSs);



		System.out.println("La moyenne = " + moyenne);

		if(moyenne > 18) {
			System.out.println("Très bien");
		}else if(moyenne > 15) {
			System.out.println("Bien");
		}else if(moyenne > 12) {
			System.out.println("Assez bien");
		}else if(moyenne > 10) {
			System.out.println("Moyen");
		}else if(moyenne > 8) {
			System.out.println("Il peut faire mieux");
		}else if(moyenne > 5) {
			System.out.println("Il faut plus de travail");
		}else {
			System.out.println("A l’année prochaine, même heure, même endroit ;)");


		}
		// verifier la moyenne si < 15
		// on change la valeur des coefs 


		if (moyenne < 15) {

			coefJava = 1 ; 
			coefHtml = 3; 
			coefJavascript = 2 ; 
			coefCSs = 3;

			moyenne = ((noteJava * coefJava ) 
					+ (noteHtml * coefHtml) 
					+ (noteJavascript * coefJavascript) 
					+ (noteCss * coefCSs)) 
					/ (coefJava + coefHtml + coefJavascript + coefCSs);



			System.out.println("La moyenne = " + moyenne);

			if(moyenne > 18) {
				System.out.println("Très bien");
			}else if(moyenne > 15) {
				System.out.println("Bien");
			}else if(moyenne > 12) {
				System.out.println("Assez bien");
			}else if(moyenne > 10) {
				System.out.println("Moyen");
			}else if(moyenne > 8) {
				System.out.println("Il peut faire mieux");
			}else if(moyenne > 5) {
				System.out.println("Il faut plus de travail");
			}else {
				System.out.println("A l’année prochaine, même heure, même endroit ");
			}

			// on calcule la moyenne si la moyenne < 10
			// on change les coefs		


			if( moyenne < 10) {

				coefJava = 3 ; 
				coefHtml = 3; 
				coefJavascript = 4 ; 
				coefCSs = 3;
				moyenne = (noteJava * coefJava ) 
						+ (noteHtml * coefHtml) 
						+ (noteJavascript * coefJavascript) 
						+ (noteCss * coefCSs) 
						/ (coefJava + coefHtml + coefJavascript + coefCSs);



				System.out.println("La moyenne = " + moyenne);

				if(moyenne > 18) {
					System.out.println("Très bien");
				}else if(moyenne > 15) {
					System.out.println("Bien");
				}else if(moyenne > 12) {
					System.out.println("Assez bien");
				}else if(moyenne > 10) {
					System.out.println("Moyen");
				}else if(moyenne > 8) {
					System.out.println("Il peut faire mieux");
				}else if(moyenne > 5) {
					System.out.println("Il faut plus de travail");
				}else {
					System.out.println("A l’année prochaine, même heure, même endroit ;)");
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			
			
			
			}	
		}
	}
}






