package edx_java_ex_simple_data_UBCx_HtC1x._1a;

public class P16FooEvaluation {
    public static void foo(String string) {
        if (string.substring(0,1).equals("a")) {
            string = string + "a";
        }
        System.out.println(string);
    }
    public static void main(String[] args) {
        foo("abcde".substring(0, 3)); //1
        foo("abc"); //2
        String str = "abc";
        if (str.substring(0,1).equals("a")) {
            str = str + "a";
        }
        System.out.println(str); //3
        str = "abc";
        if ("a".equals("a")) {
            str = str + "a";
        }
        System.out.println(str); //4
        str = "abc";
        if (true) {
            str = str + "a";
        }
        System.out.println(str); //5
        str = "abc";
        str = str + "a";
        System.out.println(str); //6
        str = "abca";
        System.out.println(str); //7
        System.out.println("abca"); //8
    }
}
