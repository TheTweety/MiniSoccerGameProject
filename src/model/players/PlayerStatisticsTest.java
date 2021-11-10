package model.players;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayerStatisticsTest {

    @Test
    void getStatistics() {
        PlayerStatistics ps = new PlayerStatistics();
        int score = ps.getStatistics();
        Assertions.assertEquals(score, 0);
    }

    @Test
    void setStatistics() {
        PlayerStatistics ps = new PlayerStatistics();
        ps.setStatistics(1);
        Assertions.assertEquals(ps.getStatistics(), 1);
    }
}