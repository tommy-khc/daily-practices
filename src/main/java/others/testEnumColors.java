package others;

import enums.colors;

public class testEnumColors {
    public static void main(String[] args) {
        colors.color colorOne = colors.color.RED;
        colors.color colorTwo = colors.color.getColor(1);
        System.out.println(colorTwo);
        String receive = String.valueOf(colors.color.RED.getValues());
        System.out.print(receive);
    }
}
