package TP_bonus;

public class exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ligne;
		int i;
		int j;
		
		System.out.print("Entrez le nombre de lignes : ");
		ligne = Clavier.lireInt();
		
		for(i=1;i<ligne*2;i+=2) {
			for(j=0;j<i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
