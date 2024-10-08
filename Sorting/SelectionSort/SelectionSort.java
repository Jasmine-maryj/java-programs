package Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        // int[] arr = {3, 1, 5, 4, 2};
        // int[] arr = {5, 4, 3, 2, 1};
        int[] arr = {1};

        System.out.println("The sorted array is " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("The sorted array is " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }

        return max;
    }

    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
