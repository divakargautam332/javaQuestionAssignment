import java.util.*;

public class DesendingOrder {
    public static void desOrder(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(n + " ");
        desOrder(n - 1);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = sc.nextInt();
        desOrder(n);
    }
}