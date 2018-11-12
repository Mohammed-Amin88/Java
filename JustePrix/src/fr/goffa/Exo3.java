package fr.goffa;

import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir un nombre");

		int nombre = sc.nextInt();
		int nombreLeplusGrand = Integer.MIN_VALUE;

		for (int i = 1; i <= nombre; i++) {
			int nombreSaisi = sc.nextInt();
			if (nombreSaisi > nombreLeplusGrand) {
				nombreLeplusGrand = nombreSaisi;
			}

		}
		System.out.println("le nombrele plus grand :" + nombreLeplusGrand);

		System.out.println("Veuillez saisir un nombre");

		int nombre2 = sc.nextInt();
		int nombreLeplusPetit = Integer.MAX_VALUE;

		for (int i = 1; i <= nombre2; i++) {
			int nombreSaisi = sc.nextInt();
			if (nombreSaisi < nombreLeplusPetit) {
				nombreLeplusPetit = nombreSaisi;
			}

		}
		System.out.println("le nombre le plus petit :" + nombreLeplusPetit);

	}
}
