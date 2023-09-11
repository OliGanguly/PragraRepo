package ComparableAndComparator;

public class Laptop implements Comparable<Laptop>{
    private String brand;
    private int ramCapacity;
    private int price;
    @Override
    public int compareTo(Laptop o1) {
        if(this.getPrice()<o1.getPrice())
            return 1;
        else if (this.getPrice()>o1.getPrice())
            return -1;
        return 0;
    }
    public Laptop() {
    }

    public Laptop(String brand, int ramCapacity, int price) {
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
