package javaCalcio;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Player> playerList;
    private Trainer trainer;

    public Team(List<Player> playerList, Trainer trainer) {
        this.playerList =new ArrayList<>();
        this.trainer =trainer;
    }

    @Override
    public String toString() {
        return "Trainer: " + trainer+ ' ';
    }
}
