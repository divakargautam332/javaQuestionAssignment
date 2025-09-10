import java.util.*;
public class RepeatedNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("\n--- Pattern 10: Repeated Numbers ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
