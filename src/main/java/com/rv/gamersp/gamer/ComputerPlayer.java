package com.rv.gamersp.gamer;


import java.util.Objects;


public class ComputerPlayer extends AbstractPlayer {

    private String computerName;


//    Player computerPlayer = new Player("Artificial Player");

    public ComputerPlayer(String computerName) {
        this.computerName = computerName;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public int doMotion() {
        int motion = (int) ((Math.random() * 3) + 1);
        return motion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerPlayer that = (ComputerPlayer) o;
        return computerName.equals(that.computerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computerName);
    }

}
