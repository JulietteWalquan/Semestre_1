package TD2;

public class exo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 15 du TD2
		// Ecrivez un algorithme qui exprime une somme d'argent (entière) 
		// entre 0 et 50 euros (fournis par l'utilisateur), en un nombre de
		// pièces/billets de 1, 2 et 5 euros.
		
		// Déclaration des variables de types entier
		int argent; // Somme d'argent entrée par l'utilisateur
		int difference; // Différence entre la somme d'argent et la valeur de la pièce / du billet 
		int cinq=0; // Nombre de billet de 5€
		int deux=0; // Nombre de pièce de 2€
		int un=0; // Nombre de pièce de 1€
		
		// Demande à l'utilisateur d'entrer une somme d'argent
		// Affectation de la valeur entrée à la variable pour
		System.out.print("Entrez une somme d'argent entre 0 et 50€ : ");
		argent=Clavier.lireInt();
		
		// Test pour déterminer si la somme se situe bien entre 0 et 50€
		if((argent<0) || (argent>50)) {
			// Affichage d'une erreur
			System.out.println("La somme d'argent doit être comprise entre 0 et 50€.");
		}
		else {
			difference=argent;
			
			// 3 boucles tant que successives pour déterminer le nombre de billet de 5 ou de pièces de 2 et 1€ contient la différence
			while(difference>5){
				difference-=5;
				cinq++;
			}
			
			while(difference>2){
				difference-=2;
				deux++;
			}
			
			if(difference==1){
				difference-=1;
				un++;
			}
			
			// Affichage de la somme d'argent entrée en nombre de billet de 5 et de pièce de 2 et 1€
			System.out.println(argent+"€ : "+cinq+" billets de 5€, "+deux+" pièces de 2€ et "+un+" pièce de 1€.");
		}
	}

}
