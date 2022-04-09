package TD3;

public class exo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,j,nombre=0;
		float note,moyenne=0;
		float Notes[];
		
		System.out.print("Entrez le nombre de notes : ");
		n=Clavier.lireInt();
		Notes=new float[n];
		
		for(i=0;i<=n-1;i++){
			System.out.print("Entrez une note : ");
			note=Clavier.lireInt();
			Notes[i]=note;
			moyenne+=note;
		}
		
		moyenne=moyenne/n;
		
		for(j=0;j<=n-1;j++){
			if(Notes[j]>moyenne){
				nombre+=1;
			}
		}
		
		System.out.println("Il y a "+nombre+" notes au dessus de la moyenne de la classe qui est de "+moyenne);
	}

}
