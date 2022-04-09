package TD4;

public class exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre;
		
		System.out.print("Entrez un nombre entier : ");
		nombre=Clavier.lireInt();
		
		if(nombre%2==0){
			System.out.println("Ce nombre est pair.");
		}
		else{
			System.out.println("Ce nombre est impair.");
		}
	}

}
