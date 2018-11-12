package fr.goffa;

import java.util.Scanner;

public class FormrEtoiles2 {

	public static void main(String[] args) {
		/*
		 * Carré vide :
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir un nombre");
		int nombre = sc.nextInt();

		for (int i = 0; i < nombre; i++) {
			for (int j = 0; j < nombre; j++) {
				if (i == 0 || j == 0 || i == nombre - 1 || j == nombre - 1) {

					System.out.print("* ");
				} else {

					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
