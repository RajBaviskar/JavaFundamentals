package com.practice.javafundamentals.calcengine;

/**
 * Created by RB034746 on 05/05/2017.
 */
public class CalculateHelper {

    private static final char ADD = '+';
    private static final char SUBTRACT = '-';
    private static final char DIVIDE = '/';
    private static final char MULTIPLY  = '*';

    MathCommand command;
    double leftValue;
    double rightValue;
    double result;

    public void process(String statement) throws InvalidStatementException{
        // sample string add 1.0  2.0
        String[] parts = statement.split(" ");
        if(parts.length != 3){
            throw new InvalidStatementException("Incorrect number " +
                    "of fields", statement);
        }
        String commandString = parts[0];

        try {
            leftValue = Double.parseDouble(parts[1]);
            rightValue = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e){
            throw new InvalidStatementException( "Non-numeric " +
                    "data", statement,e);
        }

        setCommandfromString(commandString);
        if(command == null)
            throw new InvalidStatementException("Invalid Command",
                    statement);


        CalculateBase calculator = null;
        switch (command){
            case Add:
                calculator = new Adder(leftValue,rightValue);
                break;
            case Subtract:
                calculator = new Subtractor(leftValue,rightValue);
                break;
            case Divide:
                calculator = new Divider(leftValue,rightValue);
                break;
            case Multiplay:
                calculator = new Muiltiplier(leftValue,rightValue);
                break;
            default:
                break;
        }
        calculator.calculate();
        result  = calculator.getResult();
    }

    private void setCommandfromString(String commandString){
        // add -> Mathcommand.Add

        if(commandString.equalsIgnoreCase(MathCommand.Add.toString())){
                command = MathCommand.Add;
        }
        else if(commandString.equalsIgnoreCase(MathCommand.Subtract
                .toString())){
            command = MathCommand.Subtract;
        }else if(commandString.equalsIgnoreCase(MathCommand.Divide
                .toString())){
            command = MathCommand.Divide;
        }else if(commandString.equalsIgnoreCase
                (MathCommand.Multiplay.toString())){
            command = MathCommand.Multiplay;
        }
    }

    @Override
    public String toString() {
        char symbol = ' ';
        switch (command) {
            case Add:
                symbol = ADD;
                break;
            case Subtract:
                symbol = SUBTRACT;
                break;
            case Multiplay:
                symbol = MULTIPLY;
                break;
            case Divide:
                symbol = DIVIDE;
                break;
            default:
                break;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(leftValue);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(rightValue);
        sb.append('=');
        sb.append(result);

        return sb.toString();
    }
}
