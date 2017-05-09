package com.practice.javafundamentals.calcengine;

/**
 * Created by RB034746 on 05/09/2017.
 */
public class PowerOf  implements MathProcessor{

    public String getOperationKeyword() {
        return "power";
    }

    public char getSymbol() {
        return '^';
    }

    public double doCalculation(double leftVal, double rightVal) {
        return Math.pow(leftVal,rightVal);
    }
}
