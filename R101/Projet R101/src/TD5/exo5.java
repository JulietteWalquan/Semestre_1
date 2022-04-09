package TD5;

import java.io.*;

public class exo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Exercice 5 du TD5
		// Algorithme qui permet de recopier les fichiers, ayant la même 
		// structure, toto.txt et tata.txt dans un fichier tutu.txt
		
		// Déclaration d'une variable de type chaîne de caractère
		String enreg; // Enregistrement d'une ligne d'un fichier
		
		// Ouverture en mode lecture des fichiers toto.txt et tata.txt
		// Ouverture en mode ajout du fichier tutu.txt
		BufferedReader entree = new BufferedReader(new FileReader("toto.txt"));
		BufferedReader entree2 = new BufferedReader(new FileReader("tata.txt"));
		PrintWriter sortie = new PrintWriter (new FileWriter("tutu.txt", true));
		
		// Boucle tant que qui parcourt le fichier jusqu'à sa fin
		while(entree.ready()) {
			enreg = entree.readLine();
			// Ecriture de l'enregistrement dans le fichier tutu.txt
			sortie.println(enreg);
		}
		
		// Boucle tant que qui parcourt le fichier jusqu'à sa fin
		while(entree2.ready()) {
			enreg = entree2.readLine();
			// Ecriture de l'enregistrement dans le fichier tutu.txt
			sortie.println(enreg);
		}
		
		// Fermeture des 3 fichiers
		entree.close();
		entree2.close();
		sortie.close();
	}

}
