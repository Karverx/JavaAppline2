package sweets;

public class Chocolate extends Sweets{

    //Содержание какао в процентах
    private int cocoaContent;

    public Chocolate(String name, double weight, double price, int cocoaContent) {
        super(name, weight, price);
        this.cocoaContent = cocoaContent;
    }

    public Chocolate() {
        super();
    }

    public int getCocoaContent() {
        return cocoaContent;
    }

    public void setCocoaContent(int cocoaContent) {
        this.cocoaContent = cocoaContent;
    }

    @Override
    public String toString() {
        return "Chocolate{" + super.toString() +
                ", cocoaContent=" + cocoaContent +
                '}';
    }
}
