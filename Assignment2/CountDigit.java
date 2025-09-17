import java.util.*;

public class CountDigit {
    public static int countDigit(int num, int count) {
        if (num <= 0) {
            return count;
        }
        count++;
        num = num / 10;
        return countDigit(num, count);
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        num = sc.nextInt();
        int count = 0;
        System.out.println(countDigit(num, count));
    }
}
