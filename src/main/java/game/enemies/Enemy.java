package game.enemies;

import game.behaviour.IHealth;

public class Enemy implements IHealth {

    private int health;

    public Enemy() {
        this.health = 50;
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
