package SAE;

import java.util.Scanner;

public class Clavier {
    public Scanner scanner = new Scanner(System.in);

    public String lireString() {
        return scanner.nextLine();
    }

    public int lireInt() {
        return scanner.nextInt();
    }
}