package TP_bonus;

public class exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int i;
		int j;
		int TabCarre[];
		int impair;
		
		System.out.print("Combien de valeurs : ");
		n = Clavier.lireInt();
		
		if(n%2==0) {
			impair = n/2;
		}
		else {
			impair = ((n-1)/2)+1;
		}
		
		TabCarre = new int[impair];
		j=0;
		for(i=1;i<=impair+2;i+=2) {
			TabCarre[j] = i*i;
			System.out.println(i+" a pour carré "+TabCarre[j]);
			j++;
		}
	}

}
