package Sorting;

public class SelectionSort {

    public static int sort(Integer[] integers) {

        if(integers == null){
            return 0;
        }

        if(integers.length == 1){
            return 1;
        }

        int counter = 0;
        int smallest = 0;

        if(integers.length == 2){
            if(integers[1] < smallest){
                Integer temp = integers[0];
                integers[0] = integers[1];
                integers[1] = temp;
                counter ++;
            }
            return counter;
        }else{
            for(int i = 0; i < integers.length - 1; i++){
                for(int y = i; y < integers.length; y++){
                    if(integers[y] < integers[smallest]){
                        counter++;
                        smallest = y;
                    }
                }
                Integer temp = integers[i];
                integers[i] = integers[smallest];
                integers[smallest] = temp;
                counter++;
                smallest = i + 1;
            }
            return counter;
        }

    }
}
