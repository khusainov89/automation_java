import java.util.Scanner;

public class Task5 {

    public static String day;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���� ������:");
        day = scanner.nextLine();
        switch (day) {
            case "�����������" -> System.out.println("���������� 1");
            case "�������" -> System.out.println("���������� 2");
            case "�����" -> System.out.println("���������� 3");
            case "�������" -> System.out.println("���������� 4");
            case "�������" -> System.out.println("���������� 5");
            case "�������" -> System.out.println("���������� 6");
            case "�����������" -> System.out.println("���������� 7");
        }

    }
}
