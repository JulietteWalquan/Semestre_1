package TD2;

public class exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 3 du TD2
		// Ecrivez une algorithme qui permet de lire une note, 
		// de v�rifier si ccette note est bien entre 0 et 20, 
		// et d'afficher la mention associ�e � cette note
		
		// D�claration de la variable de type r�el
		float note; // note rentr�e
		
		// Demande � l'utilisateur pour qu'il entre la note
		// Affectation de la valeur entr�e � la variable pour
		System.out.print("Quelle est la note ? ");
		note=Clavier.lireFloat();
		
		// Test d'erreur
		if(note<0 || note>20) {
			System.out.println("Veuillez entrer une valeur comprise entre 0 et 20");
				}
		// Diff�rents test pour d�terminer la mention associ�e � la note puis affiche de la mention
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
			System.out.println("Tr�s bien");
		}
		
	}

}
