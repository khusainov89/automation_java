package Java3.Flowers;

public class Main {
    public static void main(String[] args) {
        Rose rose = new Rose("red", 100);
        Chamomile chamomile = new Chamomile("white", 80);
        Tulip tulip = new Tulip("pink", 60);

        System.out.println(rose);

        rose.Smell_like();
        chamomile.Smell_like();
        tulip.Smell_like();
    }

}
