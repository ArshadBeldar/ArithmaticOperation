package com.infogalaxy;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    Addition addition = new Addition();

    @org.junit.jupiter.api.Test
    void add() {
        Assertions.assertEquals(10,addition.add(3,7));
        Assertions.assertEquals(10,addition.add(6,5));
        Assertions.assertEquals(10,addition.add(7,3));
    }
}