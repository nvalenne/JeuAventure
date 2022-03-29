package game.stage;

import game.Jeu;
import java.util.Scanner;

public class Shop {
    public final static Scanner scan = new Scanner(System.in);
    public static void lancer() throws InterruptedException {
        System.out.println("==============BOUTIQUE==============\n" +
                           "Bienvenue à la boutique !");
        System.out.println("(1)   [BUY]\n" +
                           "(2)   [QUIT]");
        if(!scan.hasNextInt()){
            System.exit(0);
        }
        int resultInt = scan.nextInt();
        if (resultInt != 1) {
            Jeu.main(new String[0]);
        }

    }
}
