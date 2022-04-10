package sorting;

import org.testng.Assert;

import java.util.Arrays;

public class UnitTestSorting {

    /*
      This class is used to help with unit testing of sorting algorithms from the Sort class
     */
    public static void main(String[] args) {
        // You will use these arrays to validate whether your sorting algorithm functions as expected
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

        // Create instance of Sort class
        Sorting sorting = new Sorting();

        // Pass the unsorted array to selectionSort() method (or any method you want to unit test) from Sort class
        sorting.selectionSort(unSortedArray);

        // Verify if the unsorted array is sorted by the desired method
        Assert.assertEquals(unSortedArray, sortedArray, "ARRAY IS NOT SORTED... YET!");


        //Example of how the array should look once sorted
        System.out.println("Sorted array should be printed this way: "+ Arrays.toString(sortedArray));

        //Bubble sort Unit Testing:
        System.out.println("Bubble Sorted Array: " + Arrays.toString(sorting.bubbleSort(unSortedArray)));
        //Merge sort Unit Testing:
        System.out.println("Merge Sorted Array: "+ Arrays.toString(sorting.mergeSort(unSortedArray, 0, 6)));
        //Heap sort Unit Testing:
        System.out.println("Heap Sorted Array: "+ Arrays.toString(sorting.heapSort(unSortedArray)));
        //Shell sort Unit testing:
        System.out.println("Shell Sorted Array: "+Arrays.toString(sorting.shellSort(unSortedArray)));
        //Quick sort Unit testing:
        System.out.println("Quick Sorted Array: "+ Arrays.toString(Sorting.quickSort(unSortedArray,0,6)));
    }
}
