package com.nitendratech.javatesting.junit5;

import com.nitendratech.javatesting.MathUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by @author nitendratech on 6/26/20
 */
public class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    static void beforeAllInit(){
        System.out.println("This needs to run before even the MathUtils object is created");

    }

    /*
    This will run before each of the test Instance runs
     */
    @BeforeEach
    void init(){
        mathUtils = new MathUtils();
    }


    @AfterEach
    void cleanup(){
        System.out.println("Cleaning Up");
    }

    @Test
    void test(){

        int expected =4;
        int actual = mathUtils.add(2,2);

        assertEquals(5,mathUtils.add(2,3),"The method should add TWo Numbers");
        assertEquals(6,mathUtils.add(2,4));
        assertEquals(6,mathUtils.add(3,3));
    }

    /*
    Throwing Exception in the Test Cases
     */
    @Test
    void testDivide(){
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0),"Divide by zero should throw Exception");

    }


    @Test
    void testComputeSircleRadius(){
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),"Should return Circle Area");

    }

}
