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

}