package exercices;

public class td2exo3 {

	public static boolean pair(int n) {
		// TODO Auto-generated method stub

		if (n>=0) { // 2
			if (n==0){ // 2
				return true;
			}
			else if (n==1){ // 2
				return false;
			}
			else{
				return pair(n-2); // n
			}
		}
		
		// Complexité
		// (2+2+2)n = 6n
		// O(n)
		
		else {
			if (n==0){
				return true;
			}
			else if (n==1){
				return false;
			}
			else{
				return pair(n+2);
			}
		}
	}
	
	public static void main(String[] args){
		System.out.println(pair(-36));
	}

}
