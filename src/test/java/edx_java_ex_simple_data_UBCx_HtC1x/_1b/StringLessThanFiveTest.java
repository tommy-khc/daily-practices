package edx_java_ex_simple_data_UBCx_HtC1x._1b;

import org.junit.Assert;
import org.junit.Test;

import static edx_java_ex_simple_data_UBCx_HtC1x._1b.StringLessThanFive.checkLengthLessFive;

public class StringLessThanFiveTest {
    @Test
    public void testOne() {
        String input = "djkn";
        Boolean output = checkLengthLessFive(input);
        Assert.assertEquals(true, output);
    }

    @Test
    public void testTwo() {
        String input = "hjkdhfkjdhkjfhdjkhf";
        Boolean output = checkLengthLessFive(input);
        Assert.assertEquals(false, output);
    }
}
