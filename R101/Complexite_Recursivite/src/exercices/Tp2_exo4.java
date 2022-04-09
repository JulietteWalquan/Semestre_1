package exercices;

public class Tp2_exo4 {

	public static void main(String[] args) {
		
		int total=100, poids;
		
		System.out.print("Entrez le poids de la plus grande poupée : ");
		poids = Clavier.lireInt();
		
		while (poids !=100) {
			total = total + poids/2;
		}
	}
}
