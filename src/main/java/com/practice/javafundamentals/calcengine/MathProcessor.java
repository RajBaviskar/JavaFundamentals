package com.practice.javafundamentals.calcengine;

/**
 * Created by RB034746 on 05/09/2017.
 */
public interface MathProcessor {
    String SEPARATOR = " ";
    String getOperationKeyword (); // ex-: Add
    char getSymbol();
    double doCalculation(double leftVal, double rightVal);
}
