package TD2;

public class exo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 11 du TD2
		// Ecrivez un algorithme qui :
		// - demande � l'utilisateur de saisir un chiffre
		// - v�rifie que c'est bien un chiffre (entre 0 et 9)
		// - affiche ce chiffre en lettres ("un", "deux"...)
		
		// D�claration des variables de types entier et cha�ne de caract�res
		int chiffre; // Chiffre entr� par l'utilisateur
		String lettres="z�ro"; // Cha�ne de caract�res contenant la valeur du chffre en lettres
		
		// Demande pour que l'utilisateur entre un chiffre
		// Affectation de la valeur � la variable pour
		System.out.print("Saisissez un chiffre : ");
		chiffre=Clavier.lireInt();
		
		// Test pour v�rifier si la valeur entr�e est bien un chiffre
		if(chiffre>=0 && chiffre<=9) {
			// Choix fait par l'ordinateur en fonction du chiffre
			// Affectation � lettres de la valeur du chiffre en lettres
			switch(chiffre) {
					case 1: lettres="un"; break;
					case 2: lettres="deux"; break;
					case 3: lettres="trois"; break;
					case 4: lettres="quatre"; break;
					case 5: lettres="cinq"; break;
					case 6: lettres="six"; break;
					case 7: lettres="sept"; break;
					case 8: lettres="huit"; break;
					case 9: lettres="neuf"; break;
					case 10: lettres="z�ro"; break;
			}
			// Affichage du chiffre �crit en lettres
			System.out.println(lettres);
		}
		else {
			// Affichage en cas d'erreur (nombre et non chiffre entr�)
			System.out.println("Erreur");
		}
	}

}
