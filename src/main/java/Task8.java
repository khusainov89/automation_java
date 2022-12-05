import java.util.Scanner;

public class Task8 {

    public static int num = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(num != 0) {
            System.out.println("¬ведите число");
            num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println("even");
            } else if (num % 2 == 1) {
                System.out.println("od");
            }
        }

    }
}
