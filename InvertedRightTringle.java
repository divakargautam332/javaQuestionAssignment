import java.util.*;
public class InvertedRightTringle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("\n--- Pattern 3: Inverted Right Triangle ---");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
