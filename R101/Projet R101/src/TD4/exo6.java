package TD4;

public class exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phrase;
		int mots=0,longueur,i;
		
		System.out.print("Entrez une phrase : ");
		phrase=Clavier.lireLigne();
		longueur=phrase.length();
		
		for(i=0;i<longueur;i++){
			if(phrase.charAt(i)==' '){
				mots++;
			}
		}
		
		if(phrase.charAt(longueur-1)!=' ') {
			mots++;
		}
		
		System.out.println("Il y a "+mots+" mots dans cette phrase.");
	}

}
