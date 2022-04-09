package pile;

public class PileVideException extends Exception{

	public String message;
	
	public PileVideException(){
		message = "Erreur : pile vide";
	}
}
