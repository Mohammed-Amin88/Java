
package fr.goffa.oiseau;

public class Autruche extends Oiseau {
	public Autruche() {

	}

	public Autruche(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
	}

	public void courir() {
		System.out.println(" courir");
	}

}
