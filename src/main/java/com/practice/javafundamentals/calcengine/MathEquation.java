package com.practice.javafundamentals.calcengine;

/**
 * Created by RB034746 on 05/03/2017.
 */
public class MathEquation {
    private double leftValue;
    private double rightvalue;
    private double result;
    private char operation = 'a';

    public MathEquation(char operation){
        this.operation = operation;
    }

    public MathEquation(double leftValue, double rightvalue,char operation){
        this(operation);
        this.leftValue = leftValue;
        this.rightvalue = rightvalue;
    }

    public double getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public double getRightvalue() {
        return rightvalue;
    }

    public void setRightvalue(double rightvalue) {
        this.rightvalue = rightvalue;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void execute(){

        switch (operation){
            case 'a':
                result = leftValue + rightvalue;
                break;
            case 's':
                result = leftValue - rightvalue;
                break;
            case 'd':
                result = leftValue / rightvalue;
                break;
            case 'm':
                result = leftValue * rightvalue;
                break;
            default:
                System.out.println("Error: Invalid Operation");
                result = 0.0d;
                break;
        }
    }



    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

}
