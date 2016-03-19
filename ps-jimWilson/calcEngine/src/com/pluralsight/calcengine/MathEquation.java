package com.pluralsight.calcengine;

/**
 * Created by Jeffrey on 3/17/16.
 */
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    // can set and get value for any of the fields
    public double getLeftVal() {return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public double getRightVal() {return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public char getOpCode() {return opCode;}
    public void setOpCode(char opCode) {this.opCode = opCode;}

    MathEquation() {}

    MathEquation(char opCode){
        this.opCode = opCode;
    }

    MathEquation(double leftVal, double rightVal, char opCode){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    /*result is different. result executes an operation.
     doesn't make sense to modify results from the outside. They can see it but not modify it.
     in this case we want make our result a read only value. We want an accessor (get) but not a mutator (set)
    */
    public double getResult() {return result;}

    public void execute() {
        switch(opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0 ? leftVal / rightVal : 0.0;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0;
                break;
        }
    }
}
