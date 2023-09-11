package ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<InterView> lists = new ArrayList<>();
        lists.add(new InterView(1,"java",50));
        lists.add(new InterView(2,"python",20));
        lists.add(new InterView(3,"React",10));
        lists.add(new InterView(4,"React",100));

        Collections.sort(lists);
        for (InterView interview:lists) {
            System.out.println(interview);
        }

    }
}
