package game;

import game.personnage.player.classe.ClasseJoueur;
import game.personnage.player.Joueur;
import game.stage.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.sql.*;

public class Jeu {
    public final static Scanner scan = new Scanner(System.in);

    public static void jeuPerdant() throws InterruptedException {
        System.out.println("\nVous êtes mort !");
        TimeUnit.SECONDS.sleep(3);
        Jeu.main(new String[0]);
    }

    public static void main(String[] args) throws InterruptedException{
        System.out.println("Bienvenue sur ce jeu !");
        System.out.println(" (1)   [PLAY]\n (2)   [SHOP]\n (3)   [QUIT]");
        if(!scan.hasNextInt()){
            System.exit(0);
        }
        int resultInt = scan.nextInt();

        switch (resultInt){
            case 1:
                Joueur joueur = new Joueur();
                Stage1.lancer(joueur);
                break;
            case 2:
                Shop.lancer();
                break;
            default:
                System.exit(0);
        }

        ClasseJoueur assassin = new ClasseJoueur("assassin", 2, 7, 2, 7, 6);
        ClasseJoueur guerrier = new ClasseJoueur("guerrier", 6, 3, 7, 2, 5);

    }
}
