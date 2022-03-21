package Game.Item;

import Game.Effect.Effect;

import java.util.List;

public class Consumable {
    protected Effect effects;
    protected boolean isThrowable;
    public Consumable(Effect effects, boolean isThrowable){
        this.effects = effects;
        this.isThrowable = isThrowable;
    }
    public Consumable(){
        this.effects = null;
        this.isThrowable = false;
    }

    public Effect getEffects() {return effects;}
    public boolean getIsThrowable() {return isThrowable;}

    public void setEffects(Effect effects) {this.effects = effects;}
    public void setThrowable(boolean throwable) {isThrowable = throwable;}
}
