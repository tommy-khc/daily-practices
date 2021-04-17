package enums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class IQEnumTest {

    @Test
    public void setValuesTest() {
        int oriHighIQValue = IQ.HIGH.getValues();
        IQ.HIGH.setValues(160);
        assertEquals("Ori is not equal", oriHighIQValue, 130);
        assertEquals("setValues function", IQ.HIGH.getValues(), 160);
    }

    @Test
    public void getIQEnumTest() {
        IQ iq1 = IQ.getIQEnum(130);
        assertEquals(iq1, IQ.HIGH);

        IQ iq2 = IQ.getIQEnum(140);
        assertNotEquals(iq2, IQ.HIGH);
    }
}
