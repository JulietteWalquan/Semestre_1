package TD4;

public class exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a,b,c,x;
		double delta,x1,x2;
		
		System.out.print("Entrez a : ");
		a=Clavier.lireFloat();
		System.out.print("Entrez b : ");
		b=Clavier.lireFloat();
		System.out.print("Entrez c : ");
		c=Clavier.lireFloat();
		
		delta=Math.pow(b,2)-4*a*c;
		
		if(delta>0){
			x1=(-b+Math.sqrt(delta))/(2*a);
			x2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("L'équation "+a+"x^2+"+b+"x+"+c+"=0 a pour solution "+x1+" et "+x2);
		}
		else if(delta==0){
			x=(-b)/(2*a);
			System.out.println("L'équation "+a+"x^2+"+b+"x+"+c+"=0 a pour solution "+x);
		}
		else{
			System.out.println("L'équation ("+a+")x^2+("+b+")x+("+c+")=0 n'a pas de solution ");
		}
	}

}
