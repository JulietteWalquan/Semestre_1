package TD2;

public class exo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 13 du TD2
		// Ecriivez un algorithme qui demande l'�ge d'un enfant � l'utilisateur
		// Ensuite il l'informe de sa cat�gorie
		
		// D�claration de la variable de type int
		int age; // l'�ge de l'enfant
		
		// Demande pour que l'utilisateur entre l'�ge de l'enfant
		// Affectation � la variable pour
		System.out.print("Entrez l'�ge de l'enfant : ");
		age=Clavier.lireInt();
		
		// Tests pour d�terminer sa tranche d'�ge
		// Affichage de sa cat�gorie
		if(age>=6 && age<8) {
			System.out.println("Votre enfant est dans la cat�gorie Poussin.");
		}
		else if(age>=8 && age<10) {
			System.out.println("Votre enfant est dans la cat�gorie Pupille.");
		}
		else if(age>=10 && age<12) {
			System.out.println("Votre enfant est dans la cat�gorie Minime.");
		}
		else if(age>=12) {
			System.out.println("Votre enfant est dans la cat�gorie Cadet.");
		}
		// En cas d'�ge trop jeune
		else {
			System.out.println("Votre enfant est trop jeune");
		}
	}
	
}
