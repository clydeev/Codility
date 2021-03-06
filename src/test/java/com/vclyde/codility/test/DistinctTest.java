package com.vclyde.codility.test;

import com.vclyde.codility.lesson6.Distinct;
import org.junit.Assert;
import org.junit.Test;

public class DistinctTest {

    @Test
    public void exampleTest() {
        Assert.assertEquals(3, Distinct.solution(new int[]{2, 1, 1, 2, 3, 1}));
    }

    @Test
    public void correctnessTest() {
        Assert.assertEquals(3, Distinct.solution(new int[]{2, 1, 1, 2, 3, 1}));
        Assert.assertEquals(0, Distinct.solution(new int[]{}));
        Assert.assertEquals(1, Distinct.solution(new int[]{9}));
    }
}
