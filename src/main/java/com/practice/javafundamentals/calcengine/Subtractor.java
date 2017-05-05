package com.practice.javafundamentals.calcengine;

/**
 * Created by RB034746 on 05/03/2017.
 */
public class Subtractor extends CalculateBase{
    public Subtractor(){

    }
    public Subtractor(double leftValue, double rightValue){
        super(leftValue,rightValue);
    }

    @Override
    public void calculate() {
        double value = getLeftValue() - getRightvalue();
        setResult(value);
    }
}
