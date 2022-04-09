package TD5;

import java.io.*;

public class exo2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		// Exercice 2 du TD5
		// Algorithme qui affiche l'intégralité d'un fichier toto.txt
		
		// Ouverture du fichier toto.txt en mode lecture
		BufferedReader entree = new BufferedReader(new FileReader("toto.txt"));
		
		// Boucle tant que qui s'arrête lorsqu'il n'y a plus de ligne dans le fichier
		while (entree.ready()) {
			// Affiche une ligne du fichier toto.txt
			System.out.println(entree.readLine());
		}
		
		// Ferme le fichier toto.txt
		entree.close();
	}

}
