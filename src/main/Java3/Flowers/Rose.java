package Java3.Flowers;

import Java3.Flowers.Flower;

public class Rose extends Flower {


    public Rose(String color, double price) {
        super(color, price);
    }

    @Override
    public void Smell_like() {
        System.out.println("Smells like rose");
    }

}
