package model.players;
import java.util.*;

/**
 *
 */
public class PlayerCollection implements Iterable<GamePlayer> {
    static ArrayList<GamePlayer> players = new ArrayList<>();

    /**
     *
     * @param player
     */
    public void add(GamePlayer player) {
        players.add(player);
    }

    /**
     *
     */
    public void sort() {
        Collections.sort(players);
    }

    /**
     *
     * @param playername
     * @return
     *
     */
    public GamePlayer get(String playername){
        for(GamePlayer p: players){
            if( p.playerName.toLowerCase().equals(playername.toLowerCase())){
                return p;
            }
        }
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public Iterator<GamePlayer> iterator() {
        return players.iterator();
    }
}
