package game.stage;

import game.item.Consumable;
import game.item.Item;
import game.Jeu;
import game.item.Weapon;
import game.personnage.player.Joueur;
import game.personnage.pnj.PNJ;

import java.util.Scanner;

public class Shop {
    public static Item[] articlesVente;

    private final static Scanner scan = new Scanner(System.in);
    public static void lancer(Joueur j) throws InterruptedException {
        PNJ marchand = new PNJ("Marchand Pierre");
        articlesVente = new Item[]{
                new Consumable("Pomme", 2),
                new Weapon("Epée en bois", 10, "arme blanche", 10, 3, 1, false)

        };

        marchand.parle(marchand.getNom() + ": Bienvenue guerrier/ère ! N'hésites pas à regarder notre collection !" );
        System.out.println("(0)   [BACK]");
        for (int i = 0; i < articlesVente.length ; i++){
            System.out.println("(" + (i+1) + ") " + articlesVente[i].getNameItem() + " : " + articlesVente[i].getPrice() + " pièces d'or");
        }
        System.out.println("Or : " + j.getPortefeuille());
        if(!scan.hasNextInt()){
            System.exit(0);
        }
        int resultInt = scan.nextInt();
        if (resultInt == 0)
            Hub.lancer(Jeu.player);
        else {
            for (int i = 0; i < articlesVente.length ; i++){
                if ((resultInt-1) == i){
                    if (j.getPortefeuille() >= articlesVente[i].getPrice()){
                        j.addItemInInventory(articlesVente[i]);
                        j.spendMoney(articlesVente[i].getPrice());
                    } else {
                        System.out.println(" /!\\ Vous n'avez pas assez de pièces d'or pour vous procurer cet objet ! /!\\");
                    }
                }
            }
            Shop.lancer(j);
        }
    }
}
