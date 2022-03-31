package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testFindAbsolute1() {
        int[] side=new int[]{2,2,2};
//        String side1=new String(String.valueOf(side));
        String expected="tam giac deu";
        String result=TriangleClassifier.testFindAbsolute(side);
        assertEquals(expected,result);
//        System.out.println(result);
    }
}