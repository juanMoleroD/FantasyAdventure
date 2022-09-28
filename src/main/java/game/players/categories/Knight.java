package game.players.categories;

import game.behaviour.IAttack;
import game.behaviour.IHealth;
import game.players.Player;
import game.players.weapons.Weapon;

public class Knight extends Player implements IAttack {

    private Weapon weapon;

    public Knight() {
        this.weapon = new Weapon("Sword", 10);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(IHealth target) {
        target.reduceHealth(this.weapon.getAttackValue());
    }


}
