package TD4;

public class exo10 {

	public static int Absolue(int valeur) {
		// TODO Auto-generated method stub

		int valeur_absolue;
		
		if(valeur>=0){
			valeur_absolue=valeur;
		}
		else{
			valeur_absolue=valeur*(-1);
		}
		
		return valeur_absolue;
	}

	public static void main(String[] args){
		int nombre,abs;
		
		System.out.print("Entre un nombre entier : ");
		nombre=Clavier.lireInt();
		
		abs=Absolue(nombre);
		
		System.out.println(abs);
	}
}
