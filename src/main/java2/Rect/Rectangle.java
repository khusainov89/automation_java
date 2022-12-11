package Rect;

public class Rectangle {

    private int length;
    private int width;
    private static int S;
    private static int P;

    public Rectangle () {

        length = 30;
        width = 40;

    }

    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void Square () {

         S = this.length * this.width;

        System.out.println("Площадь прямоугольника равна: " + S);
    }

    public void Per () {

         P = (this.length + this.width) * 2;

        System.out.println("Периметр прямоугольника равен: " + P);
    }
}


