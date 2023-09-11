package ComparableAndComparator;

public class Laptop2 {
    private String brand;
    private int ramCapacity;
    private int price;

    public Laptop2() {
    }

    public Laptop2(String brand, int ramCapacity, int price) {
        this.brand = brand;
        this.ramCapacity = ramCapacity;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ramCapacity=" + ramCapacity +
                ", price=" + price +
                '}';
    }
}
