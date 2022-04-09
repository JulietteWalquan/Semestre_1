package TD2;

public class exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 2 du TD2
		// Ecrivez un algorithme qui demande le sexe et la situation matrimoniale 
		// d'une personne et en fonction des réponses peut dire l'une des 
		// salutations suivantes :
		// - Bonjour monsieur
		// - Bonjour madame
		// - Bonjour mademoiselle
		
		// Déclaration  des variables de type chaine de caractères
		String sexe; // Sexe de la personne
		String mariage; // Situation matrimoniale de la personne
		
		// Demande à l'utilisateur pour qu'il entre son sexe et sa situation matrimoniale
		// Affectation de la valeur entrée à la variable pour
		System.out.println("Quel est votre sexe ?");
		sexe=Clavier.lireString();
		System.out.println("Êtes vous marié ?");
		mariage=Clavier.lireString();
		
		// Premier test pour déterminer si la personne est un homme
		if(sexe.equals("homme")) {
			// Affichage de la bonne salutation
			System.out.println("Bonjour monsieur");
		}
		else {
			// Deuxième test pour déterminer si la femme est mariée
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
