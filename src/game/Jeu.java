package game;

import game.personnage.player.classe.ClasseJoueur;
import game.personnage.player.Joueur;
import game.stage.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Jeu {
    public final static Scanner scan = new Scanner(System.in);
    public static Joueur player;

    public static void jeuPerdant() throws InterruptedException {
        System.out.println("\nVous êtes mort !");
        TimeUnit.SECONDS.sleep(3);
        Hub.lancer(player);
    }

    public static void main(String[] args) throws InterruptedException{
        player = new Joueur();
        StringBuilder welcomeStr = new StringBuilder("Bienvenue sur ce jeu ");
        if (player.getSexe() == "masculin")
            welcomeStr.append("Guerrier ");
        else
            welcomeStr.append("Guerrière ");
        System.out.println(welcomeStr + player.getNomJoueur() + " !");
        System.out.println(" (1)   [PLAY]\n (2)   [SHOP]\n (3)   [INVENTORY]\n (4)   [QUIT]");
        if(!scan.hasNextInt()){
            System.exit(0);
        }
        int resultInt = scan.nextInt();

        switch (resultInt){
            case 1:
                StageMenu.lancer(player);
                break;
            case 2:
                Shop.lancer(player);
                break;
            case 3:
                player.getInventory().displayInventory();
            default:
                System.exit(0);
        }

        ClasseJoueur assassin = new ClasseJoueur("assassin", 2, 7, 2, 7, 6);
        ClasseJoueur guerrier = new ClasseJoueur("guerrier", 6, 3, 7, 2, 5);

    }
}
