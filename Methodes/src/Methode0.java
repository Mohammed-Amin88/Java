

  import java.util.Scanner;
  
public class Methode0 {
	//	// public static typederetour  nomdelamethgode ( arg .... )

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre 1 :");
		float nombre1 = sc.nextFloat();

		System.out.println("Veuillez saisir l'operation :");
		String operation = sc.next();

		System.out.println("Veuillez saisir le nombre 2 :");
		float nombre2 = sc.nextFloat();

		float resultat = addition(nombre1,nombre2);
	    float resultat2 = soustraction(nombre1,nombre2);
	    float resultat3 = multiplication(nombre1,nombre2);
	    float resultat4 = division(nombre1,nombre2);
	    
		
		if (operation.equals("+")) {
	    	System.out.println("Le Resultat de l'Addition est :" + nombre1 + " + " +nombre2+  " = " +  resultat);        
		}else if(operation.equals("*") || operation.equals("x")) {
	    	System.out.println("Le Resultat de la Multiplication est : " + nombre1 + " * " +nombre2+  " = " +  resultat3);	
		}else if (operation.equals("-")) {
	    	System.out.println( "Le Resultat de la Soustraction est : " + nombre1 + " - " +nombre2+  " = " +  resultat2);
		}else if (operation.equals("/")) {
	    	System.out.println("Le Resultat de la Division est : " + nombre1 + " / " +nombre2+  " = " +  resultat4);
		}
		
		

	}
	   
	/*
	 * Declaration de la methode 
	 */


	public static int addition(int nombre1, int nombre2) {
		int resultat = nombre1 + nombre2;
		return resultat;}


	public static float addition(float nombre1, float nombre2) {
		float resultat = nombre1 + nombre2;
		return resultat;	
	}

	public static float soustraction(float nombre1, float nombre2) {
		float resultat2 = nombre1 - nombre2;
		return resultat2;}

	public static int soustraction(int nombre1, int nombre2) {
		int resultat2 = nombre1 - nombre2;
		return resultat2;
	}

	public static int multiplication(int nombre1, int nombre2) {
		int resultat3 = nombre1 * nombre2;
		return resultat3;}

	public static float multiplication(float nombre1, float nombre2) {
		float resultat3 = nombre1 * nombre2;
		return resultat3;}

	public static int division(int nombre1, int nombre2) {
		int resultat4 = nombre1 / nombre2;
		return resultat4;}
	public static float division(float nombre1, float nombre2) {
		float resultat4 = nombre1 / nombre2;
		return resultat4;
		}
	
		
	}


