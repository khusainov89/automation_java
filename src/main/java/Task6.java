import java.util.Scanner;

public class Task6 {

    public static double a;
    public static double b;
    public static double c;
    public static double x1;
    public static double x2;
    public static double d;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а: ");
        a = scanner.nextDouble();
        System.out.println("Введите число b: ");
        b = scanner.nextDouble();
        System.out.println("Введите число c: ");
        c = scanner.nextDouble();
        d = b * b - 4.0 * a * c;
        if (d > 0.0) {
            x1 = (-b + Math.sqrt(d)) / (2.0 * a);
            x2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (d == 0.0) {
            x1 = -b / (2.0 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x1);
        } else {
            System.out.println("Нет решения");
        }

    }
}
