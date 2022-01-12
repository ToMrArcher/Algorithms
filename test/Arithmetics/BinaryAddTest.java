package Arithmetics;

import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BinaryAddTest {

    @Test
    public void testNull(){

        Integer[] A = null;
        Integer[] B = null;
        Integer[] C = BinaryAdd.add(A, B);

        assertNull(C);
    }

    @Test
    public void testTwoEmpty(){

        Integer[] A = {};
        Integer[] B = {};
        Integer[] C = BinaryAdd.add(A, B);

        assertEquals(C.length, 0);
    }

    @Test
    public void testTwo4Bit(){
        Integer[] A = {1, 0, 0, 1};
        Integer[] B = {0, 0, 1, 1};
        Integer[] C = BinaryAdd.add(A, B);

        Arrays.stream(C).forEach(integer -> System.out.println(integer));
        assertEquals(0, C[0].intValue());
        assertEquals(1, C[1].intValue());

    }

}
