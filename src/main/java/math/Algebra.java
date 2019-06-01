package math;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Algebra {

    private final static Logger logger = Logger.getLogger(Algebra.class.getSimpleName());

    public int addNumbers(int a, int b){
        return a+b;
    }

    public int divideNumbers(int a, int b){
        int c=0;
        try {
        c = a/b;
        } catch(ArithmeticException e){
            logger.log(Level.INFO,e.getMessage());
        }
        return c;
    }
}
