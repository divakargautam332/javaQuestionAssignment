// Filename: Classroom.java

public class Classroom {
    public static void main(String[] args) {
        int n = 5; // rows define कर दी

        System.out.println("--- Pattern 1: Square ---");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 2: Right Triangle ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 3: Inverted Right Triangle ---");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 4: Left Triangle ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 5: Pyramid ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

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

        System.out.println("\n--- Pattern 7: Diamond ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 8: Number Triangle ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 9: Inverted Number Triangle ---");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 10: Repeated Numbers ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 11: Floyd's Triangle ---");
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 12: Binary Triangle ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 13: Alphabet Triangle ---");
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 14: Repeated Alphabets ---");
        for(int i=1;i<=n;i++){
            char c='A';
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 15: Hollow Square ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 16: Hollow Right Triangle ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i || i==n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 17: Hollow Pyramid ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1 || i==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 18: X Shape ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 19: Plus Shape ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n/2+1 || j==n/2+1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 20: Checkerboard ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)%2==0) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}