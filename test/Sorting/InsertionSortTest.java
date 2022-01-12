package Sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InsertionSortTest {

    @Test
    public void TestNull(){
        Integer[] integer = null;
        int iterations = InsertionSort.sort(integer);
        assertEquals(iterations, 0);
    }

    @Test
    public void TestRandom(){
        Integer[] integers = randomArray();
        InsertionSort.sort(integers);
        Arrays.stream(integers).forEach(integer -> System.out.println(integer));
        assertTrue(integers[0] <= integers[1] && integers[1] <= integers[2] && integers[2] <= integers[3] && integers[4] <= integers[5]);
    }






    public Integer[] randomArray(){
        Integer[] integers = {randomNumber(1, 10), randomNumber(1, 10), randomNumber(1, 10), randomNumber(1, 10), randomNumber(1, 10), randomNumber(1, 10), randomNumber(1, 10), randomNumber(1, 10)};
        return integers;
    }

    public int randomNumber(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

}
