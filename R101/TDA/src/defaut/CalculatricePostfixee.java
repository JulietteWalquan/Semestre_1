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
			System.out.println("Entrez le premier élément de votre expression en notation postfixée :");
			n = Clavier.lireInt();
			cal.empiler(n);

			System.out.println("Avez-vous fini ?");
			rep = Clavier.lireLigne();
			if (rep.equals("oui")) {
				fin = true;
			}

			while (fin == false) {
				System.out.println("Voulez-vous entrez un entier ou un opérateur ?");
				rep = Clavier.lireLigne();

				if (rep.equals("entier")) {
					System.out.println("Entrez l'élément suivant de votre expression en notation postfixée :");
					n = Clavier.lireInt();
					cal.empiler(n);
				}
				else if (rep.equals("opérateur")) {
					System.out.println("Entrez l'opérateur de votre expression en notation postfixée :");
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

			System.out.print("Le résultat est : ");
			System.out.print(cal.depiler());
		}
		catch (PileVideException e){
			// gérer l'exception : redemander d'entrer une expression
		}
		catch (PilePleineException e){
			// gérer l'exception
		}
		
	}
}
