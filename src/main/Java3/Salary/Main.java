package Java3.Salary;

public class Main {
    public static void main(String[] args) {
        Worker_hour worker_hour = new Worker_hour(10);
        Worker_month worker_month = new Worker_month(2000);

        System.out.println("The annual salary of an hourly wage worker is: " + worker_hour.Calc_salary_year());
        System.out.println("The annual salary of a worker with monthly pay is: " + worker_month.Calc_salary_year());

    }
}
