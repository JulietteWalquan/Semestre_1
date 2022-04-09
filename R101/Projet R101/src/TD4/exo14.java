package TD4;

public class exo14 {

	public static boolean sontInvOuOpp(float a, float b) {
		// TODO Auto-generated method stub

		boolean present;
		float inv, opp;
		
		inv=a*b;
		opp=a+b;
		
		if((inv==1) ^ (opp==0)) {
			present=true;
		}
		else {
			present=false;
		}
		
		return(present);
	}
	
	public static boolean existeInvOuOppConsecutifs(float Tab1[]) {
		
		boolean present=false;
		int i, n;
		
		n=Tab1.length;
		
		for(i=0;i<n;i++) {
			if(sontInvOuOpp(Tab1[i],Tab1[i+1])) {
				present=true;
			}
		}
		
		return(present);
	}
	
	public static void main(String[] args) {
		
		float n1, n2;
		boolean reponse;
		
		System.out.print("Entrez un nombre : ");
		n1=Clavier.lireInt();
		System.out.print("Entrez un nombre : ");
		n2=Clavier.lireInt();
		
		reponse=sontInvOuOpp(n1,n2);
		System.out.println("Est-ce que les nombres sont inverses ou opposés ? "+reponse);
		
		float Tab2[];
		int i, n, n_tab;
		
		System.out.print("Entrez le nombre de case dans le tableau : ");
		n=Clavier.lireInt();
		
		Tab2=new float[n];
		
		System.out.println("Entrez chacune des valeurs du tableau tour à tour :");
		for(i=0;i<n;i++) {
			n_tab=Clavier.lireInt();
			Tab2[i]=n_tab;
		}
		
		reponse=existeInvOuOppConsecutifs(Tab2);
		System.out.println("Est-ce que le tableau contient deux nombres consécutifs inverses ou opposés ? "+reponse);
	}
}
