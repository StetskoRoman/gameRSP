package com.rv.gamersp.game;

import com.rv.gamersp.exceptions.GameExceptions;
import com.rv.gamersp.gamer.AbstractPlayer;
import com.rv.gamersp.gamer.ComputerPlayer;
import com.rv.gamersp.gamer.Player;


public class ClassicGameVsComputer implements IGame {

    private Player player1;
    private ComputerPlayer player2;
    private int amountOfRounds;

    public ClassicGameVsComputer(Player player1, ComputerPlayer player2, int amountOfRounds) {
        this.player1 = player1;
        this.player2 = player2;
        this.amountOfRounds = amountOfRounds;
    }

    public AbstractPlayer getPlayer1() {
        return player1;
    }

    public AbstractPlayer getPlayer2() {
        return player2;
    }

    public int getAmountOfRounds() {
        return amountOfRounds;
    }

    @Override
    public void startGame() throws GameExceptions {
        for (int i = 0; i < amountOfRounds; i++) {
            Round round = new Round(player1, player2);
            round.compareMotions(player1.setMotion(1), player2.setMotion(player2.doMotion()));
            System.out.println("player 1 motion =" + player1.getMotion() + "    player 2 motion = " + player2.getMotion());
        }
        while (player1.getPoints() == player2.getPoints()) {
            Round round = new Round(player1, player2);
            round.compareMotions(player1.setMotion(1), player2.setMotion(player2.doMotion()));
            System.out.println("player 1 motion =" + player1.getMotion() + "    player 2 motion = " + player2.getMotion());
        }
        findWinner();
        player1.cleanPoints();
        player2.cleanPoints();

    }

    @Override
    public void findWinner() throws GameExceptions {
        if (player1.getPoints() < player2.getPoints()) {
            player1.assignLose();
            System.out.println("player 1 lost this game");
        }
        if (player1.getPoints() > player2.getPoints()) {
            player1.assignWin();
            System.out.println("player 1 win this game");
        }



    }
}
