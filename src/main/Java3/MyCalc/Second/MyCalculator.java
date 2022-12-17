package Java3.MyCalc.Second;

import Java3.MyCalc.First.Numerable;

public class MyCalculator implements Numerable {

    public double a;
    public double b;

    public MyCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double add() {
        return a + b;
    }

    @Override
    public double sub() {
        return a - b;
    }

    @Override
    public double mult() {
        return a * b;
    }

    @Override
    public double div() {
        return a / b;
    }
}
