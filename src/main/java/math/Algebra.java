package math;


public class Algebra {

    public int addNumbers(int a, int b){
        return a+b;
    }

    public int divideNumbers(int a, int b) throws DivisorZeroNotAllowedException,NegativeNotAllowedException{

        if (b==0){
            throw new DivisorZeroNotAllowedException("Divisor cannot be zero");
        }

        if(a<0 || b<0){
            throw new NegativeNotAllowedException("Negative numbers not allowed");
        }
        return a/b;
    }
}
