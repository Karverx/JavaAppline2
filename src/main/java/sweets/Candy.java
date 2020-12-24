package sweets;

public class Candy extends Sweets {

    private String shape;

    public Candy(String name, double weight, double price, String shape) {
        super(name, weight, price);
        this.shape = shape;
    }

    public Candy() {

    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Candy{" + super.toString() +
                ", shape='" + shape + '\'' +
                '}';
    }
}
