package edx_java_ex_simple_data_UBCx_HtC1x._1b;

import org.junit.Assert;
import org.junit.Test;

import static edx_java_ex_simple_data_UBCx_HtC1x._1b.Double_starter.double_function;

public class Double_starterTest {
    @Test
    public void testOneNormal(){
        int input = 10;
        int output = double_function(input);
        Assert.assertEquals(20, output);
    }

    @Test
    public void testTwoNormal() {
        int input = 23;
        int output = double_function(input);
        Assert.assertEquals(46, output);
    }

    @Test
    public void testThreeNormal() {
        int input = 16;
        int output = double_function(input);
        Assert.assertEquals(32, output);
    }

    @Test
    public void testFourNormal() {
        int input = 6;
        int output = double_function(input);
        Assert.assertEquals(12, output);
    }
}