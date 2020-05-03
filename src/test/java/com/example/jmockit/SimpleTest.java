package com.example.jmockit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class SimpleTest {

    @Test
    public void test() {
        assertEquals(2.5, Math.random(), 0.1);
        assertEquals(2.5, Math.random(), 0.1);
    }

}
