import java.util.*;

public class SumOfDigit {
    public static int countSum(int num, int sum) {
        if (num <= 0) {
            return sum;
        }
        int r = num % 10;
        sum = sum + r;
        num = num / 10;
        return countSum(num, sum);
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        num = sc.nextInt();
        int sum = 0;
        System.out.print(countSum(num, sum));
    }
}