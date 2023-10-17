package com.example;

/**
 * Hello world!
 */
public final class ArraryOperation {

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = reverseArray(arr, 0, arr.length - 1);
        for (int arr2 : result) {
            System.out.println(arr2);
        }
    }
    public static int[] reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
       return arr;
    }
}
