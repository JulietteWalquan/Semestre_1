package TP_bonus;

public class exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float min;
		float max;
		float Tab[];
		int n;
		int i;
		float valeur;
		
		System.out.print("Entrez le nombre de valeurs du tableau : ");
		n = Clavier.lireInt();
		Tab = new float[n];
		
		for(i=0;i<n;i++) {
			System.out.println("Entrez la valeur "+i+" du tableau : ");
			valeur = Clavier.lireFloat();
			Tab[i] = valeur;
		}
		
		min = Tab[0];
		max = Tab[0];
		for(i=1;i<n;i++) {
			if(Tab[i]<min) {
				min = Tab[i];
			}
			
			if(Tab[i]>max) {
				max = Tab[i];
			}
		}
		
		System.out.println("L'élément le plus petit du tableau est "+min);
		System.out.println("L'élément le plus grand du tableau est "+max);
	}

}
