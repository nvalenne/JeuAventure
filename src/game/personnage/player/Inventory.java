package game.personnage.player;

import game.item.Item;
import game.stage.Hub;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static game.Jeu.joueur;


public class Inventory {
    private final static Scanner scan = new Scanner(System.in);
    private List<Item> inventory;
    public static final int CAPACITY = 30;
    public Inventory(){
        this.inventory = new ArrayList<>(CAPACITY);
    }
    public Inventory(List<Item> inventory){
        this.inventory = inventory;
    }
    public List<Item> getInventory() {return inventory;}
    public void displayInventory() throws InterruptedException {
        for (Item item : inventory) {
            System.out.println(item.getNameItem() + " - Prix de revente: " + item.getPrice() + " pièces d'or" );
        }
        System.out.println("\n(0)   [QUIT]");
        if(!scan.hasNextInt() || scan.nextInt() == 0){
            Hub.lancer(joueur);
        }
    }


}
