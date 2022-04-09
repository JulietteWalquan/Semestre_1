package file;

public interface File {

	// S�lecteurs
	
	// Savoir si une file est vide
	public boolean fileVide(); 

	// Obtenir la longueur d'une file
	public int longueur(); 
	
	// D�termine la valeur de la t�te d'une file
	public Object tete() throws FileVideException;
	
	// D�terminer la valeur de la queue d'une file
	public Object queue() throws FileVideException; 

		
		
	// Modificateurs

	// Enfiler une valeur � la queue d'une file
	public void enfiler(Object element); 

	// D�filer la valeur au sommet d'une file
	public Object defiler() throws FileVideException; 
}
