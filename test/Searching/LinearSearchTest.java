package Searching;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearSearchTest {

    @Test
    public void TestNull(){
        Integer[] integers = null;
        assertEquals(LinearSearch.find(integers, 1), null);
    }

    @Test
    public void TestNotFoundReturnNull(){
        Integer[] integers = randomArray();
        int key = 11;
        assertEquals(LinearSearch.find(integers, key), null);
    }

    @Test
    public void TestFoundReturnIndex(){
        Integer[] integers = randomArray();
        Integer k = 0;
        Integer v = integers[k];
        assertEquals(LinearSearch.find(integers, v), k);
    }

    public Integer[] randomArray(){
        Integer[] integers = {randomNumber(1, 10), randomNumber(1, 10), randomNumber(1, 10), randomNumber(1, 10), randomNumber(1, 10), randomNumber(1, 10), randomNumber(1, 10), randomNumber(1, 10)};
        return integers;
    }

    public int randomNumber(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

}
