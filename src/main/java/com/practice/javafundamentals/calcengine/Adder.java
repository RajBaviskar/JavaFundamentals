package com.practice.javafundamentals.calcengine;
/**
 * Created by RB034746 on 05/03/2017.
 * Responsible for Addition
 */
public class Adder extends CalculateBase{
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
}
