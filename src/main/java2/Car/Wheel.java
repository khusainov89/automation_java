package Car;

public class Wheel {
    private int num;

    public Wheel(int num){
        this.num = num;
    }

    private void increase(){
        num += 2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "number=" + num +
                '}';
    }
}
