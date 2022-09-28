package game.players;

import game.players.categories.Cleric;
import game.players.categories.Knight;
import game.players.categories.Wizard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Knight player;

    @BeforeEach
    void setUp() {
        player = new Knight();
    }

    @Test
    void startsWithHealthAt100() {
        assertEquals(100, player.getHealth());
    }

    @Test
    void hasWeaponOrSpell() {
    }
}