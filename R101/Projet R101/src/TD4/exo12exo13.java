package TD4;

public class exo12exo13 {

	public static float Max(float x,float y) {
		// TODO Auto-generated method stub
		
		// Séparer les 2 exercices dans 2 fichiers et les tester dans chacun

		float maxi;
		
		if(x>=y){
			maxi=x;
		}
		else{
			maxi=y;
		}
		
		return maxi;
	}


	public static float MaxTrois(float x, float y, float z) {
		// TODO Auto-generated method stub

		float maxiBis, un=0, deux=0, trois=0;
		
		un=Max(x,y);
		deux=Max(x,z);
		trois=Max(y,z);
		
		if((un>=deux) && (un>=trois)) {
			maxiBis=un;
		}
		else if((deux>=un) && (deux>=trois)) {
			maxiBis=deux;
		}
		else {
			maxiBis=trois;
		}
		
		return(maxiBis);
	}
	
	public static void main(String[] args){
		
		float n,m,grand;
		
		System.out.println("Exercice 12 :");
		System.out.print("Entrez un nombre : ");
		n=Clavier.lireFloat();
		System.out.print("Entrez un nombre : ");
		m=Clavier.lireFloat();
		
		grand=Max(n,m);
		
		System.out.println(grand);
		
		float a,b,c,grandBis;
		
		System.out.println("Exercice 13 :");
		System.out.print("Entrez un nombre : ");
		a=Clavier.lireFloat();
		System.out.print("Entrez un nombre : ");
		b=Clavier.lireFloat();
		System.out.print("Entrez un nombre : ");
		c=Clavier.lireFloat();
		
		grandBis=MaxTrois(a,b,c);
		
		System.out.println(grandBis);
	}

}
