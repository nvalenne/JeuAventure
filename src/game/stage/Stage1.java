package game.stage;

import game.Jeu;
import game.personnage.player.Joueur;
import game.personnage.pnj.Goblin;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Stage1 {
    private Stage1(){}
    public final static Scanner scan = new Scanner(System.in);
    public static void lancer(Joueur j) throws InterruptedException {
        int montant = 0;

        System.out.println("Une horde de gobelins ");
        for(int monstres = 1; monstres <= 1; monstres++){
            if(j.estMort()){
                Jeu.jeuPerdant();
            }
            String goblinName = "goblin" + monstres;
            Goblin goblin = new Goblin(goblinName);
            System.out.println("Un gobelin vous attaque !");
            while ( !(goblin.estMort()) ){
                System.out.println("\n Que souhaitez vous faire ? \n (1) [ATTAQUER]\n (2) [NE RIEN FAIRE]");
                if(!scan.hasNextInt()){
                    System.exit(0);
                }
                int resultInt = scan.nextInt();

                switch (resultInt){
                    case 1:
                        j.attaquer(goblin);
                        TimeUnit.SECONDS.sleep(1);
                        goblin.attaquer(j);
                        TimeUnit.SECONDS.sleep(1);
                        break;
                    default:
                        goblin.attaquer(j);
                        TimeUnit.SECONDS.sleep(1);
                }
            }
            System.out.println("Le gobelin "+ goblin.getNom() +" est mort !");
            j.gagneOr(5);
            montant+=5;

        }
        System.out.println(" Vous avez tué la horde de gobelins !");
        System.out.println(" Vous avez récolté : " + montant + " pièces d'or");
        TimeUnit.SECONDS.sleep(3);
        Hub.lancer();
    }
}