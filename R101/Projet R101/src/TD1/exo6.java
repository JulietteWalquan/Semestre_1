package TD1;

public class exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 6 du TD1
		// Faire un algorithme qui permet de permuter les valeurs de 2 variables
		
		// D�claration de 3 variables de type r�el
		float x;
		float y;
		float z;
		
		// Diff�rentes manipulations des variables pour permutter leurs valeurs
		x=3;
		y=5;
		z=x; // variable interm�diaire qui permet de stocker la valeur de x avant de lui donner la valeur de y
		x=y;
		y=z;
		
		// Affichage des valeurs des variables maintenant permut�es
		System.out.println(x+" ; "+y+" et "+z);
		
	}

}
