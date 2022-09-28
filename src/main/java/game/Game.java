package game;

import game.behaviour.ILootable;
import game.enemies.Enemy;
import game.players.Player;
import game.players.categories.Knight;
import game.players.categories.Wizard;
import game.players.weapons.Weapon;
import game.rooms.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {

    Player player1;
    Player player2;

    List<Player> players;

    List<Enemy> enemiesOnRoom1;
    List<Enemy> enemiesOnRoom2;

    List<ILootable> lootRoom1;
    List<ILootable> lootRoom2;

    Room room1;
    Room room2;

    public String start() {

        player1 = new Knight();
        player2 = new Wizard();

        players = new ArrayList<>(Arrays.asList(player1, player2));

        enemiesOnRoom1 = new ArrayList<>(
                Arrays.asList(new Enemy(), new Enemy()));
        enemiesOnRoom2 = new ArrayList<>(
                Arrays.asList(new Enemy(), new Enemy(), new Enemy()));

        lootRoom1 = new ArrayList<>(Arrays.asList(
                new Weapon("Club", 15), new Weapon("Sharp Sword", 30)));
        lootRoom2 = new ArrayList<>(Arrays.asList(
                new Weapon("Sharpest Sword", 50)));

        room1 = new Room("Room1", players, enemiesOnRoom1, lootRoom1);
        room2 = new Room("Room2", players, enemiesOnRoom2, lootRoom2);

        return "Starting Game";
    }


}
