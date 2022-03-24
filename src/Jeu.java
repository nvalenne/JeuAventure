import Game.Enchantment.Enchantment;
import Game.Item.Weapon;
import Game.Personnage.Player.Classe.ClasseJoueur;
import Game.Personnage.Player.Joueur;
import java.util.Scanner;
import java.sql.*;
// import javafx.*;

public class Jeu {
    public final static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ClasseJoueur assassin = new ClasseJoueur("assassin", 2, 7, 2, 7, 6);
        ClasseJoueur guerrier = new ClasseJoueur("guerrier", 6, 3, 7, 2, 5);

        Enchantment poison = new Enchantment(10, "perte de PV", 0);

        Weapon baton = new Weapon("baton de bois", null, "corps à corps", 1, 1, 1, false);
        Weapon anticapitalisme = new Weapon("anticapitalisme", null, "distance", 50, 1,1, false);

        // Joueur j1 = new Joueur(); // affiche classe larbin et des poings en tant qu'arme par défaut
        Joueur j3 = new Joueur("Balkany", "masculin", 1, baton, assassin, 150, 200, 10);
        Joueur j4 = new Joueur("Poutou", "masculin", 3, anticapitalisme, assassin, 300, 400, 10);

        System.out.println("Bienvenue sur ce jeu !");
        System.out.println("1   [JOUER]\n" +
                           "2  [QUITTER]");
        int resultInt = scan.nextInt();
        switch (resultInt){
            case 1:
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.exit(0);
                break;
        }


    }
}
