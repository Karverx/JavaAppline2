package sweets;

public class Jellybean extends Sweets {

    private String color;

    public Jellybean(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public Jellybean() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Jellybean{" + super.toString() +
                ", color='" + color + '\'' +
                '}';
    }
}
