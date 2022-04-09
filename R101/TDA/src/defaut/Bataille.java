package defaut;

import file.*;
import java.util.Random;

public class Bataille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File joueur1 = new FileParChainage();
		File joueur2 = new FileParChainage();
		int n;
		int alea;
		int a, b;
		File bataille = new FileParChainage();
		Random r = new Random();

		System.out.print("Choisissez le nombre de cartes a distribuer (entre 3 et 26) : ");
		n = Clavier.lireInt();
		if (n >= 3 && n <= 26) {
			System.out.println("Les cartes du joueur 1 : ");
			for (int i = 0; i < n; i++) {
				alea = r.nextInt(13) + 1;
				joueur1.enfiler(alea);
				System.out.println(alea);
			}
			System.out.println("Les cartes du joueur 2 : ");
			for (int i = 0; i < n; i++) {
				alea = r.nextInt(13) + 1;
				joueur2.enfiler(alea);
				System.out.println(alea);
			}

			try {
				while ((joueur1.longueur() >= 1) || (joueur2.longueur() >= 1)) {
					System.out.println("Le joueur 1 possède : " + joueur1.longueur() + " cartes.");
					System.out.println("Le joueur 2 possède : " + joueur2.longueur() + " cartes.");
					System.out.println("Le nombre de cartes en attente de bataille : " + bataille.longueur());
					a = (int) joueur1.defiler();
					b = (int) joueur2.defiler();
					System.out.println("Joueur 1 : " + a);
					System.out.println("Joueur 2 : " + b);

					if (a > b) {
						joueur1.enfiler(a);
						joueur1.enfiler(b);
						if (!bataille.fileVide()) {
							for (int j = 0; j <= bataille.longueur(); j++) {
								joueur1.enfiler(bataille.defiler());
							}
						}

					} else if (b > a) {
						joueur2.enfiler(b);
						joueur2.enfiler(a);
						if (!bataille.fileVide()) {
							for (int j = 0; j <= bataille.longueur(); j++) {
								joueur2.enfiler(bataille.defiler());
							}
						}

					} else if (a == b) {
						System.out.println("----------");
						System.out.println("Bataille !");
						bataille.enfiler(a);
						bataille.enfiler(b);
						bataille.enfiler(joueur1.defiler());
						bataille.enfiler(joueur2.defiler());
						System.out.println("----------");
					}
				}

			} catch (FileVideException e) {
				if (joueur1.fileVide()) {
					System.out.println("Bravo ! Le joueur 2 a gagné.");
				}
				if (joueur2.fileVide()) {
					System.out.println("Bravo ! Le joueur 1 a gagné.");
				}
			}

		} else {
			System.out.println("Erreur : veuillez enter un nombre de cartes entre 3 et 26.");
		}

	}

}
