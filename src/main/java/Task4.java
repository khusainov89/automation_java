import java.util.Scanner;

public class Task4 {

    public static int m;
    public static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� m:");
        m = scanner.nextInt();
        System.out.println("������� ����� n:");
        n = scanner.nextInt();
        if (m - 10 > n - 10) {
            System.out.println("����� m ����� � ����� 10");
        } else {
            System.out.println("����� n ����� � ����� 10");
        }

    }
}
