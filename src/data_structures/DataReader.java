package data_structures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

    /**
     * Create an API to read the .txt file and print it to the console.
     *      HINT: Use BufferedReader class
     * Use try-catch block to handle any exceptions
     *
     * Store and retrieve the file to/from a database table.
     *
     * After reading from file using BufferedReader API, store each word, first into a LinkedList. Each word
     * should construct a node in LinkedList. Second, do the same, but with a Stack.
     * Finally, traverse through the list\stack & retrieve each item in `FIFO` order and `FILO` order, respectively
     *
     * Demonstrate how to use a stack using push, peek, search & pop methods.
     * Use For-Each & While-loop with Iterator to retrieve/print data.
     **/




        String systemPath = System.getProperty("user.dir");
        String relativePath = "\\src\\data\\self-driving-car.txt";
        String path = systemPath + relativePath;
        FileReader fileReader;
        BufferedReader bufferedReader;

        public static void main(String[] args) throws Exception {


            DataReader dr = new DataReader();
            dr.readFiles();

        }


        void readFiles() throws Exception{
            String data;
            try {
                fileReader = new FileReader(path);
                bufferedReader = new BufferedReader(fileReader);
            } catch (IOException e) {
                System.out.println("Unable to find file path!");
            }

            try {
                while ((data = bufferedReader.readLine()) != null) {
                    System.out.println(data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileReader.close();
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }