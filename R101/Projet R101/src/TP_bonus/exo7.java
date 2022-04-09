package TP_bonus;

public class exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tableau4[];
		int long_tab;
		int valeur;
		int somme_imp=0;
		int somme_indice_imp=0;
		int i;
		
		System.out.print("Entrez le nombre de valeurs du tableau : ");
		long_tab = Clavier.lireInt();
		
		tableau4 = new int[long_tab];
		for(i=0;i<long_tab;i++) {
			System.out.println("Entrez la valeur "+i+" de type entier du tableau : ");
			valeur = Clavier.lireInt();
			tableau4[i] = valeur;
		}
		
		for(i=0;i<long_tab;i++) {
			if(tableau4[i]%2!=0) {
				somme_imp+=tableau4[i];
			}
		}
		
		for(i=1;i<long_tab;i+=2) {
			somme_indice_imp+=tableau4[i];
		}
		
		System.out.println("La somme des entiers impairs présents dans le tableau est : "+somme_imp);
		System.out.println("La somme des entiers dont l'indice est impair dans le tableau est : "+somme_indice_imp);
	}

}
