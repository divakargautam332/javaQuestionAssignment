import java.util.*;

public class PowerOfNumber {
    public static int calPower(int base, int pow) {
        if (base == 0) {
            return 0;
        }
        if (pow == 0) {
            return 1;
        }
        return base * calPower(base, pow - 1);
    }

    public static void main(String[] args) {
        int base;
        int pow;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base :");
        base = sc.nextInt();
        System.out.print("Enter the power :");
        pow = sc.nextInt();
        System.out.println(calPower(base, pow));
    }
}