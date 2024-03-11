package org.example.tp0;

import org.example.tp0.BlackJack;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class BlackJackTest {
    @Test
    public void bothPlayersGoTooHigh() {
        int result = new BlackJack().play(30, 30);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void leftPlayerWins() {
        int result = new BlackJack().play(10, 9);
        Assertions.assertEquals(10, result);
    }
}