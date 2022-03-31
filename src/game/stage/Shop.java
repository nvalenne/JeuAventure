package game.stage;

import game.item.Consumable;
import game.item.Item;
import game.Jeu;
import game.item.Weapon;
import game.item.equipment.*;

import java.util.Scanner;

public class Shop {
    public static Item[] articlesVente = new Item[]{
            new Consumable("pomme", 2),
            new Weapon("Epée en bois", 10, "arme blanche", 10, 3, 1, false)

    };
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
        } else {
            for (int i = 0; i < articlesVente.length ; i++){
                System.out.println("(" + (i+1) + ") " + articlesVente[i].getNameItem() + " : " + articlesVente[i].getPrice() + " pièce d'or");
            }
            System.out.println("(0)   [QUIT]");
        }

    }
}
