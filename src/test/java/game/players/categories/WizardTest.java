package game.players.categories;

import game.creatures.CompanionCreature;
import game.creatures.categories.Dragon;
import game.enemies.Enemy;
import game.players.spells.Spell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    Wizard player;
    Enemy enemy;

    @BeforeEach
    void setUp() {
        player = new Wizard();
        enemy = new Enemy();
    }

    @Test
    void startsWithSpell_fireball() {
        assertEquals("Fire", player.getSpell().getType());
    }

    @Test
    void hasCompanion() {
        assertEquals("Elemental", player.getCompanionCreature().getType());
    }

    @Test
    void canChangeCompanion() {
        CompanionCreature dragon = new Dragon();
        player.changeCompanionCreature(dragon);
        assertEquals("Dragon", player.getCompanionCreature().getType());
    }

    @Test
    void canCastSpells() {
        player.attack(enemy);
        assertEquals(40, enemy.getHealth());
    }

    @Test
    void canChangeSpell() {
        Spell lightning = new Spell("lightning","Electric", 40);
        player.changeSpell(lightning);
        player.attack(enemy);
        assertEquals(10, enemy.getHealth());
    }

    @Test
    void companionProtectsPlayerTakingSomeOfTheDamage() {
        enemy.attack(player);
        assertEquals(95, player.getHealth());
        assertEquals(25, player.getCompanionCreature().getHealth());
    }
}