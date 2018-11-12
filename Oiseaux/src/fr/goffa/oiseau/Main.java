
package fr.goffa.oiseau;

public class Main {

	public static void main(String[] args) {

		Aigle Dark = new Aigle("Pygargue à tête blanche", 145, 66, "Americain", true);
		Dark.chasser();
		System.out.println(" Aigle Americain");

		Aigle Asie = new Aigle(" Hight", 122, 58, "Asie", true);

		Asie.chasser();
		System.out.println("Aigle Asie");

		Manchot Royal = new Manchot("Royal", 55, 120, "Apténodytes", true);
		Royal.nager();

		int resultat = Utils.soustraction(Dark.getPoids(), Asie.getPoids());

		System.out.println(" DefAiglePoids = " + resultat);
	}
}
