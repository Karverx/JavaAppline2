package calculator;

public class Division implements Operation {
    @Override
    public double calculation(double a, double b) {
        double result = 0;
        try{
            if(b == 0) throw new ArithmeticException();
         result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("На 0 делить нельзя");
        }
        return result;
    }



}
