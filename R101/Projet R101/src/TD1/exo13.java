package TD1;

public class exo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 13 du TD1
		// Consigne sur la feuille de TD
		
		// Déclaration des variables de type int 
		// minuscule pour les manipulations
		int a;
		int b;
		int c;
		int d;
		int e;
		int z;
		// majuscule pour l'affichage final
		int A;
		int B;
		int C;
		int D;
		int E;
		
		// Demande à l'utilisateur pour qu'il entre les valeurs de toutes les variables
		// Affectation de la valeur entrée à la variable pour
		System.out.print("Entrez la valeur a : ");
		a=Clavier.lireInt();
		A=a;
		System.out.print("Entrez la valeur b : ");
		b=Clavier.lireInt();
		B=b;
		System.out.print("Entrez la valeur c : ");
		c=Clavier.lireInt();
		C=c;
		System.out.print("Entrez la valeur d : ");
		d=Clavier.lireInt();
		D=d;
		System.out.print("Entrez la valeur e : ");
		e=Clavier.lireInt();
		E=e;
		
		// Permutation des variables a et b puis affichage
		z=a;
		a=b;
		b=z;
		System.out.println(a+", "+b);
		
		// Permutation des variables b et c puis affichage
		z=b;
		b=c;
		c=z;
		System.out.println(b+", "+c);
		
		// Addition des variables a et b, affectation dans c puis affichage 
		c=a+b;
		System.out.println(c);
		
		// Permutation des variables c et e puis affichage
		z=c;
		c=e;
		e=z;
		System.out.println(c+", "+e);
		
		// Affichage des valeurs initiales des variables 
		System.out.println(A+", "+B+", "+C+", "+D+", "+E);
	}

}
