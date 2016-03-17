package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        double val1 = 100.0;
        double val2 = 30;
        double result;
        char opCode = 'd';

        if (opCode == 'a')
            result = val1 + val2;
        else if (opCode == 's')
            result = val1 - val2;
        else if (opCode == 'd')
            result = val2 != 0.0 ? val1 / val2 : 0.0;
        else if (opCode == 'm')
            result = val1 * val2;
        else {
            System.out.println("Error - Invalid opCode");
            result = 0.0;
        }

        System.out.println(result);

        /* For Each Loop
        double[] arr = { 10, 5, 1.6 };
        double sum = 0;
        for (double i: arr)
            sum += i;
        System.out.println(sum);
         */

    }
}
