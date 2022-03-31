package game.personnage.player;

import game.item.Item;
import game.item.Weapon;
import game.personnage.player.classe.ClasseJoueur;
import game.personnage.pnj.PNJ;

import java.util.Scanner;

public class Joueur {
    public static final Scanner scan = new Scanner(System.in);

    private final static Inventory inventory = new Inventory();
    public static Joueur joueur;

    protected String sexe;
    protected String nomJoueur;
    protected int Explevel;
    protected int pv;
    protected int endurance;
    protected int portefeuille;
    protected ClasseJoueur classePerso;
    protected Weapon weapon;
    protected Weapon poings = new Weapon("poing", 0, "corps à corps", 5, 0, 1, false);

    public Joueur(String nomJoueur, String sexe, int level, Weapon weapon, ClasseJoueur classe, int endurance, int pv, int portefeuille){
        this.nomJoueur = nomJoueur;
        this.sexe = sexe;
        this.Explevel = level;
        this.weapon = weapon;
        this.classePerso = classe;
        this.endurance = endurance;
        this.pv = pv;
        this.portefeuille = portefeuille;
    }
    public Joueur(String nomJoueur, String sexe, int level, ClasseJoueur classe, int endurance, int pv){
        this.nomJoueur = nomJoueur;
        this.sexe = sexe;
        this.Explevel = level;
        this.weapon = poings;
        this.classePerso = classe;
        this.endurance = endurance;
        this.pv = pv;
        this.portefeuille = 0;
    }
    public Joueur(){
        this.Explevel = 1;
        this.pv = 100;
        this.endurance = 100;
        weapon = poings;
        classePerso = new ClasseJoueur("larbin", 0, 0, 0 ,0, 0);
        this.portefeuille = 0;
        this.init();
    }

    public int getExplevel() {return Explevel;}
    public String getSexe() {return sexe;}
    public ClasseJoueur getClassePerso() {return classePerso;}
    public Weapon getWeapon() {return weapon;}
    public int getPv() {return pv;}
    public String getNomJoueur() {return nomJoueur;}
    public int getEndurance() {return endurance;}
    public int getPortefeuille() {return portefeuille;}
    public Inventory getInventory() {return inventory;}

    public void setExplevel(int explevel) {this.Explevel = explevel;}
    public void setSexe(String sexe) {this.sexe = sexe;}
    public void setPv(int pv) {this.pv = pv;}
    public void setWeapon(Weapon weapon) {this.weapon = weapon;}
    public void setNomJoueur(String nomJoueur) {this.nomJoueur = nomJoueur;}
    public void setEndurance(int endurance) {this.endurance = endurance;}

    public void gagneOr(int montant){portefeuille += montant;}
    public void perdsOr(int montant){portefeuille -= montant;}

    public void addItemInInventory(Item item){
        inventory.getInventory().add(item);
    }
    public void removeItemFromInventory(Item item){
        if (inventory.getInventory().contains(item)){
            inventory.getInventory().remove(item);
        }
    }
    public boolean InventoryisEmpty(){
        return inventory.getInventory().isEmpty();
    }


    public void init(){
        System.out.println("Veuillez choisir le sexe de votre personnage   (1) [MASCULIN]   (2) [FEMININ]");
        if (!scan.hasNextInt())
            System.exit(0);
        int tempScan = scan.nextInt();
        if (tempScan == 1)
            sexe = "masculin";
        else if (tempScan == 2)
            sexe = "féminin";
        scan.nextLine();
        System.out.println("Veuillez entrez votre nom : ");
        nomJoueur = scan.nextLine();
    }

    public String toString() {
        return "Joueur " + nomJoueur + " de sexe " + sexe + "\n"
                + ", de classe " + classePerso.getNameClasse() + " de niveau " + Explevel + " d'expérience \n"
                + ", possède une arme : " + weapon.getNameItem() + "\n"
                + "a une endurance de " + endurance + " et une vitalité de " + pv + " PVs\n" +
                "Il possede " + portefeuille + " pièces d'or";
    }

    public void perdsPV(int pvLost){this.pv -= pvLost;}
    public void gagnePV(int pvGained){this.pv += pvGained;}
    public void spendMoney(int amount){this.portefeuille -= amount;}
    public void gainMoney(int amount){this.portefeuille += amount;}

    public boolean estMort(){return this.pv <= 0;}

    public void attaquer(PNJ pnj){
        float ccritic = (float) 0.2;

        System.out.println( this.getNomJoueur() + " attaque " + pnj.getNom() );
        int degats = this.getWeapon().getDamage();

        if (Math.random() <= ccritic){
            degats *= 2;
            System.out.println("Coup critique ! ");
        }
        pnj.perdsPV(degats);
        System.out.println("Le PNJ " + pnj.getNom() + " a perdu " + degats + " PV !" + "\n" +
                "PVs du PNJ : " + pnj.getPv());
    }

    public void acheter(Item item) {
        if (portefeuille >= item.getPrice()){
            addItemInInventory(item);
            portefeuille -= item.getPrice();
            System.out.println();
            System.out.println("test");
        } else {
            System.out.println("Vous n'avez pas assez de pièces d'or pour vous procurer cet objet !");
        }
    }

}
