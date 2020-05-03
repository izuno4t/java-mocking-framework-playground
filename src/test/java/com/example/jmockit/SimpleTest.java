package com.example.jmockit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import mockit.Mock;
import mockit.MockUp;

public class SimpleTest {

    @Test
    public void test() {
        new MockUp<java.lang.Math>() {
            @Mock
            public double random() {
                // 常に2.5を返すrandom()メソッド
                return 2.5;
            }
        };
        assertEquals(2.5, Math.random(), 0.1);
        assertEquals(2.5, Math.random(), 0.1);
    }

}
