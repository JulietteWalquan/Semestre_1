package TD5;

import java.io.*;

public class exo4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		// Exercice 4 du TD5
		// Algorithme qui permet à l'utilisateur de saisir au clavier un 
		// nouvel individu qui sera ajouté à un carnet d'aresses en champs 
		// de largeur fixes
		
		// Déclaraion de variables de types chaîne de caractère, caractère et entier
		String nom; // Nom du nouvel individu
		String prenom; // Prénom du nouvel individu
		String tel; // Numéro de téléphone du nouvel individu
		String mail; // Adresse mail du nouvel individu
		int n; // Différence entre la délimitation de caractères et la chaîne rentrée
		int i; // Utilisée dans les boucles pour
		
		// Ouverture du fichier en mode Ajout
		PrintWriter sortie = new PrintWriter (new FileWriter("carnetAdresse.txt", true));
		
		// Demande à l'utilisateur des différentes informations sur le nouvel individu
		// Affectation des valeurs entrées à la variable pour
		System.out.println("Entrez le nom :");
		nom = Clavier.lireLigne();
		System.out.println("Entrez le prénom :");
		prenom = Clavier.lireLigne();
		System.out.println("Entrez le numéro de téléphone :");
		tel = Clavier.lireLigne();
		System.out.println("Entrez l'adresse mail :");
		mail = Clavier.lireLigne();
		
		// Test pour déterminer le nombre de caractères du champ entré 
		if(nom.length()>20) {
			System.out.println("Erreur, le nom ne doit pas dépasser 20 caractères");
		}
		else if(nom.length()==20) {
			// Le nom est écrit tel quel dans le carnet
			sortie.print(nom);
		}
		else {
			// Le nom est écrit dans le carnet puis ajout du nombre suffisant d'espace
			sortie.print(nom);
			n = 20 - nom.length();
			for(i=0;i<n;i++) {
				sortie.print(' ');
			}
		}
		
		// Mêmes explications que pour le nom
		if(prenom.length()>15) {
			System.out.println("Erreur, le prénom ne doit pas dépasser 15 caractères");
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
			System.out.println("Erreur, le numéro de téléphone doit contenir 10 caractères");
		}
		
		if(mail.length()>30) {
			System.out.println("Erreur, l'adresse mail ne doit pas dépasser 20 caractères");
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
