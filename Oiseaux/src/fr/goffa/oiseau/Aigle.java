
package fr.goffa.oiseau;

public class Aigle extends Oiseau implements OiseauVolent {

	public Aigle() {

	}

	public Aigle(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);

	}

	public void chasser() {
		System.out.println(" chasser");

	}

	@Override
	public void voler() {
		System.out.println(" Voler");

	}

}
