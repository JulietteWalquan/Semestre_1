package pile;

public interface Pile {

	// Sélecteurs
	
	// Savoir si une pile est vide
	public boolean pileVide(); 

	// Savoir si une pile est pleine
	public boolean pilePleine(); 

	// Obtenir la longueur d'une pile
	public int longueur(); 

	// Déterminer la valeur du sommet d'une pile
	public Object sommet() throws PileVideException; 

	
	
	// Modificateurs

	// Empiler une valeur au sommet d'une pile
	public void empiler(Object element) throws PilePleineException; 

	// Dépiler la valeur au sommet d'une pile
	public Object depiler() throws PileVideException; 
}
