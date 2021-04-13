package edx_java_ex_simple_data_UBCx_HtC1x._1b;

import org.junit.Assert;
import org.junit.Test;

import static edx_java_ex_simple_data_UBCx_HtC1x._1b.Pluralizes.pluralizesWord;

public class PluralizesTest {
    @Test
    public void TestOne () {
        String input = "word";
        String output = pluralizesWord(input);
        Assert.assertEquals("words", output);
    }

    @Test
    public void TestTwo() {
        String input = "egg";
        String output = pluralizesWord(input);
        Assert.assertEquals("eggs", output);
    }
}
