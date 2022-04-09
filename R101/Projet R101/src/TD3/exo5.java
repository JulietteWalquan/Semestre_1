package TD3;

public class exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Tableau2[]=new int[10];
		int n,i,j;
		
		System.out.print("Entrez un nombre entier supérieur à 0 : ");
		n=Clavier.lireInt();
		
		for(i=0;i<=9;i++) {
			Tableau2[i]=i*2;
		}
		
		if(n>10) {
			for(j=0;j<=9;j++) {
				System.out.println(Tableau2[j]);
			}
		}
		else {
			for(j=9;j>=(10-n);j--) {
				System.out.println(Tableau2[j]);
			}
		}
	}

}
