import java.util.*;
public class AlphabetTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("\n--- Pattern 13: Alphabet Triangle ---");
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
