package others;

import java.util.ArrayList;
import java.util.List;

public class ForLoopProperties {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i = 5; i < list.size();i++) { /*will not enter the loop and won't return exception*/
            System.out.println("Hi");
        }
    }
}
