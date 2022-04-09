package TD3;

public class exo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float valeur;
		int n,i;
		float Tab[];
		
		System.out.print("Entrez le nombre de valeurs du tableau : ");
		n=Clavier.lireInt();
		Tab=new float[n];
		
		for(i=0;i<=(n-1);i++) {
			System.out.print("Entrez une valeur : ");
			valeur=Clavier.lireFloat();
			Tab[i]=valeur+1;
		}
		
		System.out.println("Les nouvelles valeurs du tableau sont :");
		for(i=0;i<=(n-1);i++) {
			System.out.println(Tab[i]);
		}
	}

}
