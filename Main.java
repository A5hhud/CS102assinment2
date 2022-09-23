package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    //array0: [1,77,-5,2,65,30] => True
        //    array1: [-10,50,15,2,77] => False

        int[] array0 = {1,77,-5,2,65,30};
        int[] array1 = {-10,50,15,2,77};

        System.out.println("array0: " + Arrays.toString(array0) + " ==> "+ Test(array0));
        System.out.println("array0: " + Arrays.toString(array1) + " ==> "+ Test(array1));
    }

    public static boolean Test (int[] Array) {
        int flag65 = 0;
        int flag77 = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == 65) {
                flag65 = 1;
            }
            if (Array[i] == 77) {
                flag77 = 1;
            }
        }
        if (flag65 == 1 && flag77 == 1) {
            return true;
        } else {
            return false;
        }
    }
}