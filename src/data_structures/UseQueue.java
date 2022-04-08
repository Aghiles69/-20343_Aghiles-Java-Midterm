package data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data_structures.data.
         *
         * Store and retrieve data_structures.data from/to a database table.
         */


        //noinspection MismatchedQueryAndUpdateOfCollection
        Queue<String> myQueue = new LinkedList<>();

        // Adding elements to myQueue using add() Method:
        myQueue.add("Red");
        myQueue.add("Yellow");
        myQueue.add("Green");
        myQueue.add("Pink");
        myQueue.add("Blue");


        //Method to print all the Elements added to the Queue:
        for (String color : myQueue) {
            System.out.println(color);
        }

        //Demonstration of removing the head of the Queue
        myQueue.remove();
    }

}
