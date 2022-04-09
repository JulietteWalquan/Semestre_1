package TD3;

public class exo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ça marche pas tant pis 
		
		int Tab[];
		int n,somme,i,j,valeur;
		boolean consecutif=true;
		
		System.out.print("Entrez le nombre de valeurs du tableau : ");
		n=Clavier.lireInt();
		Tab=new int[n];
		
		System.out.print("Entrez la première valeur : ");
		valeur=Clavier.lireInt();
		Tab[0]=valeur;
		
		for(i=1;i<=n-1;i++){
			System.out.print("Entrez une valeur : ");
			valeur=Clavier.lireInt();
			
			if(valeur>=Tab[i-1]){
				Tab[i]=valeur;
			}
			else{
				j=i;
				for(int k=i;k<=0;k--){
					if(valeur<Tab[j-1]){
						Tab[j]=Tab[j-1];
						Tab[j-1]=valeur;
						j-=1;
					}
					else{
						break;
					}
				}
			}
		}
		
		for(i=0;i<=n;i++){
			somme=Tab[i]-Tab[i+1];
			
			if(somme==Tab[i+2]){
				consecutif=true;
			}
			else{
				consecutif=false;
				break;
			}
		}
		
		if(consecutif==true){
			System.out.println("Les éléments du tableau sont tous consécutifs.");
		}
		else{
			System.out.println("Les éléments du tableau ne sont pas tous consécutifs.");
		}
	}

}
