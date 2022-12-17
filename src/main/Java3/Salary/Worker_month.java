package Java3.Salary;

public class Worker_month implements Salary {
    private static final int sal_month = 1000;

    public Worker_month(int sal_month){

    }

    @Override
    public int Calc_salary_year() {
        return sal_month * 12;
    }
}
