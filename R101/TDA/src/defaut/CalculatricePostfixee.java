package defaut;

import pile.*;

public class CalculatricePostfixee {

	public static void main(String[] args) {

		Pile cal = new PileParTableau();
		boolean fin = false;
		int n;
		String rep;
		String op;
		int resultat;
		int e1;
		int e2;

		try{
			System.out.println("Entrez le premier �l�ment de votre expression en notation postfix�e :");
			n = Clavier.lireInt();
			cal.empiler(n);

			System.out.println("Avez-vous fini ?");
			rep = Clavier.lireLigne();
			if (rep.equals("oui")) {
				fin = true;
			}

			while (fin == false) {
				System.out.println("Voulez-vous entrez un entier ou un op�rateur ?");
				rep = Clavier.lireLigne();

				if (rep.equals("entier")) {
					System.out.println("Entrez l'�l�ment suivant de votre expression en notation postfix�e :");
					n = Clavier.lireInt();
					cal.empiler(n);
				}
				else if (rep.equals("op�rateur")) {
					System.out.println("Entrez l'op�rateur de votre expression en notation postfix�e :");
					op = Clavier.lireLigne();
					if (op.equals("+")) {
						e1 = (int) cal.depiler();
						e2 = (int) cal.depiler();
						resultat = e2 + e1;
						cal.empiler(resultat);
						System.out.println(resultat);
					}
					else if (op.equals("-")) {
						e1 = (int) cal.depiler();
						e2 = (int) cal.depiler();
						resultat = e2 - e1;
						cal.empiler(resultat);
						System.out.println(resultat);
					}
					else if (op.equals("*")) {
						e1 = (int) cal.depiler();
						e2 = (int) cal.depiler();
						resultat = e2 * e1;
						cal.empiler(resultat);
						System.out.println(resultat);
					}
					else if (op.equals("/")) {
						e1 = (int) cal.depiler();
						e2 = (int) cal.depiler();
						resultat = e2 / e1;
						cal.empiler(resultat);
						System.out.println(resultat);
					}
				}

				System.out.println("Avez-vous fini ?");
				rep = Clavier.lireLigne();
				if (rep.equals("oui")) {
					fin = true;
				}
				else if (rep.equals("non")) {
					fin = false;
				}
			}

			System.out.print("Le r�sultat est : ");
			System.out.print(cal.depiler());
		}
		catch (PileVideException e){
			// g�rer l'exception : redemander d'entrer une expression
		}
		catch (PilePleineException e){
			// g�rer l'exception
		}
		
	}
}
