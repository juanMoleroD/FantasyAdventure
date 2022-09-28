package game.players.categories;

import game.behaviour.IAttack;
import game.behaviour.IHealth;
import game.creatures.CompanionCreature;
import game.creatures.categories.Elemental;
import game.players.Player;
import game.players.spells.Spell;

public class Wizard extends Player implements IAttack {
    private Spell spell;
    private CompanionCreature companionCreature;

    public Wizard() {
        this.spell = new Spell("Fireball","Fire", 10);
        this.companionCreature = new Elemental();
    }

    public Spell getSpell() {
        return spell;
    }

    public CompanionCreature getCompanionCreature() {
        return companionCreature;
    }

    @Override
    public void attack(IHealth target) {
        target.reduceHealth(10);
    }

    public void changeSpell(Spell spell) {
        this.spell = spell;
    }
}
