package Game.Item;

import Game.Enchantment.Enchantment;

public class Consumable extends Item {
    protected boolean isThrowable;
    public Consumable(String name, Enchantment enchantment, boolean isThrowable){
        super(name, enchantment);
        this.isThrowable = isThrowable;
    }
    public Consumable(String name){
        super(name, null);
        this.isThrowable = false;
    }

    public Enchantment getEnchantment() {return enchantment;}
    public boolean getIsThrowable() {return isThrowable;}

    public void setEnchantment(Enchantment enchantment) {this.enchantment = enchantment;}
    public void setThrowable(boolean throwable) {isThrowable = throwable;}
}
