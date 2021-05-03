package com.contactsunny.poc.bubblesort;

public class App {

    public static void main(String[] args) {
        int[] array = {29, 10, 14, 37, 13, 2, 100};
        System.out.println("Original Array: ");
        printArray(array);
        System.out.println("-------------------------");

        bubbleSortAscending(array);

        System.out.println("Sorted Array in Ascending order: ");
        printArray(array);
        System.out.println("-------------------------");

        bubbleSortDescending(array);

        System.out.println("Sorted Array in Descending order: ");
        printArray(array);
        System.out.println("-------------------------");
    }

    /**
     * Method to perform bubble sort on the given unsorted array.
     *
     * @param array The given unsorted array.
     */
    private static void bubbleSortDescending(int[] array) {
        // Iterating through the length of the array in reverse.
        // Starting from the end of the array and coming back to the first.
        // This is so that we can bubble the min of the values to the right.
        for (int arrayIndex = array.length - 1; arrayIndex > 0; arrayIndex--) {
            // Starting the inner loop from the beginning of the array
            // to the element pointed to by the arrayIndex.
            for (int minIndex = 0; minIndex < arrayIndex; minIndex++) {
                // We are checking if the jth element is less than the next one.
                // If so, swapping them to sort that sub-array.
                if (array[minIndex] < array[minIndex + 1]) {
                    int temp = array[minIndex];
                    array[minIndex] = array[minIndex + 1];
                    array[minIndex + 1] = temp;
                }
            }
        }
    }

    /**
     * Method to perform bubble sort on the given unsorted array.
     *
     * @param array The given unsorted array.
     */
    private static void bubbleSortAscending(int[] array) {
        // Iterating through the length of the array in reverse.
        // Starting from the end of the array and coming back to the first.
        // This is so that we can bubble the max of the values to the right.
        for (int arrayIndex = array.length - 1; arrayIndex > 0; arrayIndex--) {
            // Starting the inner loop from the beginning of the array
            // to the element pointed to by the arrayIndex.
            for (int maxIndex = 0; maxIndex < arrayIndex; maxIndex++) {
                // We are checking if the jth element is greater than the next one.
                // If so, swapping them to sort that sub-array.
                if (array[maxIndex] > array[maxIndex + 1]) {
                    int temp = array[maxIndex];
                    array[maxIndex] = array[maxIndex + 1];
                    array[maxIndex + 1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
