import java.util.*;
public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("\n--- Pattern 6: Inverted Pyramid ---");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
