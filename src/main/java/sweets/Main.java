package sweets;

public class Main {
    public static void main(String[] args) {
        Candy candyCane = new Candy("Карамельная трость", 1, 2.5,"cane");
        Chocolate choc1 = new Chocolate("Ritter Sport", 2, 4,50);
        Chocolate choc2 = new Chocolate();
        Jellybean jelly = new Jellybean("Gummy bears", 3, 4, "Red");

        Sweets[] gift = {candyCane, choc1, choc2, jelly};
        calculate(gift);

    }

    static void calculate(Sweets[] sweets){
        double totalPrice = 0;
        double totalWeight = 0;
        System.out.println("Содержимое подарка:");
        for (Sweets s: sweets) {
            totalPrice+=s.getPrice();
            totalWeight+=s.getWeight();
            System.out.println(s.toString());
        }
        System.out.println("Общая стоимость подарка = " + totalPrice);
        System.out.println("Общий вес подарка = " + totalWeight);
    }

}
