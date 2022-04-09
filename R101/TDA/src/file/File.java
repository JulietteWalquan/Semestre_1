package file;

public interface File {

	// Sélecteurs
	
	// Savoir si une file est vide
	public boolean fileVide(); 

	// Obtenir la longueur d'une file
	public int longueur(); 
	
	// Détermine la valeur de la tête d'une file
	public Object tete() throws FileVideException;
	
	// Déterminer la valeur de la queue d'une file
	public Object queue() throws FileVideException; 

		
		
	// Modificateurs

	// Enfiler une valeur à la queue d'une file
	public void enfiler(Object element); 

	// Défiler la valeur au sommet d'une file
	public Object defiler() throws FileVideException; 
}
