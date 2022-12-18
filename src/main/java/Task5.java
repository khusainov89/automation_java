import java.util.Scanner;

public class Task5 {

    public static String day;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели:");
        day = scanner.nextLine();
        switch (day) {
            case "понедельник" -> System.out.println("Расписание 1");
            case "вторник" -> System.out.println("Расписание 2");
            case "среда" -> System.out.println("Расписание 3");
            case "четверг" -> System.out.println("Расписание 4");
            case "пятница" -> System.out.println("Расписание 5");
            case "суббота" -> System.out.println("Расписание 6");
            case "воскресенье" -> System.out.println("Расписание 7");
        }

    }
}
