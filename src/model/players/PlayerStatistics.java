package model.players;

public class PlayerStatistics {
    Integer statistic = 0 ;
    public Integer getStatistics() {
        return statistic;
    }

    @Override
    public String toString(){ return statistic.toString(); }
    public void setStatistics(Integer newStatistics) {
        statistic = newStatistics;
    }
}
