import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {
        double rand = Math.random();
        if (rand < 0.33) return "rock";
        else if (rand < 0.66) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] result = new String[2][3];
        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (computerWins * 100.0) / totalGames;

        result[0][0] = "User";
        result[0][1] = String.valueOf(userWins);
        result[0][2] = String.format("%.2f%%", userPercent);

        result[1][0] = "Computer";
        result[1][1] = String.valueOf(computerWins);
        result[1][2] = String.format("%.2f%%", compPercent);

        return result;
    }

    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i+1) + "\t" + gameResults[i][0] + "\t\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nOverall Stats:");
        System.out.println("Player\tWins\tWin %");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of games:");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] gameResults = new String[n][3];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter your choice (rock/paper/scissors) for game " + (i+1) + ":");
            String userChoice = sc.nextLine().toLowerCase();
            String compChoice = computerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = compChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, n);
        displayResults(gameResults, stats);
    }
}
