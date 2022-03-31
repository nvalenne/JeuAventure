package game.item.equipment;

import game.enchantment.Enchantment;

public class Haut extends Equipment{
    public Haut(String name, int price){
        super(name, price);
    }
    public Haut(String name, Enchantment enchantment, int price){
        super(name, enchantment, price);
    }
}
