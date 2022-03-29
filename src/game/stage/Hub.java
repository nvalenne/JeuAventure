package game.stage;

import java.util.Scanner;


public class Hub {
    private Hub(){}
    public static final Scanner scan = new Scanner(System.in);
    public static void lancer() throws InterruptedException {
        System.out.println("==============HUB==============\n" +
                            "Bienvenue dans le hub !");
        System.out.println("(1)   [BUY]\n" +
                           "(2)   [QUIT]");
        if(!scan.hasNextInt() || (scan.nextInt() != 1)){
            System.exit(0);
        }
        int resultInt = scan.nextInt();
        if (resultInt == 1) {
            Shop.lancer();
        }
    }
}
