package TD5;

import java.io.*;

public class exo4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		// Exercice 4 du TD5
		// Algorithme qui permet � l'utilisateur de saisir au clavier un 
		// nouvel individu qui sera ajout� � un carnet d'aresses en champs 
		// de largeur fixes
		
		// D�claraion de variables de types cha�ne de caract�re, caract�re et entier
		String nom; // Nom du nouvel individu
		String prenom; // Pr�nom du nouvel individu
		String tel; // Num�ro de t�l�phone du nouvel individu
		String mail; // Adresse mail du nouvel individu
		int n; // Diff�rence entre la d�limitation de caract�res et la cha�ne rentr�e
		int i; // Utilis�e dans les boucles pour
		
		// Ouverture du fichier en mode Ajout
		PrintWriter sortie = new PrintWriter (new FileWriter("carnetAdresse.txt", true));
		
		// Demande � l'utilisateur des diff�rentes informations sur le nouvel individu
		// Affectation des valeurs entr�es � la variable pour
		System.out.println("Entrez le nom :");
		nom = Clavier.lireLigne();
		System.out.println("Entrez le pr�nom :");
		prenom = Clavier.lireLigne();
		System.out.println("Entrez le num�ro de t�l�phone :");
		tel = Clavier.lireLigne();
		System.out.println("Entrez l'adresse mail :");
		mail = Clavier.lireLigne();
		
		// Test pour d�terminer le nombre de caract�res du champ entr� 
		if(nom.length()>20) {
			System.out.println("Erreur, le nom ne doit pas d�passer 20 caract�res");
		}
		else if(nom.length()==20) {
			// Le nom est �crit tel quel dans le carnet
			sortie.print(nom);
		}
		else {
			// Le nom est �crit dans le carnet puis ajout du nombre suffisant d'espace
			sortie.print(nom);
			n = 20 - nom.length();
			for(i=0;i<n;i++) {
				sortie.print(' ');
			}
		}
		
		// M�mes explications que pour le nom
		if(prenom.length()>15) {
			System.out.println("Erreur, le pr�nom ne doit pas d�passer 15 caract�res");
		}
		else if(prenom.length()==15) {
			sortie.print(prenom);
		}
		else {
			sortie.print(prenom);
			n = 15-prenom.length();
			for(i=0;i<n;i++) {
				sortie.print(' ');
			}
		}
		
		if(tel.length()==10) {
			sortie.print(tel);
		}
		else{
			System.out.println("Erreur, le num�ro de t�l�phone doit contenir 10 caract�res");
		}
		
		if(mail.length()>30) {
			System.out.println("Erreur, l'adresse mail ne doit pas d�passer 20 caract�res");
		}
		else if(mail.length()==30) {
			sortie.print(mail);
		}
		else {
			sortie.println(mail);
			n = 30 - mail.length();
			for(i=0;i<n;i++) {
				sortie.print(' ');
			}
		}
		
		// Fermeture du fichier
		sortie.close();
	}

}
