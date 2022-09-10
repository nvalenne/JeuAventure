package game.stage.levels;

import game.Jeu;
import game.personnage.player.Joueur;
import game.personnage.pnj.Goblin;
import game.stage.Hub;

import java.util.concurrent.TimeUnit;

import static game.Jeu.scan;
import static game.personnage.player.Joueur.nbrOfMonstersKilled;

public class Stage2 {
    private Stage2(){}
    public static void lancer(Joueur j) throws InterruptedException {

        int montant = 0;

        System.out.println("Une horde de gobelins arrive !");
        for(int monstres = 1; monstres <= 10; monstres++){
            String goblinName = "goblin" + monstres;
            Goblin goblin = new Goblin(goblinName);
            System.out.println("Un gobelin vous attaque !");
            while ( !(goblin.estMort()) ){
                System.out.println("\n Que souhaitez vous faire ? \n (1) [ATTAQUER]\n (2) [NE RIEN FAIRE]");
                if(!scan.hasNextInt()){
                    System.exit(0);
                }
                int resultInt = scan.nextInt();

                if (resultInt == 1) {
                    goblin.attaquer(j);
                    System.out.println("    ====");
                    TimeUnit.SECONDS.sleep(1);
                    j.attaquer(goblin);
                    TimeUnit.SECONDS.sleep(1);
                } else {
                    goblin.attaquer(j);
                    TimeUnit.SECONDS.sleep(1);
                }
                if (j.estMort())
                    Jeu.jeuPerdant();
            }
            nbrOfMonstersKilled +=1;
            System.out.println("Le gobelin "+ goblin.getNom() +" est mort !");
            j.gainMoney(5);
            montant+=5;
            if (nbrOfMonstersKilled % (10*j.getExplevel()) == 0)
                j.levelUp();

        }
        System.out.println(" Vous avez tué la horde de gobelins !");
        System.out.println(" Vous avez récolté : " + montant + " pièces d'or");
        TimeUnit.SECONDS.sleep(3);
        Hub.lancer(j);
    }

}
