package exercices;

public class Tp2_exo2 {

	public static int sommeIntPos(int n1, int n2) {
		
		if (n2 > 0) { // n2
			n1++; // n2
			n2--; // n2
		}

		if (n2 != 0) { // n2
			return sommeIntPos(n1, n2); // log(n2-1)
		}

		else {
			return n1; // 1
		}
		
		// Complexité 
		// n2+n2+n2+n2+log(n2-1)+1 = 4n2+1+log(n2-1)
		// O(log(n))
	}

	public static int sommeInt(int n1, int n2) {

		if (n2 > 0) { // n2 || n2 || 1
			n1++; // n2 || 0 || 0
			n2--; // n2 || 0 || 0
		} else if (n2 < 0) { // 0 || n2 || 1
			n1--; // 0 || n2 || 0
			n2++; // 0 || n2 || 0
		}

		if (n2 != 0) { // n2 || n2 || 1
			return sommeInt(n1, n2); // log(n2-1) || log(n2-1) || 0
		}

		else {
			return n1; // 1 || 1 || 1
		}
		
		// Complexité avec n1 < n2
		// n2+n2+n2+n2+log(n2-1)+1 = 4n2+1+log(n2-1)
		// 4*8+1+log(8-1) = 33+log(7)
		// O(log(n))
		
		// Complexité avec n1 > n2
		// n2+n2+n2+n2+n2+log(n2-1)+1 = 5n2+1+log(n2-1)
		// 5*(-8)+1+log(-8-1) = -39+log(-9)
		// O(log(n))
		
		// Complexité avec n2 = 0
		// 1+1+1+1 = 4
		// O(1)
	}

	public static void main(String[] args) {

		System.out.println(sommeIntPos(3, 8));
		System.out.println(sommeInt(-3, 8));
		System.out.println(sommeInt(3,-8));
	}
}
