package game.item.equipment;

import game.enchantment.Enchantment;

public class Pieds extends Equipment{
    public Pieds(String name, int price){
        super(name, price);
    }
    public Pieds(String name, Enchantment enchantment, int price){
        super(name, enchantment, price);
    }
}