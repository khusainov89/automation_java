import java.util.Scanner;

public class Task7 {

    public static double s;
    public static double r;
    public static double l;
    public static double p = Math.PI;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите радиус:");
        r = scanner.nextDouble();
        s = p * r * r;
        System.out.println("ѕлощадь круга равна: " + s);
        l = 2.0 * p * r;
        System.out.println("ƒлина круга равна: " + l);
    }
}
