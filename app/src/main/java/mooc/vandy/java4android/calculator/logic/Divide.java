package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements OperationInterface{
    private int argumentOne;
    private int argumentTwo;

    public Divide (int arg1, int arg2) {
        //instantiate private variables
        argumentOne = arg1;
        argumentTwo = arg2;
    }
    public String calculate() {
        //special case if Value Two is 0
        if(argumentTwo == 0)
            return "Error: Value Two Cannot Be 0";
        //calculate and return string
        int result = argumentOne / argumentTwo;
        String remainder = " R:" + argumentOne % argumentTwo;
        return String.valueOf(result) + remainder;
    }
}

