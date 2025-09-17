import java.util.*;

public class StringRev {
    public static void revStr(String str, StringBuilder sb, int i) {
        if (i == str.length()) {
            return;
        }
        char ch = str.charAt(i);
        revStr(str, sb, i + 1);
        sb.append(ch);
    }

    public static void main(String[] args) {
        String str = "String";
        StringBuilder sb = new StringBuilder();
        revStr(str, sb, 0);
        System.out.println(sb.toString());
    }
}