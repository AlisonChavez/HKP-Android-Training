package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements OperationInterface{
    private int argumentOne;
    private int argumentTwo;

    public Multiply (int arg1, int arg2) {
        argumentOne = arg1;
        argumentTwo = arg2;
    }

    public String calculate() {
        int value = argumentOne*argumentTwo;
        String result = "" + value;
        return result;
    }
}
