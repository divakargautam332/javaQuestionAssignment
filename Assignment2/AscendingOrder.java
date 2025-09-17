import java.util.*;

public class AscendingOrder {
    public static void ascOrder(int start, int n) {
        if (start == n + 1) {
            return;
        }
        System.out.print(start + " ");
        ascOrder(start + 1, n);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = sc.nextInt();
        ascOrder(0, n);
    }
}