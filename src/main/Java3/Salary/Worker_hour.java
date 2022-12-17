package Java3.Salary;

public class Worker_hour implements Salary {
    private static final int sal_hour = 10;

    public Worker_hour(int sal_month) {

    }

    @Override
    public int Calc_salary_year() {
        return sal_hour * 2000;
    }
}
