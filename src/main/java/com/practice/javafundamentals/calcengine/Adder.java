package com.practice.javafundamentals.calcengine;
/**
 * Created by RB034746 on 05/03/2017.
 * Responsible for Addition
 */
public class Adder extends CalculateBase implements MathProcessor{
    public Adder(){

    }
    public Adder(double leftValue, double rightValue){
        super(leftValue,rightValue);
    }

    @Override
    public void calculate() {
        double value = getLeftValue()+getRightvalue();
        setResult(value);
    }

    public String getOperationKeyword() {
        return "add";
    }

    public char getSymbol() {
        return '+';
    }

    public double doCalculation(double leftVal, double rightVal) {
        setLeftValue(leftVal);
        setRightvalue(rightVal);
        calculate();
        return getResult();
    }
}
