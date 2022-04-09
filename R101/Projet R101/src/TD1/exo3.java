package TD1;

public class exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exercice 3 du TD1
		// Quel est le contenu des variables en fin d'algorithme ?

		// Déclaration de 4 variables de type entier
		int a;
		int b;
		int c;
		int x;
		
		// Différentes manipulation des variables
		a=5;
		b=6;
		c=3;
		x=a+b*c;
		a=x+b;
		b=x-c;
		c=a+b;
		
		// Affichage du contenu des variables après les manipulations
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("x = "+x);
	}

}
