package com.stackroute.wave4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MatrixAdditionTest {
    MatrixAddition matrixObject;

    @Before
    public void setUp() throws Exception {
        matrixObject = new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        matrixObject = null;
    }

    @Test
    public void additionSuccess() {
        int[][] firstMatrix = {{1, 2}, {3, 4}, {5, 6}};
        int[][] secondMatrix = {{9, 8}, {7, 6}, {5, 4}};
        String expectedFinal = "[[10, 10], [10, 10], [10, 10]]";
        assertEquals(expectedFinal, matrixObject.addition(firstMatrix, secondMatrix, 3, 2));
    }

    @Test
    public void additionFailure() {
        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] secondMatrix = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        String expectedFinal = "[[5 10, 10], [10, 8, 10], [10, 11, 10]]";
        assertNotEquals(expectedFinal, matrixObject.addition(firstMatrix, secondMatrix, 3, 3));
    }
    @Test
    public void additionFailure1() {
        int[][] firstMatrix = {{0, 0, 0}, {4, 5, 6}, {0, 0, 0}};
        int[][] secondMatrix = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        String expectedFinal = "[[5 10, 10], [10, 8, 10], [10, 11, 10]]";
        assertNotEquals(expectedFinal, matrixObject.addition(firstMatrix, secondMatrix, 3, 3));
    }
}