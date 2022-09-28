package game.rooms;

import game.behaviour.ILootable;
import game.enemies.Enemy;
import game.players.Player;

import java.util.List;

public class Room {

    private String name;
    private List<Player> players;
    private List<Enemy> enemies;
    private List<ILootable> loots;

    public Room(String name, List<Player> players, List<Enemy> enemies, List<ILootable> loots) {
        this.name = name;
        this.players = players;
        this.enemies = enemies;
        this.loots = loots;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public List<ILootable> getLoots() {
        return loots;
    }
}
