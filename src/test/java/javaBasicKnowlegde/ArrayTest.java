package javaBasicKnowlegde;

import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {

    @Test
    public void arrayEmpty () {
        int[] arrayZeroL = new int [0];
        int[] arrayNull = null;
        System.out.println("arrayZeroL: " + Arrays.toString(arrayZeroL));
        System.out.println("arrayNull: " + Arrays.toString(arrayNull));
    }

    @Test
    public void search () {
        int[] i = new int [6];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        i[3] = 4;
        i[4] = 5;
        i[5] = 6;
        int[] j = {0,2,4,6,8,10};
        System.out.println(i[4]);
        Arrays.sort(i);
        System.out.println(Arrays.binarySearch(i,1));
        System.out.println(Arrays.binarySearch(j,2));
    }

    @Test
    public void deepHashCode () {
        Object[] i = new Object [5];
        for (int n = 0;n<i.length;n++) {
            i[n] = n;
        }
        int h = Arrays.deepHashCode(i);
        System.out.println(h);
    }

    @Test
    public void t1 () {
        String[] str1 = new String[6];
        str1[0] = "String";
        str1[1] = "Yes";
        str1[2] = "No";
        str1[3] = "A";
        str1[4] = "B";
        str1[5] = "C";
        Arrays.sort(str1);
        System.out.println(Arrays.toString(str1));
        String[] str2 = {"t", "x", "y", "u", "P"};
        System.out.println(Arrays.toString(str2));
        int i = Arrays.binarySearch(str1, "Yes");
        int indexOfB = Arrays.binarySearch(str1, "B");
        int indexOfP = Arrays.binarySearch(str2, "u");
        System.out.println(indexOfB);
        System.out.println(indexOfP);
    }
}
