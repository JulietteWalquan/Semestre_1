package TD2;

public class exo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 12 du TD2
		// Ecrivez un algorithme qui calcule et affiche le maximum et le
		// minimum de 50 valeurs fournies en différé 
		// (on ne lira qu'une seule fois chaque valeur)
		
		// Déclaration des variables de types réel et entier
		float min; // nombre minimum
		float max; // nombre maximum
		float val; // valeur entrée par l'utilisateur
		int i; // variable sevant dans la boucle pour
		
		// Demande pour que l'utilisateur entre la valeur qu'il souhaite
		// Affectation de la valeur entrée à la variable pour
		System.out.print("Entrez une première valeur : ");
		val=Clavier.lireFloat();
		
		// Initialisation du minimum et du maximum à la valeur entrée
		min=val;
		max=val;
		
		// Boucle pour qui permet de comparer chaque nouvelle valeur avec les minimum et maximum actuels
		for(i=0;i<50;i++) {
			// Demande pour que l'utilisateur entre la nouvelle valeur qu'il souhaite
			// Affectation de la valeur entrée à la variable val
			System.out.print("Entrez une autre valeur : ");
			val=Clavier.lireFloat();
			
			// Test pour déterminer si la nouvelle valeur est plus grande 
			// ou plus petite que les maximum et minimum actuels
			if(val>max) {
				max=val;
			}
			else if(val<min) {
				min=val;
			}
		}
		
		// Affichage du minimum et du maximum des 50 valeurs entrées
		System.out.println("Le maximum des 50 valeurs est "+max);
		System.out.println("Le minimum des 50 valeurs est "+min);
	}

}
