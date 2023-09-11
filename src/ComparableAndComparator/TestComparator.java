package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {
    //compare with multiple sorting order
    public static void main(String[] args) {
        ArrayList<Laptop2> laptops = new ArrayList<>();
        laptops.add(new Laptop2("Mac",32,10000));
        laptops.add(new Laptop2("Dell",8,2000));
        laptops.add(new Laptop2("Sony",16,6000));
        laptops.add(new Laptop2("Hp",64,15000));
        Comparator<Laptop2> comparator = new Comparator<Laptop2>() {
            @Override
            public int compare(Laptop2 o1, Laptop2 o2) {
                return o2.getPrice()-o1.getPrice();
            }
        };
        Comparator<Laptop2> comparator1 = new CompareNew();
        System.out.println("Comparator Price");
        Collections.sort(laptops,comparator);
        laptops.forEach((lap)-> System.out.println(lap));


        ArrayList<Laptop2> laps2=new ArrayList<>(laptops);
        Collections.sort(laps2,comparator1);
        System.out.println("Comparator Name");
        laps2.forEach((lap)-> System.out.println(lap));

    }
}
