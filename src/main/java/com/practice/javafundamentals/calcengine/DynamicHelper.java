package com.practice.javafundamentals.calcengine;

/**
 * Created by RB034746 on 05/09/2017.
 */
public class DynamicHelper {
    private MathProcessor[] handlers;

    public DynamicHelper(MathProcessor[] handlers){
        this.handlers = handlers;
    }

    public String process(String statement){
        String[] part = statement.split(MathProcessor.SEPARATOR);
        String keyword = part[0]; // add

        MathProcessor theHandler = null;

        for(MathProcessor handler:handlers){
            if(keyword.equalsIgnoreCase(handler.getOperationKeyword())){
                theHandler = handler;
                break;
            }
        }

        double leftVal = Double.parseDouble(part[1]);
        double rightVal = Double.parseDouble(part[2]);

        double result = theHandler.doCalculation(leftVal,rightVal);

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftVal);
        sb.append(' ');
        sb.append(theHandler.getSymbol());
        sb.append(' ');
        sb.append(rightVal);
        sb.append('=');
        sb.append(result);

        return sb.toString();
    }
}
