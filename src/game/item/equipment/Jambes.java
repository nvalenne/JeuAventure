package game.item.equipment;

import game.enchantment.Enchantment;

public class Jambes extends Equipment{
    public Jambes(String name, int price){
        super(name, price);
    }
    public Jambes(String name, Enchantment enchantment, int price){
        super(name, enchantment, price);
    }
}