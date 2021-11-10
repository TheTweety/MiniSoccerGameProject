package model;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.PlayerCollection;
import model.players.Striker;

import java.awt.*;

public class PlayerFactory {
    private final PlayerCollection players = new PlayerCollection();

    /**
     *
     * @param playername
     * @return GamePlayer
     */
    public GamePlayer getPlayer(String playername) {
         GamePlayer aplayer = players.get(playername);
         if (aplayer == null){
            if(playername.equalsIgnoreCase("striker")) {
                aplayer = new Striker("striker", Color.BLUE);
            }
            else {
                aplayer = new Goalkeeper("goalkeeper", Color.YELLOW);
            }
            players.add(aplayer);
         }
         return aplayer;
    }
}
