package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;
import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.logic.Divide;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {

    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        String result = "";
        if(operation == ADDITION) {
            //instantiate Add object
            Add a = new Add(argumentOne, argumentTwo);
            result = a.calculate();
        }
        else if (operation == SUBTRACTION) {
            //instantiate Subtract object
            Subtract s = new Subtract(argumentOne, argumentTwo);
            result = s.calculate();
        }
        else if (operation == MULTIPLICATION) {
            //instantiate Multiply object
            Multiply m = new Multiply(argumentOne, argumentTwo);
            result = m.calculate();
        }
        else { //OPERATION is by default division
            //instantiate Divide Object
            Divide d = new Divide(argumentOne, argumentTwo);
            result = d.calculate();
        }
        mOut.print(result);
    }
}
