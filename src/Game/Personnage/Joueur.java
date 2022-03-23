package Game.Personnage;

import Game.Item.Weapon;
import Game.Personnage.Classe.ClasseJoueur;

import java.util.Scanner;

public class Joueur {
    Scanner scan = new Scanner(System.in);

    protected String sexe, nomJoueur;
    protected int Explevel, pv, endurance;
    protected ClasseJoueur classePerso;
    protected Weapon weapon;
    public Joueur(String nomJoueur, String sexe, int level, Weapon weapon, ClasseJoueur classe, int endurance, int pv){
        this.nomJoueur = nomJoueur;
        this.sexe = sexe;
        this.Explevel = level;
        this.weapon = weapon;
        this.classePerso = classe;
        this.endurance = endurance;
        this.pv = pv;
    }
    public Joueur(){
        this.Explevel = 1;
        this.pv = 100;
        this.endurance = 100;
        weapon = new Weapon("poing", null, "mains", 5, 0, 1, false);
        classePerso = new ClasseJoueur("larbin", 0, 0, 0 ,0, 0);
        this.init();
    }
    public int getExplevel() {return Explevel;}
    public String getSexe() {return sexe;}
    public ClasseJoueur getClassePerso() {return classePerso;}
    public Weapon getWeapon() {return weapon;}
    public int getPv() {return pv;}
    public String getNomJoueur() {return nomJoueur;}
    public int getEndurance() {return endurance;}

    public void setExplevel(int explevel) {Explevel = explevel;}
    public void setSexe(String sexe) {this.sexe = sexe;}
    public void setPv(int pv) {this.pv = pv;}
    public void setWeapon(Weapon weapon) {this.weapon = weapon;}
    public void setNomJoueur(String nomJoueur) {this.nomJoueur = nomJoueur;}
    public void setEndurance(int endurance) {this.endurance = endurance;}

    public void init(){
        System.out.println("Veuillez chosir le sexe de votre personnage : ");
        sexe = scan.nextLine();
        System.out.println("Veuillez entrer votre nom : ");
        nomJoueur = scan.nextLine();
    }

    public String toString() {
        return "Joueur " + nomJoueur + " de sexe " + sexe + "\n"
                + ", de classe " + classePerso.getNameClasse() + " de niveau " + Explevel + " d'expérience \n"
                + ", possède une arme : " + weapon.getNameItem() + "\n"
                + "a une endurance de " + endurance + " et une vitalité de " + pv + " PVs";
    }

    public void perdsPV(int pv_infliges){this.pv -= pv_infliges;}
    public void gagnePV(int pv_gagnes){this.pv += pv_gagnes;}

    public void attaquer(Joueur j2){
        System.out.println( this.getNomJoueur() + " attaque " + j2.getNomJoueur() );
        j2.perdsPV(this.getWeapon().getDamage());
    }
}
