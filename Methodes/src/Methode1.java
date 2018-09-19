


public class Methode1 {

	public static void main(String[] args) {

		

		int addition1215 = addition(12,15);
		System.out.println(addition1215);

		int addition1516 = addition(15,16);
		System.out.println( addition1516);
		float addition11 = addition2(11.5f,15.5f);
		System.out.println(addition11);
		double addition33 = addition(505 ,400);
		System.out. println(addition33);

		int div1 = div(6,2);
		System.out.println(div1);
		double div2 = div(100.0,20);
		System.out.println(div2);
		float div3 = div(15.5f,15.5f);
		System.out.println(div3);

		int multi1 = multi(5,6);
		System.out.println(multi1);
		double multi2 = multi(600,500);
		System.out.println(multi2);

		



	}

	public static int addition (int nombre1,int nombre2) {


		int resultat = nombre1 + nombre2 ;
		return resultat;
	}

	public static float addition2 (float nombre1, float nombre2) {
		float resultat2 = nombre1 + nombre2 ;
		return resultat2;
	}
	public static double addition3 (double nombre1, double nombre2) {
		double resultat3 = nombre1 + nombre2;
		return resultat3;

	}
	public static int div (int nombre1 , int nombre2) {
		int resultat4 = nombre1 / nombre2;
		return resultat4;
	}
	public static double div (double nombre1 , double nombre2) {
		double resultat5 = nombre1 / nombre2;
		return resultat5;
	}
	public static float div (float nombre1, float nombre2) {
		float resultat6 = nombre1 /nombre2;
		return resultat6;

	}
	public static int multi (int nombre1,int nombre2 ) {
		int resultat7 = nombre1 * nombre2;
		return resultat7;
	}
	public static double multi(double nombre1, double nombre2) {
		double resultat8 = nombre1 * nombre2;
		return resultat8;
	}
}

