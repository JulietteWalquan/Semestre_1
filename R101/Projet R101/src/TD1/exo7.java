package TD1;

public class exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 7 du TD1
		// Ecrire un algorithme qui permet de saisir 3 entiers puis d'afficher leur somme et leur produit
		
		// Déclaration de 3 variables de type entier
		int a;
		int b;
		int c;
		
		// Demande à l'utilisateur pour qu'il entre les 3 valeurs
		// Affectation de la valeur entrée à la variable pour
		System.out.print("Entrez la valeur de a : ");
		a=Clavier.lireInt();
		System.out.print("Entrez la valeur de b : ");
		b=Clavier.lireInt();
		System.out.print("Entrez la valeur de c : ");
		c=Clavier.lireInt();
		
		// Affichage de la somme et du produit
		System.out.println("La somme de a,b et c est "+(a+b+c));
		System.out.println("Le produit de a,b et c est "+(a*b*c));
	}

}
