package com.traceback.test;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by 53254 on 2018/2/6 19:05 /mmal
 */
public class BigDecimalTest {
    @Test
    public void test() {
        BigDecimal b1 = new BigDecimal("0.05");
        BigDecimal b2 = new BigDecimal("0.01");
        BigDecimal b3 = new BigDecimal(0.05);
        BigDecimal b4 = new BigDecimal(0.01);
        System.out.println(0.05 + 0.01);
        System.out.println(b1.add(b2));
        System.out.println(b3.add(b4));
    }
}
