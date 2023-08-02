package javaCalcio;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Player> playerList;
    private List<Trainer> trainerList;

    public Team(List<Player> playerList, List<Trainer> trainerList) {
        this.playerList =new ArrayList<>();
        this.trainerList = new ArrayList<>();
    }
}
