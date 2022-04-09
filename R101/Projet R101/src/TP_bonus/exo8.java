package TP_bonus;

public class exo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Faire le tableau compt_valeur en 2 dimensions, la 1 pour comparer la valeur et la 2 pour compter le nombre d'occurence
		// Donc compt_valeur n'aura que 10 valeurs : de 0 � 9
		
		int tableau5[];
		int long_tab;
		int valeur;
		int i;
		int compt_valeur[][]=new int [10][10];
		
		System.out.print("Entrez le nombre de valeurs du tableau : ");
		long_tab = Clavier.lireInt();
		
		tableau5 = new int[long_tab];
		for(i=0;i<long_tab;i++) {
			System.out.println("Entrez la valeur "+i+" de type entier du tableau : ");
			valeur = Clavier.lireInt();
			tableau5[i] = valeur;
		}
		
		for(i=0;i<10;i++) {
			// trouver comment entrer des valeurs dans les tableaux en 2 dimensions
			compt_valeur[i][i] =;
		}
		
		for(i=0;i<long_tab;i++) {
			
		}
	}

}
