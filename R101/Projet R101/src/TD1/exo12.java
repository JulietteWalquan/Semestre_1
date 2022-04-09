package TD1;

public class exo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 12 du TD1
		// Ecrire un algorithme permettant de calculer le volume d'une sphère
		
		// Déclaration des variables de types réel et réel double
		float rayon; //le rayon de la sphère
		double volume; // le volume de la sphère
		
		// Demande à l'utilisateur pour qu'il entre le rayon de la sphère 
		// Affectation de la valeur entrée à la variable pour
		System.out.print("Entrez le rayon de la sphère : ");
		rayon=Clavier.lireFloat();
		
		// Calcul puis affichage du volume
		volume=(4*Math.PI*Math.pow(rayon, 3))/3;
		System.out.println("Voici le volume de la sphère "+volume);
	}

}
