package TD1;

public class exo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 8 du TD1
		// On consid�re la recette suivante :
		// -- Choisir un nombre entier N. Lui ajouter 5. 
		// Multiplier la somme obtenue par le nombre N choisi. 
		// Ajouter 14 � ce produit. Ecrire le r�sultat. --
		// Ecrire un algorithme qui prend en entr�e un nombre entier N 
		// et qui renvoie le r�sultat de la recette dans une variable R 
		// (l'algorithme devra contenir exactement 3 instructions d'affectation.
		
		// D�clarations de 2 variables de type entier
		int N;
		int R;
		
		// Demande � l'utilisateur pour qu'il entre la valeur de N
		// Affectation de la valeur entr�e � la variable pour
		System.out.print("Entrez la valeur de N : ");
		N=Clavier.lireInt();
		
		
		// Ex�cution de la recette 
		R=N+5;
		R=R*N;
		R=R+14;
		
		// Affichage du r�sultat de la recette
		System.out.println("Le r�sultat est : "+R);
	}

}
