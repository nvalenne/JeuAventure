package game;

import game.personnage.player.classe.ClasseJoueur;
import game.personnage.player.Joueur;
import game.stage.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Jeu {
    public final static Scanner scan = new Scanner(System.in);
    public static Joueur joueur;

    public static void jeuPerdant() throws InterruptedException {
        System.out.println("\nVous êtes mort !");
        TimeUnit.SECONDS.sleep(3);
        Hub.lancer(joueur);
    }

    public boolean CompletedStage(){
        return true;
    }

    public static void main(String[] args) throws InterruptedException{
        joueur = new Joueur();
        StringBuilder welcomeStr = new StringBuilder("Bienvenue sur ce jeu ");
        if (joueur.getSexe() == "masculin")
            welcomeStr.append("Guerrier ");
        else
            welcomeStr.append("Guerrière ");
        System.out.println(welcomeStr + joueur.getNomJoueur() + " !");
        System.out.println(" (1)   [PLAY]\n (2)   [SHOP]\n (3)   [QUIT]");
        if(!scan.hasNextInt()){
            System.exit(0);
        }
        int resultInt = scan.nextInt();

        switch (resultInt){
            case 1:
                Stage1.lancer(joueur);
                break;
            case 2:
                Shop.lancer(joueur);
                break;
            default:
                System.exit(0);
        }

        ClasseJoueur assassin = new ClasseJoueur("assassin", 2, 7, 2, 7, 6);
        ClasseJoueur guerrier = new ClasseJoueur("guerrier", 6, 3, 7, 2, 5);

    }
}
