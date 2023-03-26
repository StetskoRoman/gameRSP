package com.rv.gamersp;

import com.rv.gamersp.exceptions.GameExceptions;
import com.rv.gamersp.game.ClassicGameVsComputer;
import com.rv.gamersp.gamer.ComputerPlayer;
import com.rv.gamersp.gamer.Player;


public class RunnerMainAlgoritm {

    public static void main(String[] args) throws GameExceptions {

        Player player = new Player("Rom");

        ComputerPlayer computerPlayer = new ComputerPlayer("Artificial Player");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(computerPlayer.doMotion());
//        }

        int n = 1;
        for (int i = 0; i < 15; i++) {
            ClassicGameVsComputer classicGame = new ClassicGameVsComputer(player, computerPlayer, n);
            classicGame.startGame();
        }


        System.out.println("wins " + player.getTotalWins());
        System.out.println("loses " + player.getTotalLoses());
    }
}
