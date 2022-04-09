package data_structures;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data_structures.data.
         *
         * Store and retrieve data_structures.data from/to a database table.
         */

        ArrayList<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(20);
        myArrayList.add(7);
        myArrayList.add(85);
        myArrayList.add(10);
        myArrayList.add(169);

        System.out.println("MyArrayList Elements are: ");
        for (Integer integer : myArrayList) {
            System.out.print(integer + ",");
        }

        myArrayList.remove(2);

        System.out.println("\nMyArraylist Elements after removing using the remove() method, that removes by index: ");
        for (Integer integer : myArrayList) {
            System.out.print(integer + ",");
        }

        System.out.println("\nDemonstration of the get() method: " + myArrayList.get(3));

        System.out.println("\nIterating through the list with an iterator: ");

        Iterator<Integer> myIterator = myArrayList.iterator();

        for (int n : myArrayList) {
            System.out.println(myIterator.next());
        }

    }

}


