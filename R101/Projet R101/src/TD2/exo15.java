package TD2;

public class exo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 15 du TD2
		// Ecrivez un algorithme qui exprime une somme d'argent (enti�re) 
		// entre 0 et 50 euros (fournis par l'utilisateur), en un nombre de
		// pi�ces/billets de 1, 2 et 5 euros.
		
		// D�claration des variables de types entier
		int argent; // Somme d'argent entr�e par l'utilisateur
		int difference; // Diff�rence entre la somme d'argent et la valeur de la pi�ce / du billet 
		int cinq=0; // Nombre de billet de 5�
		int deux=0; // Nombre de pi�ce de 2�
		int un=0; // Nombre de pi�ce de 1�
		
		// Demande � l'utilisateur d'entrer une somme d'argent
		// Affectation de la valeur entr�e � la variable pour
		System.out.print("Entrez une somme d'argent entre 0 et 50� : ");
		argent=Clavier.lireInt();
		
		// Test pour d�terminer si la somme se situe bien entre 0 et 50�
		if((argent<0) || (argent>50)) {
			// Affichage d'une erreur
			System.out.println("La somme d'argent doit �tre comprise entre 0 et 50�.");
		}
		else {
			difference=argent;
			
			// 3 boucles tant que successives pour d�terminer le nombre de billet de 5 ou de pi�ces de 2 et 1� contient la diff�rence
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
			
			// Affichage de la somme d'argent entr�e en nombre de billet de 5 et de pi�ce de 2 et 1�
			System.out.println(argent+"� : "+cinq+" billets de 5�, "+deux+" pi�ces de 2� et "+un+" pi�ce de 1�.");
		}
	}

}
