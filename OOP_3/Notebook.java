package OOP_3;

public class Notebook {
    private int price;
    private int ram;
    private String brand;

    public Notebook(int price, int ram, String brand) {
        this.price = price;
        this.ram = ram;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public String getBrand() {
        return brand;
    }
}