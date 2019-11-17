package com.r.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShuntingYardAlgorithmTest {
    private ShuntingYardAlgorithm shuntingYardAlgorithmSUT;

    @Before
    public void setUp() {
        shuntingYardAlgorithmSUT = new ShuntingYardAlgorithm();
    }

    @Test
    public void testShouldConvertInfixToPostfix() {
        String infixExprression = "3 + 5 * 2";

        Integer value = shuntingYardAlgorithmSUT.evaluateExpression(infixExprression);

        assertEquals(Integer.valueOf(13), value);
    }
}