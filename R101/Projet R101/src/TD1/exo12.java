package TD1;

public class exo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 12 du TD1
		// Ecrire un algorithme permettant de calculer le volume d'une sph�re
		
		// D�claration des variables de types r�el et r�el double
		float rayon; //le rayon de la sph�re
		double volume; // le volume de la sph�re
		
		// Demande � l'utilisateur pour qu'il entre le rayon de la sph�re 
		// Affectation de la valeur entr�e � la variable pour
		System.out.print("Entrez le rayon de la sph�re : ");
		rayon=Clavier.lireFloat();
		
		// Calcul puis affichage du volume
		volume=(4*Math.PI*Math.pow(rayon, 3))/3;
		System.out.println("Voici le volume de la sph�re "+volume);
	}

}
