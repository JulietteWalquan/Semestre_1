package TD1;

public class exo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 11 du TD1
		// Ecrire un algorithme qui lit la longueur et la largeur d'une pi�ce et qui affiche sa surface
		
		// D�claration des variables de type r�el
		float longueur; // longueur de la pi�ce
		float largeur; // largeur de la pi�ce
		float surface; // surface de la pi�ce
		
		// Demande � l'utilisateur pour qu'il entre la longueur et la largeur de la pi�ce
		// Affectation de la valeur entr�e � la variable pour
		System.out.print("Entrez la longueur de la pi�ce : ");
		longueur=Clavier.lireFloat();
		System.out.print("Entrez la largeur de la pi�ce : ");
		largeur=Clavier.lireFloat();
		
		// Calcul puis affichage de la surface de la pi�ce
		surface=longueur*largeur;
		System.out.println("Voici la surface de la pi�ce : "+surface);
	}

}
