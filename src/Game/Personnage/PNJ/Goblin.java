package Game.Personnage.PNJ;

import Game.Item.Weapon;

public class Goblin extends PNJ{
    private int pv;
    private Weapon weapon;
    public Goblin(){
        super("goblin");
        this.pv = 20;
        this.weapon = new Weapon("baton en bois", null, "corps à corps", 2, 1, 1, false);
    }
    public Goblin(Weapon weapon){
        super("goblin");
        this.pv = 20;
        this.weapon = weapon;
    }
}
