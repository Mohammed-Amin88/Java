
package fr.goffa.vehicules;

public class Camion extends Vehicule {

	private int capacite;

	public Camion() {
		super();
	}

	public Camion(String marque, String couleur, int vitesse, int puissance, int prix, int kilometrage, int capacite) {
		super(marque, couleur, vitesse, puissance, prix, kilometrage);
		this.capacite = capacite;
	}

	public Camion(int capacite) {
		super();
		this.capacite = capacite;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

}
