package Sorting;

import java.util.Arrays;
import java.util.Collection;

public class InsertionSortReversed {

    public static <T extends Comparable<T>> int sort(T[] collection){
        int counter = 0;

        if(collection == null){
            return 0;
        }

        for(int i = 1; i < collection.length; i++){
            T key = collection[i];
            int j = i - 1;

            while(j >= 0 && collection[j].compareTo(key) < 0 ){
                collection[j + 1] = collection[j];
                j = j - 1;
                counter++;
            }

            collection[j + 1] = key;

        }

        return counter;
    }

    public static void main(String[] args) {
        Integer[] array = {5, 2, 9, 123, 53, 2};
        int steps = sort(array);
        Arrays.stream(array).forEach(integer -> System.out.println(integer));
        System.out.println("Steps " + steps);
    }

}
