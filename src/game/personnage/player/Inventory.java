package game.personnage.player;

import game.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> inventory;
    public Inventory(){
        this.inventory = new ArrayList<>();
    }
    public Inventory(List<Item> inventory){
        this.inventory = inventory;
    }
    public List<Item> getInventory() {return inventory;}


}
