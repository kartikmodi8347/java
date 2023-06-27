import java.util.Random;
import java.util.Scanner;

public class StonePaperScissorsGame {
    public static void main(String[] args) {
        String[] choices = {"stone", "paper", "scissors"};
        
        // Generate a random choice for the system
        Random random = new Random();
        int systemChoiceIndex = random.nextInt(3);
        String systemChoice = choices[systemChoiceIndex];
        
        // Get the player's choice
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (stone, paper, scissors): ");
        String playerChoice = scanner.nextLine().toLowerCase();
        
        // Print the choices made by the player and the system
        System.out.println("Player's choice: " + playerChoice);
        System.out.println("System's choice: " + systemChoice);
        
        // Determine the winner
        if (playerChoice.equals(systemChoice)) {
            System.out.println("It's a tie!");
        } else if (playerChoice.equals("stone")) {
            if (systemChoice.equals("paper")) {
                System.out.println("System wins!");
            } else {
                System.out.println("Player wins!");
            }
        } else if (playerChoice.equals("paper")) {
            if (systemChoice.equals("scissors")) {
                System.out.println("System wins!");
            } else {
                System.out.println("Player wins!");
            }
        } else if (playerChoice.equals("scissors")) {
            if (systemChoice.equals("stone")) {
                System.out.println("System wins!");
            } else {
                System.out.println("Player wins!");
            }
        } else {
            System.out.println("Invalid choice. Please choose either stone, paper, or scissors.");
        }
        
        scanner.close();
    }

    @Override
    public String toString() {
        return "StonePaperScissorsGame []";
    }
}
