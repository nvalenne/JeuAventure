package game.Item;

import game.enchantment.*;

public class Item {
    protected Enchantment enchantment;
    protected String nameItem;
    public Item(String name, Enchantment enchantment){
        this.nameItem = name;
        this.enchantment = enchantment;
    }
    public Enchantment getEnchantment() {return enchantment;}
    public String getNameItem() {return nameItem;}

    public void setEnchantment(Enchantment enchantment) {this.enchantment = enchantment;}
    public void setNameItem(String nameItem) {this.nameItem = nameItem;}
}
