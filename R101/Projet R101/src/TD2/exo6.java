package TD2;

public class exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 6 du TD2
		// Ecrivez un algorithme qui demande � l'utilisateur le nombre 
		// de photocopies effectu�es et qui affiche la facture correspondante
		// Les tarifs sont :
		// - 0,10� les 10 premi�res photocopies
		// - 0,09� les 20 suivantes
		// - 0,08� au del�
		
		// D�claration des variables de types entier et r�el double
		int nbPhoto; // nombre de photocopies effectu�es
		double facture; // facture � payer
		
		// Demande � l'utilisateur pour qu'il entre le nombre de photocopies effectu�es
		// Affectation de la valeur entr�e � la variable pour
		System.out.print("Combien de photocopies effectuez-vous ? ");
		nbPhoto=Clavier.lireInt();
		
		// Test pour d�terminer le prix des photocopies
		if(nbPhoto>10) {
			if(nbPhoto>=30) {
				// Calcul de la facture
				facture=10*0.10+20*0.09+(nbPhoto-30)*0.08;
			}
			else {
				// Calcul de la facture
				facture=10*0.10+(nbPhoto-10)*0.09;
			}
		}
		else {
			// Calcul de la facture
			facture=nbPhoto*0.10;
		}
		
		// Affichage de la facture
		System.out.println("Votre facture est de "+facture+"�.");
	}

}
