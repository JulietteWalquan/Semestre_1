package TD2;

public class exo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 9 du TD2
		// Quelle est la valeur de n apr�s les instructions suivantes : 
		
		// D�claration des variables de type entier et initialisation � 0
		int n=0;
		int i=0; // variable servant dans la boucle tant que
		int j=0; // variable servant dans la deuxi�me boucle pour
		
		// Boucle tant que qui se r�p�te tant que i est inf�rieure ou �gale � 3
		while(i<=3){
			// Incr�mentation de n de 1 � chaque ex�cution de la boucle pour
			for(j=0;j<=i;j++) {
				n++;
			}
			i++; // incr�mentation de i de 1
		}
		
		// Affichage de la valeur de n qui est 10
		System.out.println(n);
	}

}
