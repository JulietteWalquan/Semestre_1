package exercices;

public class Tp2_exo1 {

	public static void main(String[] args) {

		int x1, x2, min; // 1+1+1 = 3
		int i; // 1
		int pgcd = 1; // 1+1+1 = 3

		System.out.print("Entrez le premier nombre : ");
		x1 = Clavier.lireInt(); // 1
		System.out.print("Entrez le deuxième nombre : ");
		x2 = Clavier.lireInt(); // 1

		if (x1 < x2) { // 1
			min = x1; // 1
		} else { // 1
			min = x2;
		}

		for (i = 1; i <= min; i++) { // i-min+1 = 1-min+1 = min
			if (x1 % i == 0 && x2 % i == 0) { // min+1+1 = min+2
				pgcd = i; // 1
			}
		}

		System.out.println("Le pgcd de " + x1 + " et " + x2 + " est : " + pgcd);
	}
	
	// Complexité
	// 3+1+3+1+1+1+1+1+min+min+2+1 = 2min+15
	// O(n)
}
