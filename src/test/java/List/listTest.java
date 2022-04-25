package List;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import org.junit.Test;

import java.util.*;

public class listTest {

    @Test
    public void listIterable () {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        Iterator<Integer> i = l.iterator();
    }

    @Test
    public void arrayListConstructor () {
        ArrayList<Integer> maps = new ArrayList<Integer>();
        maps.ensureCapacity(10);
        System.out.println("ori size: " + maps.size());
        maps.trimToSize();
        System.out.println("size after trimToSize: " + maps.size());
    }


//    , "clubs", "hearts", "diamonds";];
    @Test
    public void iteratior () {
        List<String> suits = new ArrayList<>();
        suits.add("spades");
        suits.add("clubs");
        suits.add("hearts");
        suits.add("diamonds");
        List<String> ranks = new ArrayList<>();
        ranks.add("A");
        Integer[] i = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(i));
        List<Integer> l = Arrays.asList(i);
        System.out.println(l.toString());
        //TODO Stooped
//        for (int n ; l);
//        List sortedDeck = new ArrayList();
//
//// BROKEN - throws NoSuchElementException!
//        for (Iterator i = suits.iterator(); i.hasNext(); )
//            for (Iterator j = ranks.iterator(); j.hasNext(); )
//                sortedDeck.add(new Card(i.next(), j.next()));
    }
}
