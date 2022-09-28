package game.players.categories;

import game.enemies.Enemy;
import game.players.Player;
import game.players.weapons.Weapon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {

    Knight player;
    Player player2;
    Enemy enemy;

    @BeforeEach
    void setUp() {
        player = new Knight();
        player2 = new Cleric();
        enemy = new Enemy();

    }

    @Test
    void hasWeapon() {
        assertEquals("Sword", player.getTool());
    }

    @Test
    void canChangeWeapon() {
        Weapon club = new Weapon("Club", 5);
        player.changeWeapon(club);
        assertEquals(club, player.getWeapon());
    }

    @Test
    void canAttack_iHealth() {
        player.attack(player2);
        assertEquals(90, player2.getHealth());
        player.attack(enemy);
        assertEquals(40, enemy.getHealth());
    }

    @Test
    void damageDependsOnWeapon() {
        Weapon betterSword = new Weapon("Better Sword", 20);
        player.changeWeapon(betterSword);
        player.attack(enemy);
        assertEquals(30, enemy.getHealth());
    }
}