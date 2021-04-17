package enums;

public enum IQ {
    LOW(70),
    NORMAL(100),
    HIGH(130);

    int values;

    private IQ(int values) {
        this.values = values;
    }

    public int getValues() {
        return values;
    }

    public void setValues(int x) {
        values = x;
    }

    public static IQ getIQEnum (int x) {
        for (IQ iq:
             IQ.values()) {
            if (iq.getValues() == x) {
                return iq;
            }
        }
        System.out.println("The input IQ value is not included in enum.");
        return null;
    }

}
