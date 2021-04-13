package enums;

public class colors {
    public static enum color {
        RED(1);

        int values;

        private color(int i) {
            this.values = i;
        }

        public int getValues() {
            return values;
        }

        public void setValues(int x) {
            values = x;
        }

        public static color getColor(int x) {
            if (x == 1) {
                return color.RED; /*it will leaves the function after execution the return*/
            }
            return null;
        }

    }
}