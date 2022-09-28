package game.enemies;

import game.players.Player;
import game.players.categories.Knight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    Enemy enemy = new Enemy();
    Player player = new Knight();

    @Test
    void canAttackPlayers() {
        enemy.attack(player);
        assertEquals(90, player.getHealth());

    }
}