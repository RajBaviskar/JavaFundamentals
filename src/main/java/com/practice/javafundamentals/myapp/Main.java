package com.practice.javafundamentals.myapp;

import com.practice.javafundamentals.calcengine.Adder;
import com.practice.javafundamentals.calcengine.CalculateBase;
import com.practice.javafundamentals.calcengine.CalculateHelper;
import com.practice.javafundamentals.calcengine.Divider;
import com.practice.javafundamentals.calcengine.DynamicHelper;
import com.practice.javafundamentals.calcengine.InvalidStatementException;
import com.practice.javafundamentals.calcengine.MathEquation;
import com.practice.javafundamentals.calcengine.MathProcessor;
import com.practice.javafundamentals.calcengine.Muiltiplier;
import com.practice.javafundamentals.calcengine.PowerOf;
import com.practice.javafundamentals.calcengine.Subtractor;

/**
 * Created by RB034746 on 05/03/2017.
 */
public class Main {
    public static void main(String args [ ]){

        //MathEquation testEquation = new MathEquation();
//
//        MathEquation[] mathEquations = new MathEquation[4]; //
//        // Created Array of type MathEquation with size 4
//        mathEquations[0] = new MathEquation(10,20,'a');
//        mathEquations[1] = new MathEquation(10,20,'s');
//        mathEquations[2] = new MathEquation(10,20,'d');
//        mathEquations[3] = new MathEquation(10,20,'m');
//
//        for(MathEquation eachEquation : mathEquations ){
//            eachEquation.execute();
//            System.out.println("Result=" + eachEquation.getResult());
//
//        }
//
//        // Using Inheritance
//        CalculateBase[] calculators = {
//                new Adder(1,2),
//                new Subtractor(1,2),
//                new Divider(1,2),
//                new Muiltiplier(1,2)
//        };
//
//        for(CalculateBase eachCalculat: calculators){
//            eachCalculat.calculate();
//            System.out.println(eachCalculat.getResult());
//        }
//
//        //
//
//        String[] statements = {
//                "add 1.0", //in correct format
//                "add  xx 24", // error non numeric left arg
//                "adder 2 4", // Invalid command
//                "divide 10 2",
//                "add 10 2",
//                "subtract 10 2",
//                "multiply 10 2",
//        };
//
//        CalculateHelper helper = new CalculateHelper();
//        for (String statement: statements){
//            try {
//                helper.process(statement);
//                System.out.println(helper.toString());
//            } catch (InvalidStatementException e) {
//                System.out.println(e.getMessage());
//                if(e.getCause() != null){
//                    System.out.println(" Original Exception " +
//                    e.getCause().getMessage());
//                }
//            }
//        }

        /// Interface

        String[] statements = {
                "add 10 2",
                "power 2 5"
        };

//        MathProcessor[] mathProcessors = {new Adder()};
//        DynamicHelper dynamicHelper = new DynamicHelper(mathProcessors);
// or
        DynamicHelper dynamicHelper = new DynamicHelper(new
                MathProcessor[] {
                new Adder(),
                new PowerOf()
        });

        for(String statement:statements){
            String output = dynamicHelper.process(statement);
            System.out.println(output);
        }
    }
}
