package calculator;

public class Calculator {
    private double a;
    private double b;
    private char operation;

    public Calculator(double a, double b, char operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double calc(){
        double result = 0;
        switch(operation){
            case '+': result = new Addition().calculation(a,b); break;
            case '-': result = new Subtraction().calculation(a,b); break;
            case '*': result = new Multiplication().calculation(a,b); break;
            case '/': result = new Division().calculation(a,b); break;
            default: System.out.println("Введен некорректный номер операции"); break;
        }
        return result;
    }

}
