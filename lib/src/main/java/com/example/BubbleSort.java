package com.example;

import java.util.Arrays;

/**
 * 冒泡
 */
public class BubbleSort {

    private void onBubbleSort(int array[], int len) {
        /**
         * 10个数字，执行45次循环 外循环执行i=9,8,7...1,
         * （9+1）*9/2=45
         */
        int count = 1;
        for (int i = 0; i < len - 1; i++) { //比较n-1次
            for (int j = len - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int middle = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = middle;
                }
                System.out.println(count++);
                System.out.println(Arrays.toString(array));
            }
        }
    }

    private void onOptimizeBubbleSort(int array[], int len) {
        /**
         * 优化后执行30次，减少了i的循环
         */
        int count = 1;
        for (int i = 0; i < len - 1; i++) { //比较n-1次
            boolean noChange = true;
            for (int j = len - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int middle = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = middle;
                    noChange = false;
                }
                System.out.println(count++);
                System.out.println(Arrays.toString(array));
            }
            if (noChange) return;
        }
    }

    public static void main(String[] args) throws Exception {
        int array[] = new int[]{3, 1, 5, 6, 4, 7, 9, 2, 0, 8};
        /**
         * 指针i指向开始时(即需要从后向前替换到的位置,3,1,5...)，i=0;要把最后一个换到头位要进过length-1个替换
         * 指针j指向8，先判断0,8
         */
        BubbleSort bubbleSort = new BubbleSort();
        //        bubbleSort.onBubbleSort(array, array.length);
        bubbleSort.onOptimizeBubbleSort(array, array.length);
    }
}
