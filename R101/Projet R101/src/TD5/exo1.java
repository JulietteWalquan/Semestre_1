package TD5;

import java.io.*;

public class exo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Exercice 1 du TD5
		// Algorithme qui permet de lire des entiers au clavier et qui, pour 
		// chacun d'entre eux, écrit une ligne dans un fichier "toto.txt" 
		// contenant le nombre fourni accompagné de son carré, sous la forme 
		// suivante : 10 a pour carré 100.
		// L'utilisateur fournira la valeur 0 pour signaler qu'il n'a plus
		// de valeur à saisir
		
		// Déclaration d'une variable de type entier
		int nombre=1; // le nombre que l'utilisateur fournira, initialisé à 1 pour rentrer dans la boucle tant que
		
		// Ouverture du fichier toto.txt en mode écriture
		PrintWriter f = new PrintWriter (new FileWriter("toto.txt"));
		
		while(nombre != 0) {
			// Demande à l'utilisateur d'entrer un nombre
			// Affectation de la valeur entrée à la variable pour
			System.out.println("Entrez un nombre entier : ");
			nombre = Clavier.lireInt();
			
			// Ecrit dans le fichier toto.txt
			f.println(nombre+" a pour carré "+(nombre*nombre));
		}
		
		// Ferme le fichier toto.txt
		f.close();
		
	}

}
