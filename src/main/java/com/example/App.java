package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int last_el = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
           arr[i] = arr[i - 1];
        }
        arr[0] = last_el;
    }
}
