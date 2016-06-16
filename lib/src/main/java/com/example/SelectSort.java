package com.example;

import java.util.Arrays;

/**
 * 选择
 */
public class SelectSort {
    private void onSelectSort(int array[], int len) {
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) { //找到数组中比初始值小的最小值在数组中的位置，进行替换
                if (array[min] > array[j]) min = j;
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) throws Exception {
        int array[] = new int[]{3, 8, 5, 6, 4, 7, 9, 2, 0, 1};
        SelectSort selectSort = new SelectSort();
        selectSort.onSelectSort(array, array.length);
    }
}
