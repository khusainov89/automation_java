package Java3.Flowers;

import Java3.Flowers.Flower;

public class Tulip extends Flower {

    public Tulip(String color, double price) {
        super(color, price);
    }

    @Override
    public void Smell_like() {
        System.out.println("Smells like tulip");
    }

}
