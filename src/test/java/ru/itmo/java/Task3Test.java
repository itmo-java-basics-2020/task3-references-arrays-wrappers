package ru.itmo.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@SuppressWarnings({"UnnecessaryBoxing", "deprecation", "CachedNumberConstructorCall", "RedundantCast"})
public class Task3Test {

    @Test
    public void test_getShiftedArray() {
        Task3 inst = new Task3();

        Assert.assertArrayEquals(new int[]{5, 1, 2, 3, 4}, inst.getShiftedArray(new int[]{1, 2, 3, 4, 5}));
        Assert.assertArrayEquals(new int[]{0, 0, 1, 0, 0}, inst.getShiftedArray(new int[]{0, 1, 0, 0, 0}));
        Assert.assertArrayEquals(new int[]{5, 5, 5, 4, 4}, inst.getShiftedArray(new int[]{5, 5, 4, 4, 5}));
    }

    @Test
    public void test_getMaxProduct() {
        Task3 inst = new Task3();

        Assert.assertEquals(15, inst.getMaxProduct(new int[]{5, 3}));
        Assert.assertEquals(25, inst.getMaxProduct(new int[]{5, 2, 3, 4, 5}));
        Assert.assertEquals(20, inst.getMaxProduct(new int[]{4, 2, 3, 4, 5}));
        Assert.assertEquals(20, inst.getMaxProduct(new int[]{5, 1, 3, 4, 1}));
        Assert.assertEquals(9, inst.getMaxProduct(new int[]{3, 1, 3, 3, 1}));
    }

    @Test
    public void test_getABpercentage() {
        Task3 inst = new Task3();

        Assert.assertEquals(40, inst.getABpercentage("fatyb"));
        Assert.assertEquals(60, inst.getABpercentage("aBgac"));
        Assert.assertEquals(16, inst.getABpercentage("nbyurt"));
    }

    @Test
    public void test_isPalindrome() {
        Task3 inst = new Task3();

        Assert.assertTrue(inst.isPalindrome("радар"));
        Assert.assertTrue(inst.isPalindrome("топот"));
        Assert.assertTrue(inst.isPalindrome("ротатор"));
        Assert.assertTrue(inst.isPalindrome("акка"));
        Assert.assertFalse(inst.isPalindrome("итмо"));
        Assert.assertFalse(inst.isPalindrome("тапок"));
    }

    @Test
    public void test_getEncodedString() {
        Task3 inst = new Task3();

        Assert.assertEquals("a3b3c1a2c1b1", inst.getEncodedString("aaabbbcaacb"));
        Assert.assertEquals("a7", inst.getEncodedString("aaaaaaa"));
        Assert.assertEquals("a1b2a1", inst.getEncodedString("abba"));
        Assert.assertEquals("b1", inst.getEncodedString("b"));
    }

}