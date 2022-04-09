package TD4;

public class exo8 {

	public static int NombreVoyelles(String phrase) {
		// TODO Auto-generated method stub

		char Voyelles[]=new char[6];
		int i, j, caracteres, nombre=0;
		
		Voyelles[0]='a';
		Voyelles[1]='e';
		Voyelles[2]='i';
		Voyelles[3]='o';
		Voyelles[4]='u';
		Voyelles[5]='y';
		
		caracteres=phrase.length();
		
		for(i=0;i<caracteres;i++) {
			for(j=0;j<6;j++) {
				if(phrase.charAt(i)==Voyelles[j]) {
					nombre++;
				}
			}
		}
		
		return(nombre);
	}
	
	public static void main(String[] args) {
		
		String phrase;
		int n;
		
		System.out.print("Entrez une phrase : ");
		phrase=Clavier.lireLigne();
		
		n=NombreVoyelles(phrase);
		System.out.println("Il y a "+n+" voyelles dans votre phrase.");
	}

}
