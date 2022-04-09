package SAEmoi;

import java.io.File;
import java.io.FileNotFoundException;

public class Main_SAE {

    public static void main(String[] args) throws FileNotFoundException {
        int a=0, b=0;
        File rep1;
        int rep2;
        Menu film = new Menu();

        System.out.println("Quel fichier de données voulez-vous charger?");
        System.out.println("1- Fichier avec 80 944 films");
        System.out.println("2- Fichier avec 40 000 films");
        System.out.println("3- Fichier avec 10 000 films");
        System.out.println("4- Fichier avec 1 000 films");
        System.out.println("5- Fichier avec 100 films");
        System.out.println("Entrer le numéro correspondant à votre choix");
        a= SAEmoi.scanner.lireInt();
        rep1= film.menu_Fichiers(a);


        while(b!=6){
            System.out.println("Que souhaitez vous faire?");
            System.out.println("1- Afficher les données");
            System.out.println("2- Trier les données");
            System.out.println("3- Filtrer les données");
            System.out.println("4- Rechercher un film");
            System.out.println("5- Supprimer les données");
            System.out.println("6- Sauvegarder une requête dans un fichier");
            System.out.println("7- Quitter l'application");
            System.out.println("Entrer le numéro correspondant à votre choix");
            b= SAEmoi.scanner.lireInt();
            rep2=film.menu_Action(b,rep1);
        }


    }
}
