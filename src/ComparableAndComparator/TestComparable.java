package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Hp",32,10000));
        laptops.add(new Laptop("Hp",8,2000));
        laptops.add(new Laptop("Hp",16,6000));
        laptops.add(new Laptop("Hp",64,15000));
        Collections.sort(laptops);
        laptops.forEach((lap)-> System.out.println(lap));

    }
}
