package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {


    @Test
    void hasStartMethod() {
        Game game = new Game();
        assertEquals("Starting Game", game.start());
    }
}