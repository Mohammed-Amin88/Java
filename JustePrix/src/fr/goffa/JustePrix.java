
package fr.goffa;

import java.util.Random;
import java.util.Scanner;

public class JustePrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random random = new Random();
		int prixaleatoire = random.nextInt(201);

		System.out.println("Veuillez saisir un nombre entre 0 et 200");
		int prix;

		do {
			prix = sc.nextInt();

			if (prixaleatoire == prix) {
				System.out.println("félicitation vous avez trouvé le bon prix ");
			} else if (prix > prixaleatoire) {
				System.out.println("c'est moins");
			} else {
				System.out.println("c'est plus ");
			}

		} while (prixaleatoire != prix);

	}
}
