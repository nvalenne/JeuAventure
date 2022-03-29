package game.personnage.pnj;

import game.Item.Weapon;
import game.personnage.player.Joueur;

public class Goblin extends PNJ{
    private final Weapon weapon;
    public Goblin(){
        super("goblin", 20);
        this.weapon = new Weapon("baton en bois", null, "corps à corps", 2, 1, 1, false);
    }
    public Goblin(String n){
        super(n, 20);
        this.weapon = new Weapon("baton en bois", null, "corps à corps", 2, 1, 1, false);
    }
    public Goblin(Weapon weapon){
        super("Goblin", 20);
        this.weapon = weapon;
    }
    public Goblin(String n, int pv, Weapon weapon){
        super(n, pv);
        this.weapon = weapon;
    }

    @Override
    public String getNom() {return super.nom;}
    public int getPv() {return pv;}
    public Weapon getWeapon() {return weapon;}

    public void attaquer(Joueur j){
        System.out.println( this.getNom() + " vous attaque !" );
        int degats = this.getWeapon().getDamage();
        j.perdsPV(degats);
        System.out.println("Vous avez perdu " + degats + " PVs ! " +
                "\nVos PVs : "+ j.getPv());
    }
}
