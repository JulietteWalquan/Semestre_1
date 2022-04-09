package TD2;

public class exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 4 du TD2
		// Ecrivez un algorithme qui calcule et affiche le montant à payer 
		// de la facture d'eau d'un abonné, sachant que le montant est 
		// comptabilisé comme suit : paiement de sa consommation selon le 
		// volume d'eau consommé en fonction du tarif à tranche ci-dessous 
		// + 10€ montant de l'abonnement :
		// - consommation <= 50m^3 -> prix unitaire = 2€ le m^3
		// - 50m^3 < consommation <= 100m^3 -> prix unitaire = 3€ le m^3
		// - 100m^3 < consommation <= 200m^3 -> prix unitaire = 5€ le m^3
		// - 200m^3 < consommation <= 500m^3 -> prix unitaire = 6€ le m^3
		// - consommation > 500m^3 -> prix unitaire = 10€ le m^3
		
		// Déclaration des variables de type à réel
		float conso; // Consommation d'eau de l'abonné
		float prix; // Prix à payer par l'abonné
		
		// Demande à l'abonné pour qu'il entre le montant de sa consomlmation d'eau
		// Affectation de la valeur entrée à la variable pour
		System.out.print("Quel est le montant de votre consommation d'eau ? ");
		conso=Clavier.lireFloat();
		
		// Série de test pour déterminer le montant de sa facture d'eau
		if(conso<=50) {
			// Calcul du montant puis affichage du prix à payer
			prix=conso*2+10;
			System.out.println("Le montant de votre facture d'eau est de "+prix+"€.");
		}
		if(conso>50 && conso<=100) {
			// Calcul du montant puis affichage du prix à payer
			prix=conso*3+10;
			System.out.println("Le montant de votre facture d'eau est de "+prix+"€.");
		}
		if(conso>100 && conso<=200) {
			// Calcul du montant puis affichage du prix à payer
			prix=conso*5+10;
			System.out.println("Le montant de votre facture d'eau est de "+prix+"€.");
		}
		if(conso>200 && conso<=500) {
			// Calcul du montant puis affichage du prix à payer
			prix=conso*6+10;
			System.out.println("Le montant de votre facture d'eau est de "+prix+"€.");
		}
		if(conso>500) {
			// Calcul du montant puis affichage du prix à payer
			prix=conso*10+10;
			System.out.println("Le montant de votre facture d'eau est de "+prix+"€.");
		}
	}

}
