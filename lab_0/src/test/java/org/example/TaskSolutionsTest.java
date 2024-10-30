package org.example;

import org.junit.jupiter.api.Test;

import static org.example.TaskSolutions.*;
import static org.junit.jupiter.api.Assertions.*;

class TaskSolutionsTest {

    @Test
    public void testFindOddNumbers() {
        assertArrayEquals(new int[]{1, 3, 5}, findOddNumbers(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{}, findOddNumbers(new int[]{2, 4, 6}));
    }

    @Test
    public void testAreBothOdd() {
        assertTrue(areBothOdd(3, 5));
        assertFalse(areBothOdd(2, 5));
    }

    @Test
    public void testPreviousDate() {
        assertEquals("31/12", previousDate(1, 1));
        assertEquals("28/2", previousDate(1, 3));
        assertEquals("30/4", previousDate(1, 5));
        assertEquals("30/6", previousDate(1, 7));
    }

    @Test
    public void testProductOfRange() {
        assertEquals(24, productOfRange(2, 4));
        assertEquals(120, productOfRange(1, 5));
    }

    @Test
    public void testOrderNumbers() {
        assertArrayEquals(new int[]{5, 3}, orderNumbers(5, 3));
        assertArrayEquals(new int[]{7, 2}, orderNumbers(2, 7));
    }

    @Test
    public void testReverseDigits() {
        assertEquals(21, reverseDigits(12));
        assertEquals(43, reverseDigits(34));
    }

    @Test
    public void testGetColumn() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertArrayEquals(new int[]{2, 5, 8}, getColumn(matrix, 2));
    }

    @Test
    public void testLargestSquareRoot() {
        assertEquals(4, largestSquareRoot(17));
        assertEquals(5, largestSquareRoot(25));
    }
}