package TD3;

public class exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float Notes[]=new float[30];
		float n;
		int i;
		
		for(i=0;i<=29;i++) {
			System.out.print("Entrez la "+(i+1)+" note : ");
			n=Clavier.lireFloat();
			
			if(n<=18) {
				Notes[i]=n+2;
			}
			else {
				Notes[i]=20;
			}
		}
	}

}
