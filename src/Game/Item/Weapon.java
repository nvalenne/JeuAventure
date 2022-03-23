package Game.Item;

import Game.Enchantment.*;

public class Weapon extends Item{
    protected String typeWeapon;
    protected int damage, weight, levelWeapon;
    protected boolean isZone;

    public Weapon(String name, Enchantment enchantment, String typeWeapon, int damage, int weight, int level, boolean isZone){
        super(name, enchantment);
        this.typeWeapon = typeWeapon;
        this.damage = damage;
        this.weight = weight;
        this.levelWeapon = level;
        this.isZone = isZone;
    }

    public int getDamage() {return damage;}
    public int getLevelWeapon() {return levelWeapon;}
    public int getWeight() {return weight;}

    public void setDamage(int damage) {this.damage = damage;}
    public void setLevelWeapon(int levelWeapon) {this.levelWeapon = levelWeapon;}
    public void setWeight(int weight) {this.weight = weight;}

    public String toString() {
        return "Caractéristiques de l'arme : \n" +
                " - Nom de l'arme : " + super.getNameItem() + "\n" +
                " - Type de l'arme : " + typeWeapon + "\n" +
                " - Dégats : " + damage + "\n" +
                " - poids de l'arme : " + weight + "\n" +
                " - Niveau de l'arme : " + levelWeapon + "\n" +
                " - Attaque zonée : " + isZone + "\n" +
                " - Effet : " + super.getEnchantment();
    }
}
