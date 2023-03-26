package com.rv.gamersp.game;

import com.rv.gamersp.exceptions.GameExceptions;
import com.rv.gamersp.gamer.AbstractPlayer;

public class Round implements IRound {

    //0 - equals, 1 - 1-t player won, 2 - 2-d player won, 5 - exception

    private AbstractPlayer abstractPlayer1;
    private AbstractPlayer abstractPlayer2;

    public Round(AbstractPlayer abstractPlayer1, AbstractPlayer abstractPlayer2) {
        this.abstractPlayer1 = abstractPlayer1;
        this.abstractPlayer2 = abstractPlayer2;
    }

    public int compareMotions(int motionPlayer1, int motionPlayer2) throws GameExceptions {
        if (motionPlayer1 == motionPlayer2) {
            System.out.println("nobody won");
            return 0;
        }
        if ((motionPlayer1 == 1 && motionPlayer2 == 2) || (motionPlayer1 == 2 && motionPlayer2 == 3) || (motionPlayer1==3 && motionPlayer2==1)) {
            abstractPlayer1.winRound();
            System.out.println("player 1 win   points =" + abstractPlayer1.getPoints());
            return 1;
        }
        if ((motionPlayer1 == 1 && motionPlayer2 == 3) || (motionPlayer1 == 2 && motionPlayer2 == 1) || (motionPlayer1 == 3 && motionPlayer2 == 2)) {
            abstractPlayer2.winRound();
            System.out.println("player 2 win   points = " + abstractPlayer2.getPoints());
            return 2;
        }
        throw new GameExceptions("uncorrected input/motion");
    }

}
