/**
 * Created by RB034746 on 05/03/2017.
 */
public class Muiltiplier extends CalculateBase{
    public Muiltiplier(){

    }
    public Muiltiplier(double leftValue, double rightValue){
        super(leftValue,rightValue);
    }

    @Override
    public void calculate() {
        double value = getLeftValue() * getRightvalue();
        setResult(value);
    }
}
