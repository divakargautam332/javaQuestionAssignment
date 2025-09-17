import java.util.*;

public class FibonacciNum {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = sc.nextInt();
        System.out.println(fib(n));
    }
}