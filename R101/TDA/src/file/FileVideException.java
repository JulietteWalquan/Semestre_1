package file;

public class FileVideException extends Exception{

	public String message;
	
	public FileVideException(){
		message = "Erreur : file vide.";
	}
	
}
