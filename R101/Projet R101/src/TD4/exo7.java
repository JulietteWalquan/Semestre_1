package TD4;

public class exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String alphabet, phrase, crypto="";
		int i, tout, position;
		char lettre;
		
		alphabet="abcdefghijklmnopqrstuvwxyz";
		
		System.out.print("Entrez une phrase en minuscule : ");
		phrase=Clavier.lireLigne();
		
		tout=phrase.length();
		
		for(i=0;i<tout;i++) {
			lettre=phrase.charAt(i);
			position=alphabet.indexOf(lettre);
			
			if(position==25) {
				crypto+='a';
			}
			else if((0<=position) && (position<=24)) {
				crypto+=alphabet.charAt(position+1);
			}
			else {
				crypto+=' ';
			}
		}
		
		System.out.println(crypto);
	}

}
