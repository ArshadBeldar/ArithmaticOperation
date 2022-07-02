package com.infogalaxy;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    @org.junit.jupiter.api.Test
    void sub() {
        Subtraction subtraction= new Subtraction();

        Assertions.assertEquals(10,subtraction.sub(15,5));
        Assertions.assertEquals(20,subtraction.sub(30,10));
    }
}