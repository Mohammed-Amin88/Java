
package fr.goffa.vehicules;

public class Car extends Vehicule {
	private int NombreDePlaces;

	public Car() {
		super();
	}

	public Car(String marque, String couleur, int vitesse, int puissance, int prix, int kilometrage) {
		super(marque, couleur, vitesse, puissance, prix, kilometrage);
	}

	public int getNombreDePlaces() {
		return NombreDePlaces;
	}

	public void setNombreDePlaces(int nombreDePlaces) {
		NombreDePlaces = nombreDePlaces;
	}

}
