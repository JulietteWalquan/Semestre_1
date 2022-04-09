package TD5;

import java.io.*;

public class exo3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		// Exercice 3 du TD5
		// Algorithme qui permet d'afficher l'int�gralit� d'un fichier 
		// toto2.txt de type d�limit� (caract�re de d�limitation : /).
		// Ce caract�re devra �tre remplac� par des espaces.
		
		// D�claration de variables de types cha�ne de caract�res, caract�re et entier
		String enregistrement; // Ligne du fichier
		int longueur; // Longueur de la ligne du fichier
		int i; // Utilis�e dans la boucle pour
		char carac; // Caract�re � la position i dans la ligne
		String phrase=" "; // Ligne du fichier une fois le caract�re / chang� en espace
		
		// Ouverture du fichier toto2.txt en mode lecture
		BufferedReader entree = new BufferedReader(new FileReader("toto2.txt"));
		
		// Boucle tant que qui s'arr�te lorsqu'il n'y a plus de ligne dans le fichier
		while (entree.ready()) {
			// Lecture de la ligne et assignation de sa longueur � la variable pour
			enregistrement = entree.readLine();
			longueur = enregistrement.length();
			
			for(i=0;i<=(longueur-1);i++) {
				// Lecture du caract�re � la position i dans la ligne
				carac = enregistrement.charAt(i);
				
				// Test pour d�terminer si le caract�re est celui de d�limitation
				if(carac=='/') {
					// Changement du caract�re de d�limitation en espace
					carac = ' ';
				}
				
				// Recr�ation de la ligne avec le caract�re chang� si besoin
				phrase = phrase+carac;
			}
			
			// Affichage de la ligne une fois d�barass�e du caract�re de d�limitation
			System.out.println(phrase);
		}
		
		// Fermeture du fichier
		entree.close();
	}

}
