package com.example;

import java.util.Arrays;

/**
 * 希尔
 */
public class ShellSort {

    private void onShellSort(int array[], int len) {
        int count=1;
        for (int gap = len / 2; gap > 0; gap /= 2) {
            for (int i = 0; i < len; i = i + gap) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && temp < array[j - gap]; j -= gap) {
                    array[j] = array[j = gap];
                    System.out.println(count++);
                    System.out.println(Arrays.toString(array));
                }
                array[j] = temp;
                System.out.println(Arrays.toString(array));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int array[] = new int[]{3, 8, 5, 6, 4, 7, 9, 2, 0, 1};
        ShellSort shellSort=new ShellSort();
        shellSort.onShellSort(array,array.length);
    }
}
