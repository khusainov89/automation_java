package Car;

public class Steering {
    private String material;

    public Steering (String material){
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Steering{" +
                "material='" + material + '\'' +
                '}';
    }
}
