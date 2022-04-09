package TD2;

public class exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 7 du TD2
		// Ecrivez un algorithme qui demande 2 nombres à l'utilisateur et 
		// l'informe ensuite si le produit est nhégatif, nul ou positif. 
		// Attention toutefois, on ne doit pas calculer le produit !
		
		// Déclaration des variables de type réel
		float n1; // premier nombre entré par l'utilisateur
		float n2; // deuxième nombre entré par l'utilisateur
		
		// Demande à l'utilisateur pour qu'il entre les nombres qu'il souhaite
		// Affectation de la valeur entrée à la variable pour
		System.out.print("Entrez un nombre : ");
		n1=Clavier.lireFloat();
		System.out.print("Entrez un deuxième nombre : ");;
		n2=Clavier.lireFloat();
		
		// Tests pour déterminer l'état du produit puis affichage 
		if(n1==0 || n2==0) { // "||" = "ou"
			System.out.println("Le produit est nul.");
		}
		if((n1>0 && n2>0) || (n1<0 && n2<0)) {
			System.out.println("Le produit est positif.");
		}
		else if((n1>0 && n2<0) || (n1<0 && n2>0)){
			System.out.println("Le produit est négatif.");
		}
	}

}
