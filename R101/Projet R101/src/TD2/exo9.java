package TD2;

public class exo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 9 du TD2
		// Quelle est la valeur de n après les instructions suivantes : 
		
		// Déclaration des variables de type entier et initialisation à 0
		int n=0;
		int i=0; // variable servant dans la boucle tant que
		int j=0; // variable servant dans la deuxième boucle pour
		
		// Boucle tant que qui se répète tant que i est inférieure ou égale à 3
		while(i<=3){
			// Incrémentation de n de 1 à chaque exécution de la boucle pour
			for(j=0;j<=i;j++) {
				n++;
			}
			i++; // incrémentation de i de 1
		}
		
		// Affichage de la valeur de n qui est 10
		System.out.println(n);
	}

}
