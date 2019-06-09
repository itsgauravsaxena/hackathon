package math;


public class Algebra {

    public int addNumbers(int a, int b){
        return a+b;
    }

    //TODO refactor
    public int divideNumbers(int a, int b) throws ArithmeticException,NegativeNotAllowedException{

        if (b==0){
            throw new ArithmeticException();
        }

        if(a<0 || b<0){
            throw new NegativeNotAllowedException("Negative numbers not allowed");
        }
        return a/b;
    }
}
