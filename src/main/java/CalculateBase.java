/**
 * Created by RB034746 on 05/03/2017.
 * Created to divide responsibility of different operations and
 * provide common base
 */
public abstract class CalculateBase {
    private double leftValue;
    private double rightvalue;
    private double result;

    public CalculateBase(){
    }

    public CalculateBase(double leftValue, double rightvalue){
        this.leftValue = leftValue;
        this.rightvalue = rightvalue;
    }

    public abstract void calculate();

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
}
