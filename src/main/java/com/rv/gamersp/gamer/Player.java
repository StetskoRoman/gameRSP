package com.rv.gamersp.gamer;



import java.util.Objects;


public class Player extends AbstractPlayer {

    private String name;

    private int totalWins;

    private int totalLoses;

     public void assignWin() {
        totalWins++;
    }

    public void assignLose() {
         totalLoses++;
    }



    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTotalWins() {
        return totalWins;
    }

    public int getTotalLoses() {
        return totalLoses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return totalWins == player.totalWins && totalLoses == player.totalLoses && name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalWins, totalLoses);
    }

}
