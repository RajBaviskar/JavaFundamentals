/**
 * Created by RB034746 on 05/05/2017.
 */
public class InvalidStatementException extends Exception{
    public  InvalidStatementException(String reason,String statement){
        super(reason + ": " + statement);
    }

    public InvalidStatementException(String reason, String statement,
                                     Throwable cause){
        super(reason + ": " + statement,cause);
    }
}
