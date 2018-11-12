package fr.goffa.vehicules;

public class Vehicule {

	protected String marque;
	protected String couleur;
	protected int vitesse;
	protected int puissance;
	protected int prix;
	protected int kilometrage;

	public Vehicule() {
		super();
	}

	public Vehicule(String marque, String couleur, int vitesse, int puissance, int prix, int kilometrage) {
		super();
		this.marque = marque;
		this.couleur = couleur;
		this.vitesse = vitesse;
		this.prix = prix;
		this.kilometrage = kilometrage;
	}

	/// Actions:

	public void demarrer() {
		System.out.println("          ==> Démarrage     ");

	}

	public void accelerer() {
		System.out.println("           ===> Acclerrer    ");
	}

	public void freiner() {
		System.out.println(" Frein ABS.");
	}

	public void rouler() {
		System.out.println("           =====> Je roule en mode sport      ");
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

}
