package TD3;

public class exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// version de l'énoncé
		int i;
		int Nb[]=new int[10];
		
		for(i=0;i<=9;i++) {
			Nb[i]=i*i;
		}
		for(i=0;i<=9;i++) {
			System.out.println(Nb[i]);
		}
		
		
		// version amélioré
		int j;
		int Nb2[]=new int[10];
		
		for(j=0;j<=9;j++) {
			Nb2[j]=j*j;
			System.out.println(Nb2[j]);
		}
	}

}
