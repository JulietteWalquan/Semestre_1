package TD3;

public class exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float somme=0, val;
		float Tab[]=new float[10];
		int i;
		
		for(i=0;i<10;i++) {
			System.out.print("Entrez un nombre réel : ");
			val=Clavier.lireFloat();
			
			Tab[i]=val;
			
			somme+=val;
		}
		
		System.out.println("La somme des valeurs du tableau est "+somme);
	}

}
