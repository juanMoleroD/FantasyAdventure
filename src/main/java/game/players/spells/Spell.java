package game.players.spells;

public class Spell {
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
}
