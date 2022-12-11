package Car;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.driverCar();

        Car car1 = new Car(2010, 250000, new Vehicle("pickup"), new Steering("plastic"), new Wheel(4));

        Car car2 = new Car(2010, 250000, new Vehicle("pickup"), new Steering("plastic"), new Wheel(4), new Passenger("Ruslan", 33));



        System.out.println(car1);
        System.out.println(car2);

    }
}
