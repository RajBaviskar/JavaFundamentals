/**
 * Created by RB034746 on 05/03/2017.
 */
public class Divider extends CalculateBase{
    public Divider(){

    }
    public Divider(double leftValue, double rightValue){
        super(leftValue,rightValue);
    }

    @Override
    public void calculate() {
        double value = getLeftValue() / getRightvalue();
        setResult(value);
    }
}
