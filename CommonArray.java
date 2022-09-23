package com.company;
import java.util.Arrays;

public class CommonArray {

    public static void main(String[] args) {

        //common element in arrays
        int[] array0 = {1, 5, -5, 2, 12, 30};
        int[] array1 = {-10, 5, 15, 2};
        int share = 0;

        //count how many shared elements there are
        for (int i = 0; i < array0.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array0[i] == array1[j]) {
                    share += 1;
                }
            }
        }

        //creates blank array for shared elements
        int[] common = new int[share];
        int nextIndex = 0;
        int flag = 0;

        //adds shared elements to array
        for (int i = 0; i < array0.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array0[i] == array1[j]) {
                    //checks if number is already in shared array
                    for (int k = 0; k < common.length; k++) {
                        if (array0[i] == common[k]) {
                            flag = 1;
                        }
                    }
                    if (flag != 1) {
                        common[nextIndex] += array0[i];
                        nextIndex++;
                        flag = 0;
                    }
                }
            }
        }
        System.out.println("array0: "+Arrays.toString(array0));
        System.out.println("array0: "+Arrays.toString(array1));
        System.out.println("Common Elements: " + Arrays.toString(common));
    }
}
