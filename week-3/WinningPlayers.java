import java.util.*;

public class WinningPlayers {
    public static void main(String[] args) {
      
        int n = 5;  // number of players
        int[][] pick = {
            {0, 1}, {0, 2}, {1, 1}, {1, 1}, {1, 1}, 
            {2, 2}, {3, 2}, {3, 2}, {4, 3}, {4, 3}, {4, 3}
        };

        int winningPlayersCount = countWinningPlayers(n, pick);
        System.out.println("Number of winning players: " + winningPlayersCount);
    }

    public static int countWinningPlayers(int n, int[][] pick) {
        // Create a list of maps to track ball color counts for each player
        List<Map<Integer, Integer>> playerColorCount = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            playerColorCount.add(new HashMap<>());
        }

        // Fill the color count for each player based on the 'pick' array
        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];

            Map<Integer, Integer> colorCount = playerColorCount.get(player);
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }

        // Count how many players win
        int winners = 0;

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> colorCount = playerColorCount.get(i);
            boolean wins = false;

            // Check if any color count is greater than or equal to i + 1
            for (int count : colorCount.values()) {
                if (count > i) {  // A player wins if they pick more than i balls of the same color
                    wins = true;
                    break;
                }
            }

            if (wins) {
                winners++;
            }
        }

        return winners;
    }
}
