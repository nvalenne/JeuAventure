package game.personnage.player.equipment;

import game.enchantment.Enchantment;
import game.item.Item;

public class Haut extends Item {
    private int armure;
    public Haut(String name, int price, int armure){
        super(name, price);
        this.armure = armure;

    }
    public Haut(){
        super(null, null,0);
        this.armure = 0;
    }
    public Haut(String name, Enchantment enchantment, int price, int armure){
        super(name, enchantment, price);
        this.armure = armure;
    }
}
