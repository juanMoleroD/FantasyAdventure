package game.players.categories;

import game.players.Player;

public class Cleric extends Player {
    private String tool;

    public Cleric() {
        this.tool = "Caduceus";
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }
}
