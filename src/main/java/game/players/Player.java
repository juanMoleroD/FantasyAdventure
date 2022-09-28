package game.players;

import game.behaviour.IHealth;

import javax.tools.Tool;

public abstract class Player implements IHealth {
    protected int health;
    private String tool;

    public Player(){
        this.health = 100;
        this.tool = "Sword";
    }

    public int getHealth() {
        return health;
    }

    public String getTool() {
        return tool;
    }

    @Override
    public void reduceHealth(int damageAmount) {
        this.health -= damageAmount;
    }

    @Override
    public void heal(int healAmount) {
        this.health += healAmount;
    }
}
