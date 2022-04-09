package TD1;

public class exo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 11 du TD1
		// Ecrire un algorithme qui lit la longueur et la largeur d'une pièce et qui affiche sa surface
		
		// Déclaration des variables de type réel
		float longueur; // longueur de la pièce
		float largeur; // largeur de la pièce
		float surface; // surface de la pièce
		
		// Demande à l'utilisateur pour qu'il entre la longueur et la largeur de la pièce
		// Affectation de la valeur entrée à la variable pour
		System.out.print("Entrez la longueur de la pièce : ");
		longueur=Clavier.lireFloat();
		System.out.print("Entrez la largeur de la pièce : ");
		largeur=Clavier.lireFloat();
		
		// Calcul puis affichage de la surface de la pièce
		surface=longueur*largeur;
		System.out.println("Voici la surface de la pièce : "+surface);
	}

}
