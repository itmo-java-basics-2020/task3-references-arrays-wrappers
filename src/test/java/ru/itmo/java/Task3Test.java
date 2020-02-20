package ru.itmo.java;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Task3Test {
    private final Task3 instance = new Task3();

    @Test
    public void test_getShiftedArray() {
        Assert.assertArrayEquals(new int[]{5, 1, 2, 3, 4}, instance.getShiftedArray(new int[]{1, 2, 3, 4, 5}));
        Assert.assertArrayEquals(new int[]{0, 0, 1, 0, 0}, instance.getShiftedArray(new int[]{0, 1, 0, 0, 0}));
        Assert.assertArrayEquals(new int[]{5, 5, 5, 4, 4}, instance.getShiftedArray(new int[]{5, 5, 4, 4, 5}));
    }

    @Test
    public void test_getMaxProduct() {
        Assert.assertEquals(15, instance.getMaxProduct(new int[]{5, 3}));
        Assert.assertEquals(25, instance.getMaxProduct(new int[]{5, 2, 3, 4, 5}));
        Assert.assertEquals(20, instance.getMaxProduct(new int[]{4, 2, 3, 4, 5}));
        Assert.assertEquals(20, instance.getMaxProduct(new int[]{5, 1, 3, 4, 1}));
        Assert.assertEquals(9, instance.getMaxProduct(new int[]{3, 1, 3, 3, 1}));
    }

    @Test
    public void test_getABpercentage() {
        Assert.assertEquals(40, instance.getABpercentage("fatyb"));
        Assert.assertEquals(60, instance.getABpercentage("aBgac"));
        Assert.assertEquals(16, instance.getABpercentage("nbyurt"));
    }

    @Test
    public void test_isPalindrome() {
        Assert.assertTrue(instance.isPalindrome("радар"));
        Assert.assertTrue(instance.isPalindrome("топот"));
        Assert.assertTrue(instance.isPalindrome("ротатор"));
        Assert.assertTrue(instance.isPalindrome("акка"));
        Assert.assertFalse(instance.isPalindrome("итмо"));
        Assert.assertFalse(instance.isPalindrome("тапок"));
    }

    @Test
    public void test_getEncodedString() {
        Assert.assertEquals("a3b3c1a2c1b1", instance.getEncodedString("aaabbbcaacb"));
        Assert.assertEquals("a7", instance.getEncodedString("aaaaaaa"));
        Assert.assertEquals("a1b2a1", instance.getEncodedString("abba"));
        Assert.assertEquals("b1", instance.getEncodedString("b"));
    }

    @Test
    public void test_isPermutation() {
        assertThat(instance.isPermutation("permutation", "permatution"), is(true));
        assertThat(instance.isPermutation("ABCdef", "ABcdef"), is(false));
        assertThat(instance.isPermutation("null", null), is(false));
        assertThat(instance.isPermutation(" a", " a "), is(false));
        assertThat(instance.isPermutation(" a  ", "  a "), is(true));
    }

    @Test
    public void test_isUniqueString() {
        assertThat(instance.isUniqueString("abcdefg"), is(true));
        assertThat(instance.isUniqueString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"), is(false));
        assertThat(instance.isUniqueString(null), is(false));
        assertThat(instance.isUniqueString(" space "), is(false));
        assertThat(instance.isUniqueString("wtf"), is(true));
    }

    @Test
    public void test_matrixTranspose() {
        assertThat(instance.matrixTranspose(new int[][]{{1, -1}, {-1, 1}}), is(new int[][]{{1, -1}, {-1, 1}}));
        assertThat(instance.matrixTranspose(new int[][]{{14, 228, 1337}, {420, 55, 69}, {777, 88, 911}}),
                is(new int[][]{{14, 420, 777}, {228, 55, 88}, {1337, 69, 911}}));
        assertThat(instance.matrixTranspose(new int[][]{{1, 2, 23233, 10}, {114, 10, 5, 6}, {7, 37, 8, 9}, {0, 17, 8, 9}}),
                is(new int[][]{{1, 114, 7, 0}, {2, 10, 37, 17}, {23233, 5, 8, 8}, {10, 6, 9, 9}}));
        assertThat(instance.matrixTranspose(new int[][]{{1, 2, 3, 2, 1}, {4, 5, 6, 5, 4}, {7, 8, 9, 8, -124134}, {10, 11, 12, 11, -124}, {0, 0, 0, 0, 0}}),
                is(new int[][]{{1, 4, 7, 10, 0}, {2, 5, 8, 11, 0}, {3, 6, 9, 12, 0}, {2, 5, 8, 11, 0}, {1, 4, -124134, -124, 0}}));
    }
}