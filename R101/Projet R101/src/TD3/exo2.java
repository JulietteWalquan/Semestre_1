package TD3;

public class exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float Notes[]=new float[15];
		int i;
		float n;
		
		for(i=0;i<=14;i++) {
			do {
				System.out.print("Entrez une note : ");
				n=Clavier.lireFloat();
			}while (n>0);
			
			Notes[i]=n;
		}
	}

}
