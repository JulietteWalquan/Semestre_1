package TD2;

public class exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 3 du TD2
		// Ecrivez une algorithme qui permet de lire une note, 
		// de vérifier si ccette note est bien entre 0 et 20, 
		// et d'afficher la mention associée à cette note
		
		// Déclaration de la variable de type réel
		float note; // note rentrée
		
		// Demande à l'utilisateur pour qu'il entre la note
		// Affectation de la valeur entrée à la variable pour
		System.out.print("Quelle est la note ? ");
		note=Clavier.lireFloat();
		
		// Test d'erreur
		if(note<0 || note>20) {
			System.out.println("Veuillez entrer une valeur comprise entre 0 et 20");
				}
		// Différents test pour déterminer la mention associée à la note puis affiche de la mention
		if(note>=0 && note<10) {
			System.out.println("Insuffisant");
		}
		if(note>=10 && note<12) {
			System.out.println("Passable");
		}
		if(note>=12 && note<14) {
			System.out.println("Assez bien");
		}
		if(note>=14 && note<16) {
			System.out.println("Bien");
		}
		if(note>=16 && note<=20) {
			System.out.println("Très bien");
		}
		
	}

}
