package Arithmetics;

import java.util.Arrays;

public class BinaryAdd {

    public static Integer[] add(Integer[] A, Integer[] B){

        if(A == null || B == null){
            return null;
        }
        if(A.length == 0 || B.length == 0){
            return new Integer[0];
        }

        Integer[] C = new Integer[A.length + 1];

        int carry = 0;
        for(int i = B.length - 1; i >= 0; i--){
            C[i + 1] = (A[i] + B[i] + carry) % 2;

            if(A[i] + B[i] + carry >= 2){
                carry = 1;
            }else{
                carry = 0;
            }
        }
        C[0] = carry;

        return C;
    }

}
