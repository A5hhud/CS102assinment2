package com.company;
import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        char[] forward = {'A', 's', 'h', 'h', 'u', 'd'};
        char[] backward = new char[forward.length];

        for (int i = forward.length - 1; i >= 0; i--) {
            backward [forward.length-(i+1)] += forward[i];
        }

        System.out.println(Arrays.toString(backward));

    }
}
