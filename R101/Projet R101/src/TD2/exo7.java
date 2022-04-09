package TD2;

public class exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 7 du TD2
		// Ecrivez un algorithme qui demande 2 nombres � l'utilisateur et 
		// l'informe ensuite si le produit est nh�gatif, nul ou positif. 
		// Attention toutefois, on ne doit pas calculer le produit !
		
		// D�claration des variables de type r�el
		float n1; // premier nombre entr� par l'utilisateur
		float n2; // deuxi�me nombre entr� par l'utilisateur
		
		// Demande � l'utilisateur pour qu'il entre les nombres qu'il souhaite
		// Affectation de la valeur entr�e � la variable pour
		System.out.print("Entrez un nombre : ");
		n1=Clavier.lireFloat();
		System.out.print("Entrez un deuxi�me nombre : ");;
		n2=Clavier.lireFloat();
		
		// Tests pour d�terminer l'�tat du produit puis affichage 
		if(n1==0 || n2==0) { // "||" = "ou"
			System.out.println("Le produit est nul.");
		}
		if((n1>0 && n2>0) || (n1<0 && n2<0)) {
			System.out.println("Le produit est positif.");
		}
		else if((n1>0 && n2<0) || (n1<0 && n2>0)){
			System.out.println("Le produit est n�gatif.");
		}
	}

}
