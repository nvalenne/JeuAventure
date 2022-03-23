import Game.Enchantment.Enchantment;
import Game.Item.Weapon;
import Game.Personnage.Player.Classe.ClasseJoueur;
import Game.Personnage.Player.Joueur;
import Game.Stage.Stage1;

import java.sql.*;
import javafx.*;

public class Jeu {
    public static void main(String[] args) {
        ClasseJoueur assassin = new ClasseJoueur("assassin", 2, 7, 2, 7, 6);
        ClasseJoueur guerrier = new ClasseJoueur("guerrier", 6, 3, 7, 2, 5);

        Enchantment poison = new Enchantment(10, "perte de PV", 0);

        Weapon baton = new Weapon("baton de bois", null, "corps à corps", 1, 1, 1, false);

        Joueur j1 = new Joueur(); // affiche classe larbin et des poings en tant qu'arme par défaut
        Joueur j2 = new Joueur("Chloe", "feminin", 1, baton, guerrier, 150, 200);
        Joueur j3 = new Joueur("Balkany", "masculin", 1, baton, assassin, 150, 200);
        Stage1.lancer();
    }
}
