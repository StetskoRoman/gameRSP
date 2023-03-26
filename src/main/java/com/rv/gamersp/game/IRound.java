package com.rv.gamersp.game;

import com.rv.gamersp.exceptions.GameExceptions;

public interface IRound {

    int compareMotions(int motion1, int motion2) throws GameExceptions;
}
