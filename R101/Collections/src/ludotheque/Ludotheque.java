package ludotheque;

import jeu.*;

import java.io.*;
import java.util.*;

public class Ludotheque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<JeuVideo> listeJeux = new LinkedList<JeuVideo>();

		listeJeux.add(new JeuVideo("Pacman", "Action/réflexion", "Atari Corporation", 1982, 18));
		listeJeux.add(new JeuVideo("Animal Crossing", "Détente", "Nintendo", 2000, 15));
		listeJeux.add(new JeuVideo("Mario Bros", "Aventure", "Nintendo", 1994, 20));
		listeJeux.add(new JeuVideo("Tetris", "Reflexion", "Spectrum HoloByte", 1984, 18));
		listeJeux.add(new JeuVideo("Zelda", "Aventure", "Nintendo", 2000, 17));

		System.out.print("Combien de jeux voulez-vous ajouter ? ");
		int n;
		n = Clavier.lireInt();

		String nom, genre, editeur;
		int annee, note;

		if (n > 0) {
			for (int i = 0; i < n; i++) {

				System.out.print("Entrez le nom du jeu vid�o : ");
				nom = Clavier.lireLigne();
				System.out.print("Entrez le genre du jeu vid�o : ");
				genre = Clavier.lireLigne();
				System.out.print("Entrez l'�diteur du jeu vid�o : ");
				editeur = Clavier.lireLigne();
				System.out.print("Entrez l'ann�e de sortie du jeu vid�o : ");
				annee = Clavier.lireInt();
				System.out.print("Entrez la note du jeu vid�o : ");
				note = Clavier.lireInt();

				listeJeux.add(new JeuVideo(nom, genre, editeur, annee, note));
			}
		}

		System.out.println(
				"\nComment voulez-vous triez les jeux ? \nRéponse possible : nom, genre, editeur, annee, note");
		String rep;
		rep = Clavier.lireLigne();

		if (rep.equals("nom")) {
			System.out.println("Tri des jeux par ordre alphabétique du nom : ");
			Collections.sort(listeJeux, JeuVideo.compareNom);
			for (int i = 0; i < listeJeux.size(); i++) {
				System.out.println(listeJeux.get(i).toString());
			}
		}

		else if (rep.equals("genre")) {
			System.out.println("\nTri des jeux par ordre alphabétique du genre : ");
			Collections.sort(listeJeux, JeuVideo.compareGenre);
			for (int i = 0; i < listeJeux.size(); i++) {
				System.out.println(listeJeux.get(i).toString());
			}
		}

		else if (rep.equals("editeur")) {
			System.out.println("\nTri des jeux par ordre alphabétique de l'éditeur : ");
			Collections.sort(listeJeux, JeuVideo.compareEditeur);
			for (int i = 0; i < listeJeux.size(); i++) {
				System.out.println(listeJeux.get(i).toString());
			}
		}

		else if (rep.equals("annee")) {
			System.out.println("\nTri des jeux par ordre de parution : ");
			Collections.sort(listeJeux, JeuVideo.compareAnnee);
			for (int i = 0; i < listeJeux.size(); i++) {
				System.out.println(listeJeux.get(i).toString());
			}
		}

		else if (rep.equals("note")) {
			System.out.println("\nTri des jeux par ordre de note : ");
			Collections.sort(listeJeux, JeuVideo.compareNote);
			for (int i = 0; i < listeJeux.size(); i++) {
				System.out.println(listeJeux.get(i).toString());
			}
		}

		// ajouter dans un fichier binaire
		try {
			FileOutputStream fos = new FileOutputStream("mesjeux.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(listeJeux);

			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ajouter dans un fichier tsv
		try {
			PrintWriter writer = new PrintWriter("mesjeux.tsv", "UTF-8");
			writer.println("nom	genre	editeur	annee	note");
			int i;
			for (i=0; i<listeJeux.size(); i++){
				writer.println(listeJeux.get(i));
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		System.out.println("\nAffichage");
		
		// lire un fichier binaire
		try {
			FileInputStream fis = new FileInputStream("mesjeux.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			listeJeux.clear();
			listeJeux = (LinkedList<JeuVideo>) ois.readObject();
			
			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		for (int i=0; i<listeJeux.size(); i++) {
			System.out.println(listeJeux.get(i).toString());
		}
	}

}
