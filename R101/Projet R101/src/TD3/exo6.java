package TD3;

public class exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float Tab[];
		int n,neg=0,pos=0,i;
		float val;
		
		do {
			System.out.print("Entrez le nombre de valeurs à saisir : ");;
			n=Clavier.lireInt();
		}while (n<0);
		
		Tab=new float[n];
		
		for(i=0;i<n;i++) {
			System.out.print("Entrez un nombre réel : ");
			val=Clavier.lireFloat();
			
			Tab[i]=val;
			
			if(val>=0) {
				pos++;
			}
			else {
				neg++;
			}
		}
		
		System.out.println("Il y a "+pos+" valeurs positives et "+neg+" valeurs négatives");
	}

}
