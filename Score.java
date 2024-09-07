import java.util.Scanner;

public class Score {
    private int playerScore;
    private int opponentScore;
    private Scanner scanner;

    // Constructor initializes scores and scanner
    public Score() {
        playerScore = 0;
        opponentScore = 0;
        scanner = new Scanner(System.in);
    }

    // Method to conduct a PokÃ©mon battle
    public void conductBattle() {
        System.out.println("Battle Result!");

        // Prompt the user for the player's battle result and update scores
        int playerResult = promptForResult("Enter the result for the player (1 for win, 0 for lose): ");
        updateScores(playerResult, true);

        // Prompt the user for the opponent's battle result and update scores
        int opponentResult = promptForResult("Enter the result for the opponent (1 for win, 0 for lose): ");
        updateScores(opponentResult, false);

        // Display the final scores
        displayScores();
    }

    // Helper method to prompt for a battle result with input validation
    private int promptForResult(String message) {
        System.out.print(message);

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter 0 or 1.");
            scanner.next(); // Consume the invalid input
        }

        int result = scanner.nextInt();

        while (result < 0 || result > 1) {
            System.out.println("Invalid input. Please enter 0 or 1.");
            System.out.print(message);
            result = scanner.nextInt();
        }

        return result;
    }

    // Helper method to update scores based on battle results
    private void updateScores(int result, boolean isPlayer) {
        if (isPlayer) {
            if (result == 1) {
                playerScore++;
                System.out.println("Player wins the battle!");
            } else {
                opponentScore++;
                System.out.println("Player loses the battle!");
            }
        } else {
            if (result == 1) {
                opponentScore++;
                System.out.println("Opponent wins the battle!");
            } else {
                playerScore++;
                System.out.println("Opponent loses the battle!");
            }
        }
    }

    // Helper method to display final scores
    private void displayScores() {
        System.out.println("Player Score: " + playerScore);
        System.out.println("Opponent Score: " + opponentScore);
    
    }
}

