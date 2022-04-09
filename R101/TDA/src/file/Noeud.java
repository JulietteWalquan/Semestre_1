package file;

public class Noeud {

	protected Object valeur;
	protected Noeud suivant;
	
	public Noeud(){
		valeur = null;
		suivant = null;
	}
	
	public Noeud(Object o, Noeud n){
		valeur=o;
		suivant=n;
	}	
}
