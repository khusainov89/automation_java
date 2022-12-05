import java.util.Scanner;

public class Task1 {
    public static int sum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();

        for(int i = 1; i <= num; ++i) {
            sum += i;
        }

        System.out.println("Сумма чисел равна: " + sum);
    }
}
