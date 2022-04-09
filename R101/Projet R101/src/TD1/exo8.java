package TD1;

public class exo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 8 du TD1
		// On considère la recette suivante :
		// -- Choisir un nombre entier N. Lui ajouter 5. 
		// Multiplier la somme obtenue par le nombre N choisi. 
		// Ajouter 14 à ce produit. Ecrire le résultat. --
		// Ecrire un algorithme qui prend en entrée un nombre entier N 
		// et qui renvoie le résultat de la recette dans une variable R 
		// (l'algorithme devra contenir exactement 3 instructions d'affectation.
		
		// Déclarations de 2 variables de type entier
		int N;
		int R;
		
		// Demande à l'utilisateur pour qu'il entre la valeur de N
		// Affectation de la valeur entrée à la variable pour
		System.out.print("Entrez la valeur de N : ");
		N=Clavier.lireInt();
		
		
		// Exécution de la recette 
		R=N+5;
		R=R*N;
		R=R+14;
		
		// Affichage du résultat de la recette
		System.out.println("Le résultat est : "+R);
	}

}
