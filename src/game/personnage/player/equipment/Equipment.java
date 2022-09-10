package game.personnage.player.equipment;

import game.item.Item;

public class Equipment {
    private final Item[] equipmentTab;

    public Equipment() {
        this.equipmentTab = new Item[]{
                new Haut(), new Plastron(), new Jambes(), new Pieds()
        };
    }

    public Equipment(Equipment equip) {
        this.equipmentTab = new Item[4];
        for (int i = 0; i < equip.getEquipment().length; i++) {
            equipmentTab[i] = equip.getEquipment()[i];
        }
    }

    public Item[] getEquipment() {
        return equipmentTab;
    }
    public Haut getHaut(){return (Haut) equipmentTab[0];}
    public Plastron getPlastron(){return (Plastron) equipmentTab[1];}
    public Jambes getJambes(){return (Jambes) equipmentTab[2];}
    public Pieds getPieds(){return (Pieds) equipmentTab[3];}

    public void setHaut(Haut haut){equipmentTab[0] = haut;}
    public void setPlastron(Plastron plastron){equipmentTab[1] = plastron;}
    public void setJambes(Jambes jambes){equipmentTab[2] = jambes;}
    public void setPieds(Pieds pieds){equipmentTab[3] = pieds;}

}
