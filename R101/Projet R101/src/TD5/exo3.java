package TD5;

import java.io.*;

public class exo3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		// Exercice 3 du TD5
		// Algorithme qui permet d'afficher l'intégralité d'un fichier 
		// toto2.txt de type délimité (caractère de délimitation : /).
		// Ce caractère devra être remplacé par des espaces.
		
		// Déclaration de variables de types chaîne de caractères, caractère et entier
		String enregistrement; // Ligne du fichier
		int longueur; // Longueur de la ligne du fichier
		int i; // Utilisée dans la boucle pour
		char carac; // Caractère à la position i dans la ligne
		String phrase=" "; // Ligne du fichier une fois le caractère / changé en espace
		
		// Ouverture du fichier toto2.txt en mode lecture
		BufferedReader entree = new BufferedReader(new FileReader("toto2.txt"));
		
		// Boucle tant que qui s'arrête lorsqu'il n'y a plus de ligne dans le fichier
		while (entree.ready()) {
			// Lecture de la ligne et assignation de sa longueur à la variable pour
			enregistrement = entree.readLine();
			longueur = enregistrement.length();
			
			for(i=0;i<=(longueur-1);i++) {
				// Lecture du caractère à la position i dans la ligne
				carac = enregistrement.charAt(i);
				
				// Test pour déterminer si le caractère est celui de délimitation
				if(carac=='/') {
					// Changement du caractère de délimitation en espace
					carac = ' ';
				}
				
				// Recréation de la ligne avec le caractère changé si besoin
				phrase = phrase+carac;
			}
			
			// Affichage de la ligne une fois débarassée du caractère de délimitation
			System.out.println(phrase);
		}
		
		// Fermeture du fichier
		entree.close();
	}

}
