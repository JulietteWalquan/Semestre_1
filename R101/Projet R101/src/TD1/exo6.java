package TD1;

public class exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 6 du TD1
		// Faire un algorithme qui permet de permuter les valeurs de 2 variables
		
		// Déclaration de 3 variables de type réel
		float x;
		float y;
		float z;
		
		// Différentes manipulations des variables pour permutter leurs valeurs
		x=3;
		y=5;
		z=x; // variable intermédiaire qui permet de stocker la valeur de x avant de lui donner la valeur de y
		x=y;
		y=z;
		
		// Affichage des valeurs des variables maintenant permutées
		System.out.println(x+" ; "+y+" et "+z);
		
	}

}
