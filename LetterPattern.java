import java.util.Scanner;

public class LetterPattern {
    public static void main(String[] args) {
        char letter = 'a';
        int n = 5; 
        
        for (int i = 1; i <= n; i++) {
            for (int spaces = n - i; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(letter);
                letter++;
            }
            System.out.println();
        }
    }
}
