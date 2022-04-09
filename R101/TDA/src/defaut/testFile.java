package defaut;

import file.*;
import java.util.Random;

public class testFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			File f = new FileParChainage();
			
			System.out.println(f.fileVide());
			System.out.println(f.longueur());
			
			for (int i=0; i<5; i++) {
				f.enfiler(i);
			}
			
			System.out.println(f.fileVide());
			System.out.println(f.longueur());
			
			for (int i=0; i<5; i++) {
				System.out.println(f.defiler());
			}
			
			System.out.println(f.fileVide());
			System.out.println(f.longueur());
			

		}
		catch (FileVideException e){
			System.out.println(e.message);
		}
		
	}

}
