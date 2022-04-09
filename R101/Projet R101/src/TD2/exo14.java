package TD2;

public class exo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 14 du TD2
		// Ecrivez un algorithme qui lit n nombres entiers au clavier et 
		// qui affiche leur somme, leur produit et leur moyenne
		
		// Déclaration des variables de types chaîne de caractères, entier et booléen
		String rep; // réponse pour savoir si l'utilisateur a fini d'entré de nouveau nombres
		int n; // 1er nombre entré par l'utilisateur
		int somme; // la somme de tous les nombres entrés
		int produit; // le produit de tous les nombres entrés
		int moyenne; // la moyenne de tous les nombres entrés
		boolean fini=false; // boléen qui permet de savoir si l'utilsateur a fini et donc de sortir de la boucle répéter jusqu'à
		
		// Demande pour que l'utilisateur entre le premier nombre
		// Affectation de la valeur entrée à la variable pour
		System.out.print("Entrez un nombre : ");
		n=Clavier.lireInt();
		
		// Initialisation des somme, produit et moyenne à la valeur n
		somme=n;
		produit=n;
		moyenne=n;
		
		do {
			// Demande à l'utilisateur d'entrer un nouveau nombre
			// Affectation de la valeur entrée à la variable pour
			System.out.print("Entrez un nouveau nombre : ");
			n=Clavier.lireInt();
			
			// Calculs des somme, produit et moyenne
			somme+=n;
			produit*=n;
			moyenne=(moyenne+n)/2;
			
			// Demande à l'utilisateur s'il a fini ou non
			System.out.println("Avez-vous fini ?");
			rep=Clavier.lireLigne();
			// Détermine le statut du booléen fini en fonction de la réponse
			if(rep.equals("oui")) {
				fini=true;
			}
			else {
				fini=false;
			}
		}while (fini==false);
		
		// Affichage des somme, produit et moyenne
		System.out.println("La somme est "+somme);
		System.out.println("Le produit est "+produit);
		System.out.println("La moyenne est "+moyenne);
	}

}
