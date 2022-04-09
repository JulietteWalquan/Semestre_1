package exercices;

public class Evaluation {

	// Exercice 1 question 1
	public static String question1(int a, int b) {

		if (a + b == 0 || a * b == 1) { // 1
			return "Vrai"; // 1
		}

		return "Faux"; // 1

		// Complexité si la condition est vérifiée
		// 1+1=2
		// Complexité si la condition n'est pas vérifiée
		// 1+1=2
		// Donc complexité de O(1)
	}

	// Exercice 1 question 2
	public static int question2(int T[]) {

		int nb = 0; // 1
		int i, j;

		for (i = 0; i < T.length - 1; i++) { // i-T.length-1+1 = T.length
			for (j = 1; j < T.length - 2; j++) { // (j-T.length-2+1)(T.length) =
													// T.length^2
				if (question1(T[i], T[j]) == "Vrai") { // T.length^2+2
					nb++; // T.length^2+1
				}
			}
		}

		return nb; // 1

		// Complexité
		// 1+T.length+T.length^2+T.length^2+2+T.length^2+1+1=
		// 3T.length^2+T.length+5
		// Donc complexité de O(n^2)
	}

	// Exercice 2
	public static String exo2(int T[], int i, int j) {

		if (j < T.length) { // T.length+1
			if (question1(T[i], T[j]) == "Vrai") { // T.length+1+T.lentgh
				return "Vrai";
			} else if (question1(T[i], T[j]) == "Faux") { // T.length
				return exo2(T, i + 1, j + 1);
			}
		}

		return "Faux";
		
		// Complexité si la condition (question1(T[i], T[j]) == "Vrai") est toujours vraie
		// T.length+1+T.length+1+T.length+1 = 
		// Donc complexité de O()
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(question1(-3, 3));
		System.out.println(question1(4, 5));

		int[] Tab = { -3, 4, 6, 3, -4, 7, 9, -9 };
		System.out.println(question2(Tab));

		System.out.println(exo2(Tab, 0, 1));
	}

}
