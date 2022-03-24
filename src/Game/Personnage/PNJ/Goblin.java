package Game.Personnage.PNJ;

import Game.Item.Weapon;
import Game.Personnage.Player.Joueur;

public class Goblin extends PNJ{
    private int pv;
    private Weapon weapon;
    public Goblin(){
        super("goblin");
        this.pv = 20;
        this.weapon = new Weapon("baton en bois", null, "corps à corps", 2, 1, 1, false);
    }
    public Goblin(String n){
        super(n);
        this.pv = 20;
        this.weapon = new Weapon("baton en bois", null, "corps à corps", 2, 1, 1, false);
    }
    public Goblin(Weapon weapon){
        super("Goblin");
        this.pv = 20;
        this.weapon = weapon;
    }
    public Goblin(String n, int pv, Weapon weapon){
        super(n);
        this.pv = pv;
        this.weapon = weapon;
    }

    @Override
    public String getNom() {return super.nom;}
    public int getPv() {return pv;}
    public Weapon getWeapon() {return weapon;}

    public void attaquer(Joueur j2){
        System.out.println( this.getNom() + " attaque " + j2.getNomJoueur() );
        int degats = this.getWeapon().getDamage();
        j2.perdsPV(degats);
        System.out.println("Le joueur " + j2.getNomJoueur() + " a perdu " + degats + " PV !" + "\n" +
                "PVs du joueur adverse : " + j2.getPv());
    }
}
