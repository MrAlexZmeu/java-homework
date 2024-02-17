package ru.java.homeworks.homework30.test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import ru.java.homeworks.homework30.MainApplication;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainApplicationTest {

    @Test
    public void testArrayAfterLastOne(){
        int[] test = {1,2,1,2,2};
        int[] res = {2,2};
        Assertions.assertArrayEquals(res, MainApplication.arrayAfterLastOne(test));

        int[] test1 = {2,2,2,2};
        boolean exceptionThrown = false;

        try {
            MainApplication.arrayAfterLastOne(test1);
        } catch (RuntimeException e) {
            exceptionThrown = true;
        }

        assertTrue(exceptionThrown);
    }


    @Test
    public void testArrayConsistOfOneTwo(){
        int[] test = {1,2};
        assertTrue(MainApplication.arrayConsistOfOneTwo(test));
        int[] test1 = {1,1};
        assertFalse(MainApplication.arrayConsistOfOneTwo(test1));
    }

}
