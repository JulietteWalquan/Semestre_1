package TD2;

public class exo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 14 du TD2
		// Ecrivez un algorithme qui lit n nombres entiers au clavier et 
		// qui affiche leur somme, leur produit et leur moyenne
		
		// D�claration des variables de types cha�ne de caract�res, entier et bool�en
		String rep; // r�ponse pour savoir si l'utilisateur a fini d'entr� de nouveau nombres
		int n; // 1er nombre entr� par l'utilisateur
		int somme; // la somme de tous les nombres entr�s
		int produit; // le produit de tous les nombres entr�s
		int moyenne; // la moyenne de tous les nombres entr�s
		boolean fini=false; // bol�en qui permet de savoir si l'utilsateur a fini et donc de sortir de la boucle r�p�ter jusqu'�
		
		// Demande pour que l'utilisateur entre le premier nombre
		// Affectation de la valeur entr�e � la variable pour
		System.out.print("Entrez un nombre : ");
		n=Clavier.lireInt();
		
		// Initialisation des somme, produit et moyenne � la valeur n
		somme=n;
		produit=n;
		moyenne=n;
		
		do {
			// Demande � l'utilisateur d'entrer un nouveau nombre
			// Affectation de la valeur entr�e � la variable pour
			System.out.print("Entrez un nouveau nombre : ");
			n=Clavier.lireInt();
			
			// Calculs des somme, produit et moyenne
			somme+=n;
			produit*=n;
			moyenne=(moyenne+n)/2;
			
			// Demande � l'utilisateur s'il a fini ou non
			System.out.println("Avez-vous fini ?");
			rep=Clavier.lireLigne();
			// D�termine le statut du bool�en fini en fonction de la r�ponse
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
