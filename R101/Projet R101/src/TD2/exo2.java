package TD2;

public class exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 2 du TD2
		// Ecrivez un algorithme qui demande le sexe et la situation matrimoniale 
		// d'une personne et en fonction des r�ponses peut dire l'une des 
		// salutations suivantes :
		// - Bonjour monsieur
		// - Bonjour madame
		// - Bonjour mademoiselle
		
		// D�claration  des variables de type chaine de caract�res
		String sexe; // Sexe de la personne
		String mariage; // Situation matrimoniale de la personne
		
		// Demande � l'utilisateur pour qu'il entre son sexe et sa situation matrimoniale
		// Affectation de la valeur entr�e � la variable pour
		System.out.println("Quel est votre sexe ?");
		sexe=Clavier.lireString();
		System.out.println("�tes vous mari� ?");
		mariage=Clavier.lireString();
		
		// Premier test pour d�terminer si la personne est un homme
		if(sexe.equals("homme")) {
			// Affichage de la bonne salutation
			System.out.println("Bonjour monsieur");
		}
		else {
			// Deuxi�me test pour d�terminer si la femme est mari�e
			if(mariage.equals("oui")) {
				// Affichage de la bonne salutation
				System.out.println("Bonjour madame");
			}
			else {
				// Affichage de la bonne salutation
				System.out.println("Bonjour mademoiselle");
			}
		}
	}

}
