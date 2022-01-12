package Searching;

public class LinearSearch {

    public static <T extends Comparable<T>> Integer find(T[] array, T value){
        if(array == null){
            return null;
        }

        for(int i = 0; i < array.length; i++){
            if(array[i].compareTo(value) == 0){
                return i;
            }
        }
        return null;
    }

}
