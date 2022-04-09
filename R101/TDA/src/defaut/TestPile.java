package defaut;

import pile.*;

public class TestPile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Pile p = new PileParTableau(10);
			int n;
			
			for (int i=0; i<=11;i++){
				System.out.println("Entrer un nombre :");
				n = Clavier.lireInt();
				p.empiler(n);
			}
			
		}
		catch (PilePleineException e){
			System.out.println(e.message);
		}
	}

}
