
package fr.goffa.vehicules;

public class Voiture extends Vehicule {

	private int nombreDePortes;

	public Voiture() {
		super();

	}

	public Voiture(String marque, String couleur, int vitesse, int puissance, int prix, int kilometrage,
			int nombreDePortes) {
		super(marque, couleur, vitesse, puissance, prix, kilometrage);
		this.nombreDePortes = nombreDePortes;

	}

	public int getNombreDePortes() {
		return nombreDePortes;
	}

	public void setNombreDePortes(int nombreDePortes) {
		this.nombreDePortes = nombreDePortes;
	}

}
