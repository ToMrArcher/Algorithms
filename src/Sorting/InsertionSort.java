package Sorting;

public class InsertionSort {

    public static <T extends Comparable<T>> int sort(T[] array){
        int counter = 0;

        if(array == null){
            return 0;
        }

        for(int i = 1; i < array.length; i++){
            T key = array[i];
            int j = i - 1;
            while(j >= 0 && array[j].compareTo(key) > 0){
                array[j + 1] = array[j];
                j = j - 1;
                counter++;
            }
            array[j + 1] = key;
        }

        return counter;

    }


}
