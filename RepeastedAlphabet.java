import java.util.*;
public class RepeastedAlphabet {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("\n--- Pattern 14: Repeated Alphabets ---");
        for(int i=1;i<=n;i++){
            char c='A';
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
