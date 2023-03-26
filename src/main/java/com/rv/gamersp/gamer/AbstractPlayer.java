package com.rv.gamersp.gamer;



public abstract class AbstractPlayer {
    private int points;
    private int motion;

    public AbstractPlayer() {
    }

    public int getPoints() {
        return points;
    }

    public int getMotion() {
        return motion;
    }

    public int setMotion(int motion) {
        this.motion = motion;
        return motion;
    }

    public void winRound(){
       points++;
   };

    public void cleanPoints(){
        points=0;
    };


}
