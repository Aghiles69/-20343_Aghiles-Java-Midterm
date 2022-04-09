package sorting;

public class Sorting {


    /**
     * INSTRUCTIONS
     * You must implement all of the sorting algorithms below. Feel free to add any helper methods that you may need,
     * but make sure they are private, as to not be accessed outside of this class.
     * <p>
     * You must also store the sorted arrays into their own individual database tables (Selection Sort should be stored
     * in table `selection_sort`, Insertion Sort should be stored in table `insertion_sort`)
     */

    long executionTime = 0;

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        // IMPLEMENT HERE

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] bubbleSort(int[] array) {
        // IMPLEMENT HERE
        int n = array.length;
        int temp = 0;
        for (int i = 0; true; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
            return array;
        }
    }


    public int[] mergeSort(int[] array, int l, int r) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(list, l, m);
            mergeSort(list, m + 1, r);
            merge(list, l, m, r);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle-left+1;
        int n2 = right-middle;
        int[] L = new int[n1];
        int[] R = new int[n2];
        System.arraycopy(array, left, L, 0, n1);
        for(int i = 0;i < n2; i++) {
            R[i] = array[middle+1+i];
        }
        int i = 0, j = 0, k =left;
        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                array[k++] = L[i++];
            }
            else {
                array[k++] = R[j++];
            }
        }
        while(i < n1) {
            array[k++] = L[i++];
        }
        while(j < n2) {
            array[k++] = R[j++];
        }
    }

    public int[] shellSort(int[] array) {
//    //implement here
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }
        }
        return array;


    }



    public int[] heapSort(int[] array) {
        // IMPLEMENT HERE
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapHelp(array, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapHelp(array, i, 0);
        }
        return array;
    }
    private int[] heapHelp(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapHelp(arr, n, largest);
        }


        return arr;


    }
}




    

//public int[] quickSort(int[] array) {
//    // IMPLEMENT HERE

//    return array;
//}




//public int[] bucketSort(int[] array) {
//    //implement here

//    return array;
//}


//
