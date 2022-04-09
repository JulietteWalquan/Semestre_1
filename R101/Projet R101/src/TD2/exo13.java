package TD2;

public class exo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 13 du TD2
		// Ecriivez un algorithme qui demande l'âge d'un enfant à l'utilisateur
		// Ensuite il l'informe de sa catégorie
		
		// Déclaration de la variable de type int
		int age; // l'âge de l'enfant
		
		// Demande pour que l'utilisateur entre l'âge de l'enfant
		// Affectation à la variable pour
		System.out.print("Entrez l'âge de l'enfant : ");
		age=Clavier.lireInt();
		
		// Tests pour déterminer sa tranche d'âge
		// Affichage de sa catégorie
		if(age>=6 && age<8) {
			System.out.println("Votre enfant est dans la catégorie Poussin.");
		}
		else if(age>=8 && age<10) {
			System.out.println("Votre enfant est dans la catégorie Pupille.");
		}
		else if(age>=10 && age<12) {
			System.out.println("Votre enfant est dans la catégorie Minime.");
		}
		else if(age>=12) {
			System.out.println("Votre enfant est dans la catégorie Cadet.");
		}
		// En cas d'âge trop jeune
		else {
			System.out.println("Votre enfant est trop jeune");
		}
	}
	
}
