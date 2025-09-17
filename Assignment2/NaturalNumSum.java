import java.util.*;

public class NaturalNumSum {
    public static int numSum(int n, int sum) {
        if (n <= 0) {
            return sum;
        }
        sum = sum + n;
        return numSum(n - 1, sum);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = sc.nextInt();
        int sum = 0;
        System.out.println(numSum(n, sum));
    }
}