package com.example;

import java.util.Arrays;

/**
 * 插入
 */
public class InsertSort {

    private void onInsertSort(int array[], int len) {
        int count=1;
        for (int i = 0; i < len-1; i++) {
            if (array[i] > array[i + 1]) {
                int middle = array[i + 1];
                int j;
                for (j = i; j >= 0 && array[j] > middle; j--) {
                    array[j + 1] = array[j];
                    System.out.println(count++);
                    System.out.println(Arrays.toString(array));
                }
                array[j + 1] = middle;
                System.out.println(Arrays.toString(array));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int array[] = new int[]{3, 8, 5, 6, 4, 7, 9, 2, 0, 1};
        InsertSort insertSort = new InsertSort();
        insertSort.onInsertSort(array, array.length);
    }
}
