package TP_bonus;

public class exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int i;
		float somme=0;
		
		System.out.print("Entrez un nombre entier : ");
		n = Clavier.lireInt();
		
		for(i=1;i<=n;i++) {
			somme += 1/i;
		}
		
		System.out.println("La somme des "+n+" premiers termes de la série de harmonique est "+somme);
	}

}
