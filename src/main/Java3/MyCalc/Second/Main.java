package Java3.MyCalc.Second;

public class Main {
    public static void main(String[] args) {

        MyCalculator myCalculator = new MyCalculator(10, 5);

        System.out.println(myCalculator.add());
        System.out.println(myCalculator.sub());
        System.out.println(myCalculator.mult());
        System.out.println(myCalculator.div());
    }
}
