package pile;

public class PileParTableau implements Pile {

	private int TAILLEMAX = 100; // Taille maximale de la pile
	private int sommet; // Taille effective de la pile
	private Object[] tabPile; // Tableau contenant les �l�ments de la pile

	// Constructeurs

	// Cr�er une pile vide avec taille maximale par d�faut
	public PileParTableau() {
		sommet = -1;
		tabPile = new Object[TAILLEMAX];
	}

	// Cr�er une pile vide de taille maximale donn�e
	public PileParTableau(int max) {
		TAILLEMAX = max;
		sommet = -1;
		tabPile = new Object[TAILLEMAX];
	}

	// Les 6 fonctions

	// Retourne vrai si la pile est vide
	public boolean pileVide() {
		return (sommet == -1);
	}

	// Retourne vrai si la pile est pleine
	public boolean pilePleine() {
		return (sommet == TAILLEMAX - 1);
	}

	// Retourne la longueur de la pile
	public int longueur() {
		return (sommet + 1);
	}

	// Retourne la valeur au sommet de la pile
	public Object sommet() throws PileVideException{
		if (!pileVide()) {
			return (tabPile[sommet]);
		} else {
			throw new PileVideException();
		}
	}

	// Empile un nouvel �l�ment dans la pile
	public void empiler(Object elem) throws PilePleineException{
		if (!pilePleine()) {
			sommet++;
			tabPile[sommet] = elem;
		} else {
			throw new PilePleineException();
		}
	}

	// Retourne et d�pile le dernier �l�ment de la pile
	public Object depiler() throws PileVideException{
		if (!pileVide()) {
			sommet--;
			return (tabPile[sommet + 1]);
		} else {
			throw new PileVideException();
		}
	}

}
