package game.players.spells;

import game.behaviour.ILootable;
import game.players.Player;

public class Spell implements ILootable {
    private String name;
    private String type;
    private int attackValue;

    public Spell(String name, String type, int attackValue) {
        this.name = name;
        this.type = type;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
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
