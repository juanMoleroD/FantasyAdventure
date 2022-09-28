package game.behaviour;

import game.players.Player;

public interface ILootable {

    boolean pickUp();

    boolean tradeUp(Player player);
}
