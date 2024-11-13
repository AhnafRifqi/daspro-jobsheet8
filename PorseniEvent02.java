import java.util.Scanner;

public class PorseniEvent02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};
        int numberOfSports = sports.length;
        int numberOfAthletes = 5;
        
        System.out.print("Enter the number of Polytechnics that have registered: ");
        int numberOfPolytechnics = scanner.nextInt();
        scanner.nextLine(); 
        
        String[][][] polytechnics = new String[numberOfPolytechnics][numberOfSports][numberOfAthletes];
        
        for (int i = 0; i < numberOfPolytechnics; i++) {
            System.out.print("Enter the name of Polytechnic " + (i + 1) + ": ");
            String polytechnicName = scanner.nextLine();
            
            for (int j = 0; j < numberOfSports; j++) {
                System.out.println("Enter the names of 5 athletes for " + sports[j] + " from " + polytechnicName + ":");
                for (int k = 0; k < numberOfAthletes; k++) {
                    System.out.print("Athlete " + (k + 1) + ": ");
                    polytechnics[i][j][k] = scanner.nextLine();
                }
            }
        }

        System.out.println("\n--- Registered Athletes ---");
        for (int i = 0; i < numberOfPolytechnics; i++) {
            System.out.println("\nPolytechnic " + (i + 1) + ":");
            for (int j = 0; j < numberOfSports; j++) {
                System.out.println(sports[j] + " Team:");
                for (int k = 0; k < numberOfAthletes; k++) {
                    System.out.println("  - " + polytechnics[i][j][k]);
                }
            }
        }
        
    }
}
