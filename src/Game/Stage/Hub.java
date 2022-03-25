package Game.Stage;

import java.util.Scanner;


public class Hub {
    public final static Scanner scan = new Scanner(System.in);
    public static void lancer(){
        System.out.println("==============HUB==============\n" +
                            "Bienvenue dans le hub !");
        System.out.println("(1)   [BUY]\n" +
                           "(2)   [QUIT]");
        if(!scan.hasNextInt()){
            System.exit(0);
        }
        int resultInt = scan.nextInt();
        if (resultInt != 1) {
            Hub.lancer();

        }
    }
}
