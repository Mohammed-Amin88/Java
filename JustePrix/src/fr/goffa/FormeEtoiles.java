package fr.goffa;

import java.util.Scanner;

public class FormeEtoiles {

	public static void main(String[] args) {
		/*
		 * Carré plein :
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir un nombre");
		int nombre = sc.nextInt();

		for (int i = 0; i < nombre; i++) {

			for (int j = 0; j < nombre; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}
}
