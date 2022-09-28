package game.players.categories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    Cleric player;

    @BeforeEach
    void setUp() {
        player = new Cleric();
    }

    @Test
    void startTool_caduceus() {
        assertEquals("Caduceus", player.getTool());
    }
}