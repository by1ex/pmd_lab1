package com.example.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void TestMinOne() {
        int actual = MainClass.Min(1,4);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void TestMinTwo() {
        int actual = MainClass.Min(4,1);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void TestMinThree() {
        int actual = MainClass.Min(3,3);
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void TestMinFour() {
        int actual = MainClass.Min(1,4);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void TestMaxOne() {
        int actual = MainClass.Max(1,4);
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void TestMaxTwo() {
        int actual = MainClass.Max(4,1);
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void TestMaxThree() {
        int actual = MainClass.Max(3,3);
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void TestMaxFour() {
        int actual = MainClass.Max(1,4);
        int expected = 4;
        assertEquals(expected, actual);
    }
}