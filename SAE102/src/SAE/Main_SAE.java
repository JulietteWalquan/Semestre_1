package SAE;

import java.io.FileNotFoundException;

public class Main_SAE {

    public static void main(String[] args) throws FileNotFoundException {
        Menu film = new Menu();
        film.menu_Action(film.menu_Fichiers());
    }
}
