package TP_bonus;

public class exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1;
		double racineCarre;
		
		while(n!=0) {
			System.out.print("Entrez un nombre entier : ");
			n = Clavier.lireInt();
			
			racineCarre = Math.sqrt(n);
			System.out.println("La racine carré de "+n+" est "+racineCarre);
		}
	}

}
