package Game.Item;

import Game.Effect.Effect;

import java.util.List;

public class Weapon {
    protected String nameWeapon, typeWeapon;
    protected int damage, weight, levelWeapon;
    protected boolean isZone;
    public Effect effect;

    public Weapon(String name, String typeWeapon, int damage, int weight, int level, boolean isZone, Effect effect){
        this.nameWeapon = name;
        this.typeWeapon = typeWeapon;
        this.damage = damage;
        this.weight = weight;
        this.levelWeapon = level;
        this.isZone = isZone;
        this.effect = effect;
    }

    public int getDamage() {return damage;}
    public int getLevelWeapon() {return levelWeapon;}
    public int getWeight() {return weight;}
    public Effect getEffect() {return effect;}
    public String getNameWeapon() {return nameWeapon;}

    public void setDamage(int damage) {this.damage = damage;}
    public void setLevelWeapon(int levelWeapon) {this.levelWeapon = levelWeapon;}
    public void setEffect(Effect effect) {this.effect = effect;}
    public void setWeight(int weight) {this.weight = weight;}
    public void setNameWeapon(String nameWeapon) {this.nameWeapon = nameWeapon;}


    public String toString() {
        return "Caractéristiques de l'arme : \n" +
                " - Nom de l'arme : " + nameWeapon + "\n" +
                " - Type de l'arme : " + typeWeapon + "\n" +
                " - Dégats : " + damage + "\n" +
                " - poids de l'arme : " + weight + "\n" +
                " - Niveau de l'arme : " + levelWeapon + "\n" +
                " - Attaque zonée : " + isZone + "\n" +
                " - Effet : " + effect;
    }
}
