package TP_bonus;

public class exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tableau3[];
		int long_tab;
		int n;
		int i;
		int valeur;
		int premiere=-1;
		int derniere=-1;
		
		System.out.print("Entrez le nombre de valeurs du tableau : ");
		long_tab = Clavier.lireInt();
		
		tableau3 = new int[long_tab];
		for(i=0;i<long_tab;i++) {
			System.out.println("Entrez la valeur "+i+" de type entier du tableau : ");
			valeur = Clavier.lireInt();
			tableau3[i] = valeur;
		}
		
		System.out.print("Entrez la valeur � chercher : ");
		n = Clavier.lireInt();
		
		for(i=0;i<long_tab;i++) {
			if(tableau3[i]==n) {
				if(premiere==-1) {
					premiere = i;
				}
				else {
					derniere = i;
				}
			}
		}
		
		if(premiere!=-1 && derniere==-1) {
			System.out.println ("La premi�re occurrence de n est � la position "+premiere);
		}
		else if(premiere!=-1 && derniere!=-1) {
			System.out.println("La premiere occurence de n est � la position "+premiere+" et sa derniere � la position "+derniere);
		}
		else {
			System.out.println("n n'a aucune occurrence dans ce tableau.");
		}
	}

}
