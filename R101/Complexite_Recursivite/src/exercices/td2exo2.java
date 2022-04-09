package exercices;

public class td2exo2 {

	public static int Ackermann(int m, int n) {
		// TODO Auto-generated method stub

		if (m==0) { // 2
			return n+1;
		}
		else if (m>0 && n==0) { // 3
			return Ackermann(m-1,1);
		}
		else {
			return Ackermann(m-1,Ackermann(m,n-1)); // n^2
		}
		
		// Complexité 
		// n^2(2+3) = 5n^2
		// O(n^2)
	}
	
	public static int Syracuse(int N){
		
		if (N!=1){ //2
			if (N%2==1){ // 3
				return Syracuse((N+1)/2);
			}
			else{
				return Syracuse(3*N+1); // 2n
			}
		}
		else {
			return N;
		}
		
		// Complexité
		// 2n(2+3) = 10n
		// O(n)
	}
	
	public static void main(String[] args) {
		System.out.println(Ackermann(3,4));
		System.out.println(Syracuse(1));
	}

}
