package Car;

public class Car {

    private int year;
    private int mileage;

    private Vehicle vehicle;
    private Steering steering;
    private Wheel wheel;

    private Passenger passenger;

    public Car(){

    }

    public Car (int year, int mileage, Vehicle vehicle, Steering steering, Wheel wheel){
        this.year = year;
        this.mileage = mileage;
        this.vehicle = vehicle;
        this.steering = steering;
        this.wheel = wheel;
    }

    public Car (int year, int mileage, Vehicle vehicle, Steering steering, Wheel wheel, Passenger passenger){
        this.year = year;
        this.mileage = mileage;
        this.vehicle = vehicle;
        this.steering = steering;
        this.wheel = wheel;
        this.passenger = passenger;
    }

    public void driverCar() {
        System.out.println("Машина едет");
    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Steering getSteering() {
        return steering;
    }

    public void setSteering(Steering steering) {
        this.steering = steering;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", mileage=" + mileage +
                ", vehicle=" + vehicle +
                ", steering=" + steering +
                ", wheel=" + wheel +
                ", passenger=" + passenger +
                '}';
    }
}
