package Game.Stage;

import Game.Personnage.PNJ.Goblin;

public class Stage1 {
    public static void lancer(){
        for(int monstres = 1; monstres <= 5; monstres++){
            String goblinName = "goblin" + monstres;
            Goblin goblin = new Goblin(goblinName);

            System.out.println(goblin.getNom());

        }
    }
}
