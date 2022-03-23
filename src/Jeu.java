import Game.Enchantment.Enchantment;
import Game.Item.Weapon;
import Game.Personnage.Classe.ClasseJoueur;
import Game.Personnage.Joueur;

public class Jeu {
    public static void main(String[] args) {
        ClasseJoueur assassin = new ClasseJoueur("assassin", 2, 7, 2, 7, 6);
        ClasseJoueur guerrier = new ClasseJoueur("guerrier", 6, 3, 7, 2, 5);

        Enchantment poison = new Enchantment(10, "perte de PV", 0);

        Weapon baton = new Weapon("baton de bois", null, "arme à une main", 1, 1, 1, false);

        Joueur j1 = new Joueur();
        Joueur j2 = new Joueur("chloe", "feminin", 1, baton, guerrier, 150, 200);
        Joueur j3 = new Joueur("Balkany", "masculin", 1, baton, assassin, 150, 200);

        j1.attaquer(j2);
        /*
            System.out.println(j1); // affiche classe indeterminé et des poings en tant qu'arme par défaut
            System.out.println(j2);
            System.out.println(j3);
        */
        System.out.println(j1.getWeapon());


    }
}
