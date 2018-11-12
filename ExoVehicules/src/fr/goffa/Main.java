package fr.goffa;

import fr.goffa.vehicules.Camion;
import fr.goffa.vehicules.Voiture;

public class Main {

	public static void main(String[] args) {

		Voiture c3 = new Voiture("citroen", "rouge", 230, 6, 15000, 0, 5);
		System.out.println("NombreDeportes = " + c3.getNombreDePortes());

		System.out.println("         New Citroen Sport       ");

		c3.demarrer();
		c3.accelerer();
		c3.rouler();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println(" Je roule depuis 1h j’ai besoin d'une pause");
		System.out.println("     --------( Freiner svp )--------         ");

		System.out.println(" Citroen new c3 sport  " + "NombreDeportes  = " + c3.getNombreDePortes());

		Camion fh16 = new Camion("VOLVO", "vert", 180, 24, 100000, 5000, 26);
		System.out.println("VOLVO TRUCK FH16 " + "Capacite =  " + fh16.getCapacite() + 't');

		Camion mercedes = null;
		if (fh16.getCapacite() < 25) {
			mercedes = new Camion("Mercedes Benz", "Blanc", 200, 75, 150000, 0, 30);
			System.out.println("Mercedes Benz TRUCK " + " Capacite = " + mercedes.getCapacite() + 't');

			mercedes.demarrer();
			mercedes.accelerer();
			mercedes.rouler();
		} else {
			fh16.demarrer();
			fh16.accelerer();
			fh16.rouler();

		}
	}

}
