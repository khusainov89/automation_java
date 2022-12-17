package Java3.Flowers;

public class Chamomile extends Flower {

    public Chamomile(String color, double price) {
        super(color, price);
    }

    @Override
        public void Smell_like() {
            System.out.println("Smells like chamomile");
        }

}
