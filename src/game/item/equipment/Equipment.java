package game.item.equipment;

import game.enchantment.Enchantment;
import game.item.Item;

public class Equipment extends Item {
    public Equipment(String name, int price){
        super(name, price);
    }
    public Equipment(String name, Enchantment enchantment, int price){
        super(name, enchantment, price);
    }
}
