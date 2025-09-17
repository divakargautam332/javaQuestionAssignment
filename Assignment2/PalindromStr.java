import java.util.*;

public class PalindromStr {
    public static boolean palinStr(StringBuilder str, StringBuilder revStr, int i) {
        if (i == str.length()) {
            return true;
        }
        if (str.charAt(i) != revStr.charAt(str.length() - 1 - i)) {
            return false;
        }
        return palinStr(str, revStr, i + 1);
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("madam");
        StringBuilder revStr = new StringBuilder(str);
        revStr.reverse();
        System.out.println(str);
        System.out.println(revStr);
        int i = 0;
        System.out.println(palinStr(str, revStr, i));
    }
}