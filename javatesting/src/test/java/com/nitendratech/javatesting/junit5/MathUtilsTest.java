package com.nitendratech.javatesting.junit5;

import com.nitendratech.javatesting.MathUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by @author nitendratech on 6/26/20
 */
public class MathUtilsTest {

    MathUtils mathUtils;




    @Test
    void test(){
        MathUtils mathUtils = new MathUtils();
        int expected =4;
        int actual = mathUtils.add(2,2);

        assertEquals(5,mathUtils.add(2,3),"The method should add TWo Numbers");
        assertEquals(6,mathUtils.add(2,4));
        assertEquals(6,mathUtils.add(3,3));
    }



    @Test
    void testComputeSircleRadius(){
        MathUtils mathUtils = new MathUtils();


        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),"Should return Circle Area");

    }

}
