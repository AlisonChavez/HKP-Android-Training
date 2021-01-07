package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements OperationInterface {
    private int argumentOne;
    private int argumentTwo;

    public Add (int arg1, int arg2) {
        //instantiate private variables
        argumentOne = arg1;
        argumentTwo = arg2;
    }
    public String calculate() {
        //calculate and return string
        int result = argumentOne + argumentTwo;
        return "" + result;
    }
}
