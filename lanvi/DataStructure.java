import java.util.ArrayList;

/**
 * Created by Jeffrey on 10/26/15.
 */


public class DataStructure {




    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();


        linkedList.addLast("3");

        linkedList.addToFront("2");
        linkedList.addToFront("1");

        linkedList.addLast("4");
        linkedList.printList();



    }

    /** Local vs. Global
     * -------------------------------------------------------------------------------------------------------------------
     *
     * Public = global
     * Public = class, which means that all the other classes can see it and access it.
     * Public Method/Field/Variable = method, which means that other classes can use it, if they have the class obj.
     * Public Fields =  which means that other classes can see it and possibly change it.
     *
     * Private = Local
     * Private Class = (usually an inner class) means only the wrapper class can see the private class
     * Private Method = means only the wrapper can use the methods, no one else can access
     * Private Fields = local to the class, but global to all the methods inside the class,
     *                  which means that no one, but the wrapper class, can change or see what the variables are
     *
     *
     * Local means the range between { ... }
     * public void method() {
     *      String variable = "value"; // local to method(), meaning that only method() can see it, use it, change it
     *
     * }
     *
     * public void method_B() {
     *      // method_B() cannot see variable nor use it nor change it
     *      variable = "something new "; // this is illegal
     *
     *
     * }
     */

    /**
     * Arrays
     * --------------------------------------------------------------------------------------
     * specifically, they are mainly used to store primitives, such as integers, floats, doubles, bytes, shorts, long, boolean, char.
     *
     */

//        int[] intArray;
//
//        intArray = new int[10]; // this list only has 10 slots. cell 0 - cell 9
//        // boolean[] boo = new boolean[20];
//
//        intArray[0] = 16;
//        intArray[1] = 23;
//        intArray[2] = -2;
//        intArray[3] = 0;
//        intArray[4] = 99;
//
//        // length is the total size of the array which is 10
//        // all cells, by default, are initialized to 0
//
//        for (int i =0; i < intArray.length; i++) {
//            // start from 0, every time i is less than 10, then do what's inside, then increment i (+1)
//
//        }
//        /**
//         * ArrayLists
//         * ----------------------------------------------------------------------------------------------------------------
//         * - Specifically used to store "objects', such as String, Human, Square, etc.
//         * - They are dynamic, which means their size is always changing.
//         *
//         */
//
//                // A list of String (which is an object not primitive)
//                ArrayList<String> arrayL = new ArrayList<String>();
//                // Size is number of items in the list. Length is the length of list.
//                // Size start at 0. when arrayList is full, it will automatically create a new arrayList double the size
//                // of the old arrayList, copy all of the old content of the old content of the old arrayList, then store the new object at the end
//                for (int j = 0; j < arrayL.size(); j++) {
//                    System.out.println("Cell " + j + ": " + arrayL.get(j));
//                }
//
//    }


    //length list
    //read over inheritance stuff and arrayList on Oracle.

}
