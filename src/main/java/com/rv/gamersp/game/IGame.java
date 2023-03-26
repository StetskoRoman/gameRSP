package com.rv.gamersp.game;

import com.rv.gamersp.exceptions.GameExceptions;

public interface IGame {

    void startGame() throws GameExceptions;

    void findWinner() throws GameExceptions;
}
