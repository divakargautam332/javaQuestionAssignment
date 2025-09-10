import java.util.*;
public class InvertedNumberTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("\n--- Pattern 9: Inverted Number Triangle ---");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
