package Java3.Flowers;

public abstract class Flower {

    private String color;

    private Double price;

    public Flower (String color, double price){
        this.color = color;
        this.price = price;
    }

    public abstract void Smell_like();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
