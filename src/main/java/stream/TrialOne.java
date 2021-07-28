package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class TrialOne {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8);
        integerList.stream().mapToInt(o->o).max().orElseThrow(NoSuchElementException::new);
    }
}
