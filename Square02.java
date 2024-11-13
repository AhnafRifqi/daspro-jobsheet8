import java.util.Scanner;


public class Square02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value N = ");
        int N = sc.nextInt();
        
        // Outer loop to repeat the inner loop N times
        for(int iOuter = 1; iOuter <= N; iOuter++) {
            // Inner loop to print N asterisks in a line
            for(int i = 1; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
