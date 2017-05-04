/**
 * Created by RB034746 on 05/03/2017.
 */
public class Main {
    public static void main(String args [ ]){

        //MathEquation testEquation = new MathEquation();

        MathEquation[] mathEquations = new MathEquation[4]; //
        // Created Array of type MathEquation with size 4
        mathEquations[0] = new MathEquation(10,20,'a');
        mathEquations[1] = new MathEquation(10,20,'s');
        mathEquations[2] = new MathEquation(10,20,'d');
        mathEquations[3] = new MathEquation(10,20,'m');

        for(MathEquation eachEquation : mathEquations ){
            eachEquation.execute();
            System.out.println("Result=" + eachEquation.getResult());

        }
    }
}
