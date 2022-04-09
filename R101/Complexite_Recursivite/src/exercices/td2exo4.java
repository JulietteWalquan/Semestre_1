package exercices;

public class td2exo4 {

	public static int[] inverser(int Tab[], int i){
		
		int echange; // 1
		if (i>=Tab.length/2){ // 3
			return Tab;
		}
		else {
			echange = Tab[i]; // 2
			Tab[i] = Tab[Tab.length-i-1]; // 5
			Tab[Tab.length-i-1] = echange; // 4
			return inverser(Tab, i+1); // log(n)
		}
		
		// Complexité
		// 
		// O(log(n))
	}
}
