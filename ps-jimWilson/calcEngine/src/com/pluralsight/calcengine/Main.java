package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double val1 = 100.0;
        double val2 = 3;
        double result = 0.0;
        char opCode = 'd';

        if (opCode == 'a')
            result = val1 + val2;
        else if (opCode == 's')
            result = val1 - val2;
        else if (opCode == 'd')
            result = val2 != 0.0 ? val1 / val2 : 0.0;
        else if (opCode == 'm')
            result = val1 * val2;
        else
            System.out.println("Error - Invalid opCode");

        System.out.println(result);
    }
}
