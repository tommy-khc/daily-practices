package trial;

public class TrialTwo {
    public static void main(String[] args) {
//        String first = "leets";
//        String second = "lee";
//        int result = second.indexOf(first);
//        System.out.println(result);
//        System.out.println(first.length());
//        System.out.println(first.substring(0, first.length()-1));
        String[] list = {"leets", "leetcode"};
        System.out.println(longestCommonPrefix(list));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            System.out.println(strs[i].indexOf(prefix));
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
