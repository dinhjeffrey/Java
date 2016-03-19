package com.pluralsight.calcengine;
import java.util.Arrays;

/*
creates new arr
passes values into a method that creates a new instance with the field values
loops through each element of array and executes the operation in class MathEquation
prints
 */

public class Main {

    public static void main(String[] args) {

        MathEquation[] arr = new MathEquation[4]; // creates a new arr of size 4
        arr[0] = create(100.0, 50.0, 'd');
        arr[1] = create(25.0, 92.0, 'a');
        arr[2] = create(225.0, 17.0, 's');
        arr[3] = create(11.0, 3.0, 'm');


        for (MathEquation i : arr) {
            i.execute();
            System.out.print("result = ");
            System.out.println(i.getResult());
        }
    }

    // creates a new instance and returns MathEquation
    public static MathEquation create(double leftVal, double rightVal, char opCode)  {
        MathEquation set = new MathEquation();
        // creates new instance set. Sets values passed in like 100.0, 50.0, 'd' to those field variables in MathEquation
        set.setLeftVal(leftVal);
        set.setRightVal(rightVal);
        set.setOpCode(opCode);


        return set;
    }
}
