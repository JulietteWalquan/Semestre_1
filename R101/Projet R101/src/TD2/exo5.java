package TD2;

public class exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 5 du TD2
		// Ecrivez un algorithme qui demande un nombre de départ 
		// et qui ensuite écrit la table de multiplication de ce nombre
		
		// Déclaration des variables de type entier
		int nombre; // nombre choisi par l'utilisateur
		int i; // variable servant dans la boucle pour
		
		// Demande pour que l'utilisateur entre le nombre
		// Affectation de la valeur entrée à la variable pour
		System.out.print("Entrez un nombre : ");
		nombre=Clavier.lireInt();
		
		// Affichage de la table grâce à une boucle pour
		System.out.println("Table de "+nombre+" :");
		for(i=0;i<=10;i++) {
			System.out.println(nombre+"*"+i+"="+(nombre*i));
		}
	}

}
