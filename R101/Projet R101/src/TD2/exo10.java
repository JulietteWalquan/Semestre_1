package TD2;

public class exo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 10 du TD2
		// Ecrivez un algorithme qui calcule la somme de tous les entiers de 1 � n
		// Utilisez tout d'abord la boucle tant que, puis la boucle pour
		
		// avec la boucle tant que
		
		// D�claration des variables de type entier et initialisation � 0 pour certaines
		int somme=0; // somme de tous les entiers
		int n; // entier entr� par l'utilisateur
		int i=0; // variable servant dans la boucle tant que
		
		// Demande pour que l'utilisateur entre un nombre entier
		// Affectation de la valeur ent�e � la variable pour
		System.out.print("Entrez un nombre : ");
		n=Clavier.lireInt();
		
		// Boucle tant que qui calcule la somme tant que i est inf�rieur ou �gale � n
		while(i<=n) {
			somme+=i;
			i++; // incr�mentation de i de 1
		}
		
		// Affichage de la somme
		System.out.println(somme);
		
		
		
		// avec la boucle "pour"
		
		// D�claration des variables de type entier et initialisation � 0 pour certaine
		int somme2=0; // somme de tous les entiers
		int n2; // entier entr� par l'utilisateur
		int i2; // variable servant dans la boucle pour
		
		// Demande pour que l'utilisateur entre un nombre entier
		// Affectation de la valeur ent�e � la variable pour
		System.out.print("Entrez un nombre : ");
		n2=Clavier.lireInt();
		
		// Boucle pour qui calcule la somme 
		for(i2=0;i2<=n2;i2++) {
			somme2+=i2;
		}
		
		// Affichage de la somme
		System.out.println(somme2);
	}

}
