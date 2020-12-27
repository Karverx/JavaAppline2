package calculator;

public class Division implements Operation {
    @Override
    public double calculation(double a, double b) {
        double result = 0;
        try{
            if(b == 0) throw new ArithmeticException();
         result = a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("На 0 делить нельзя");
        }
        return result;
    }



}
