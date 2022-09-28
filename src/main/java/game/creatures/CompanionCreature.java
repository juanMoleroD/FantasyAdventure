package game.creatures;

import game.behaviour.IHealth;

public abstract class CompanionCreature implements IHealth {

    protected int health;
    protected String type;

    public String getType() {
        return type;
    }

    @Override
    public int getHealth() {
        return this.health;
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
