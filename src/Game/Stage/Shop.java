package Game.Stage;

import Game.Jeu;
import java.util.Scanner;

public class Shop {
    public final static Scanner scan = new Scanner(System.in);
    public static void lancer(){
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
