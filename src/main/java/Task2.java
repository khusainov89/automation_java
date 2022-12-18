import java.util.Scanner;

public class Task2 {
    public static int sum;
    public static int num;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i > 0; ++i) {
            System.out.println("Введите число");
            num = scanner.nextInt();
            sum += num;
            if (num == 0) {
                System.out.println("Количество вводов: " + (i - 1));
                System.out.println("Сумма чисел: " + sum);
                int var10001 = sum / (i - 1);
                System.out.println("Среднее: " + var10001);
                scanner.close();
                i = -1;
            }
        }

    }
}
