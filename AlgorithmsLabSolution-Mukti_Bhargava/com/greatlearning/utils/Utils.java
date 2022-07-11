package com.greatlearning.utils;

import java.util.Arrays;
import java.util.Scanner;

public class Utils {

    private int[] int_array = {};

    public Utils() {
    }

    public int[] selectionSort(int[] arr) {
        // System.out.println("Before sort: " + Arrays.toString(int_array));
        int_array = arr;
        int len = int_array.length;
        int min_index, temp;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (int_array[i] < int_array[j]) {
                    temp = int_array[i];
                    int_array[i] = int_array[j];
                    int_array[j] = temp;
                }
            }
        }
        // System.out.println("After sort: " + Arrays.toString(int_array));
        return int_array;
    }
}
