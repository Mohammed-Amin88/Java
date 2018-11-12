package fr.goffa;

import java.util.Scanner;

public class ExoFactorialle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir un nombre");
		int nombre = sc.nextInt();

		int resultatFactorialle = 1;

		for (int i = 1; i <= nombre; i++) {
			resultatFactorialle = resultatFactorialle * i;
		}
		System.out.println(resultatFactorialle);

	}
}
