package TD1;

public class exo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice 10 du TD1
		// Ecrire un algorithme qui lit :
		// - le prix hors taxe d'un article
		// - le nombre d'articles
		// - le taux de la TVA
		// et qui affiche le prix toutes taxes correspondant
		
		// Déclaration des variables de type réel
		float prixTTC; // le prix toutes taxes comprises
		float prixHT; // le prix hors taxes
		float nbArticles; // le nombre d'articles
		float tauxTVA; // le taux de la Taxe sur la Valeur Ajoutée
		
		// Demande à l'utilisateur pour qu'il entre le prix hors taxes, le nombre d'articles et le taux de la TVA
		// Affectation de la valeur entrée à la variable pour
		System.out.print("Entrez le prix hors taxe : ");
		prixHT=Clavier.lireFloat();
		System.out.print("Entrez le nombre d'articles : ");
		nbArticles=Clavier.lireFloat();
		System.out.print("Entrez le taux de la TVA : ");
		tauxTVA=Clavier.lireFloat();
		
		// Calcul du prix TTC
		prixTTC=prixHT*nbArticles*tauxTVA;
		
		// Affichage du prix TTC
		System.out.println("Le prix TTC est : "+prixTTC);
	}

}
