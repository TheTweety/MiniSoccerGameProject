package model.players;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCollectionTest {

    @Test
    void sort() {
        PlayerCollection pc = new PlayerCollection();
        pc.add(new Goalkeeper("goalkeeper", Color.YELLOW));
        pc.add(new Striker("striker", Color.BLUE));
        pc.get("striker").setPlayerStatistics(2);
        pc.sort();
        assertEquals(0, pc.get("goalkeeper").getPlayerStatistics().intValue());
        assertEquals(2,pc.get("striker").getPlayerStatistics().intValue());
    }

    @Test
    void get() {
        PlayerCollection pc = new PlayerCollection();
        pc.add(new Goalkeeper("goalkeeper", Color.YELLOW));
        pc.add(new Striker("striker", Color.BLUE));
        pc.get("striker").setPlayerStatistics(2);
        assertEquals(0, pc.get("goalkeeper").getPlayerStatistics().intValue());
        assertEquals(2, pc.get("striker").getPlayerStatistics().intValue());

    }

    @Test
    void iterator() {
        PlayerCollection pc = new PlayerCollection();
        pc.add(new Goalkeeper("goalkeeper", Color.YELLOW));
        pc.add(new Striker("striker", Color.BLUE));
        Iterator<GamePlayer> i =pc.iterator();
        assertNotEquals(null, i);
    }
}