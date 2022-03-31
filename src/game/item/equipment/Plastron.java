package game.item.equipment;

import game.enchantment.Enchantment;

public class Plastron extends Equipment{
    public Plastron(String name, int price){
        super(name, price);
    }
    public Plastron(String name, Enchantment enchantment, int price){
        super(name, enchantment, price);
    }
}