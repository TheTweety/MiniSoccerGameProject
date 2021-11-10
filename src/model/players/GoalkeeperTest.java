package model.players;
import model.SoccerBall;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GoalkeeperTest {

    @Test
    void moveLeft() {
        GamePlayer g = new Goalkeeper("goalkeeper", Color.YELLOW);
        Point initial= g.getPlayerPosition();
        g.moveLeft();
        assertNotEquals(g.getPlayerPosition(),initial);
    }

    @Test
    void moveRight() {
        GamePlayer g = new Goalkeeper("goalkeeper", Color.YELLOW);
        Point initial= g.getPlayerPosition();
        g.moveRight();
        assertNotEquals(g.getPlayerPosition(),initial);
    }

    @Test
    void moveUp() {
        GamePlayer g = new Goalkeeper("goalkeeper", Color.YELLOW);
        Point initial= g.getPlayerPosition();
        g.moveUp();
        assertNotEquals(g.getPlayerPosition(),initial);
    }

    @Test
    void moveDown() {
        GamePlayer g = new Goalkeeper("goalkeeper", Color.YELLOW);
        Point initial= g.getPlayerPosition();
        g.moveDown();
        assertNotEquals(g.getPlayerPosition(),initial);
    }

    @Test
    void shootBall() {
        SoccerBall s = SoccerBall.getSoccerBall();
        Point position = s.getPosition();
        Goalkeeper g = new Goalkeeper("goalkeeper", Color.YELLOW);
        g.shootBall();
        assertNotEquals(position, s.getPosition());
    }

    @Test
    void moveRandomly() {
        Goalkeeper g = new Goalkeeper("goalkeeper", Color.YELLOW);
        Point p = g.getPlayerPosition();
        g.moveRandomly();
        assertNotEquals(p, g.getPlayerPosition());
    }

    @Test
    void setInitialPosition() {
        Goalkeeper g = new Goalkeeper("goalkeeper", Color.YELLOW);
        Point p = g.getPlayerPosition();
        g.setInitialPosition();
        assertEquals(p, g.getPlayerPosition());
    }

    @Test
    void testToString() {
        Goalkeeper g = new Goalkeeper("goalkeeper", Color.YELLOW);
        String s = g.toString();
        assertEquals(s,  "goalkeeper caught 0 balls");
    }
}