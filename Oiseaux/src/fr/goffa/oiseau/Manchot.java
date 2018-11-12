
package fr.goffa.oiseau;

public class Manchot extends Oiseau implements OiseauNager {

	public Manchot() {
	}

	public Manchot(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);

	}

	@Override
	public void nager() {
		System.out.println("======nager====");
	}

}
