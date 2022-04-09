package SAEmoi;

import java.io.*;

public class Fonctions {

    public static void main(String[] args) {
        lister("test.tsv");
    }

    public static void lister(String nomFichier) {
        // lire le contenu d'un fichier tsv
        BufferedReader tsvReader = null;

        try {
            tsvReader = new BufferedReader(new FileReader(nomFichier));
            String row = new String();
            while ((row = tsvReader.readLine()) != null) {
                String[] data = row.split("\t");
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(tsvReader != null) {
                    tsvReader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        // créer un objet Film pour chaque ligne
        // utiliser la tabulation pour définir le mot d'après

    }

    public static void affDonnees() {
        // utiliser la méthode toString()

    }

    public static void sauvegardeTSV(Film listeFilms) {
        try {
            PrintWriter writer = new PrintWriter("maListe.tsv", "UTF-8");
            writer.println("titre\tannée\tgenre\tdurée\tpays\tlangue\tréalisateur\tscénariste\tliste acteurs\tdescription\tnombre de votes note");
            writer.print(listeFilms);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void sauvegardeBinaire(Film listeFilms) {
        try {
            FileOutputStream fos = new FileOutputStream("maListe.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(listeFilms);

            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
