package TD3;

public class exo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,position,i;
		float valeur,max;
		float Tab[];
		
		System.out.print("Entrez le nombre de valeurs du tableau : ");
		n=Clavier.lireInt();
		Tab=new float[n];
		
		for(i=0;i<=n-1;i++){
			System.out.print("Entrez une valeur : ");
			valeur=Clavier.lireFloat();
			Tab[i]=valeur;
		}
		
		max=Tab[0];
		position=0;
		
		for(i=0;i<=n-1;i++){
			if(Tab[i]>max){
				max=Tab[i];
				position=i;
			}
		}
		
		System.out.println("La plus grande valeur du tableau est "+max+" à la position "+position);
	}

}
