package game.enemies;

import game.behaviour.IAttack;
import game.behaviour.IHealth;

public class Enemy implements IHealth, IAttack {

    private int health;
    private int attackValue;

    public Enemy() {
        this.health = 50;
        this.attackValue = 10;
    }

    @Override
    public void attack(IHealth target) {
        target.reduceHealth(attackValue);
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
