package calculator;

import java.io.IOException;
import java.util.InputMismatchException;

public class Calculator {

    public double calc(double a, double b, char operation){
        double result = 0;
        try{
            switch(operation){
                case '+': result = new Addition().calculation(a,b); break;
                case '-': result = new Subtraction().calculation(a,b); break;
                case '*': result = new Multiplication().calculation(a,b); break;
                case '/': result = new Division().calculation(a,b); break;

                default: throw new InputMismatchException();
            }
        }catch (InputMismatchException e) {
            throw new InputMismatchException("Неправильно введен символ операции - " + operation);
        }
        return result;
    }

}
