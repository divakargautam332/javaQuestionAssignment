import java.util.*;

public class PalindromNum {
    public static void palinNum(int num, int dup, int copy) {
        if (num <= 0) {
            if (dup == copy) {
                System.out.println("palindrom");
            } else {
                System.out.println("not palindrom");
            }
            return;
        }
        int r = num % 10;
        dup = (dup * 10) + r;
        num = num / 10;
        palinNum(num, dup, copy);
    }

    public static void main(String[] args) {
        int num = 121;
        int dup = 0;
        int copy = num;
        palinNum(num, dup, copy);
    }
}
