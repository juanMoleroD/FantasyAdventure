package game.players.weapons;

import game.behaviour.ILootable;
import game.players.Player;

public class Weapon implements ILootable {
    private String name;
    private int attackValue;

    public Weapon(String name, int attackValue) {
        this.name = name;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getAttackValue() {
        return attackValue;
    }

    @Override
    public boolean pickUp() {
        return true;
    }

    @Override
    public boolean tradeUp(Player player) {
        return true;
    }
}
