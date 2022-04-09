package TD2;

public class exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 6 du TD2
		// Ecrivez un algorithme qui demande à l'utilisateur le nombre 
		// de photocopies effectuées et qui affiche la facture correspondante
		// Les tarifs sont :
		// - 0,10€ les 10 premières photocopies
		// - 0,09€ les 20 suivantes
		// - 0,08€ au delà
		
		// Déclaration des variables de types entier et réel double
		int nbPhoto; // nombre de photocopies effectuées
		double facture; // facture à payer
		
		// Demande à l'utilisateur pour qu'il entre le nombre de photocopies effectuées
		// Affectation de la valeur entrée à la variable pour
		System.out.print("Combien de photocopies effectuez-vous ? ");
		nbPhoto=Clavier.lireInt();
		
		// Test pour déterminer le prix des photocopies
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
		System.out.println("Votre facture est de "+facture+"€.");
	}

}
