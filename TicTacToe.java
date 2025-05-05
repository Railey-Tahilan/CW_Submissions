import java.util.Scanner;

public class TicTacToe
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("1|2|3\n4|5|6\n7|8|9\n");

        // Initialize the 3x3 grid with "*"
        String[][] grid = 
        {
            {"*", "*", "*"},
            {"*", "*", "*"},
            {"*", "*", "*"}
        };

        int turn = 1;                              
        String currentPlayer = "x";      
        boolean gameOver = false;          
       
        printBoard(grid);

        while (turn <= 9 && !gameOver)
        {
            promptPlayer(currentPlayer);

            // Read player's move
            String input = scanner.nextLine();

            // Validate input (must be a number 1–9)
            if (isValidInput(input))
            {
                // Get grid row and column from input
                int[] position = getPosition(input);
                int row = position[0];
                int col = position[1];

                // If the selected cell is empty
                if (grid[row][col].equals("*"))
                {
                    // Place current player's symbol
                    grid[row][col] = currentPlayer;

                    // Show the updated board
                    printBoard(grid);

                    // Check if this move wins the game
                    if (isWinningMove(grid, currentPlayer))
                    {
                        if (currentPlayer.equals("x"))
                        {
                            System.out.println("Player 1 (x) wins!");
                        }
                        else if (currentPlayer.equals("o"))
                        {
                            System.out.println("Player 2 (o) wins!");
                        }

                        gameOver = true; // End the loop
                    }
                    else
                    {
                        // Switch to the other player
                        if (currentPlayer.equals("x"))
                        {
                            currentPlayer = "o";
                        }
                        else if (currentPlayer.equals("o"))
                        {
                            currentPlayer = "x";
                        }

                        // Move to the next turn
                        turn++;
                    }
                }
                else
                {
                    // Cell is already filled
                    System.out.println("That spot is already taken. Try again.");
                }
            }
            else
            {
                // Input is not valid (not a number between 1 and 9)
                System.out.println("Invalid input. Choose a number from 1 to 9.");
            }
        }

        // If loop ends without a winner, it's a draw
        if (!gameOver)
        {
            System.out.println("It's a draw!");
        }

        System.out.println("Game over.");
    }

    // Displays the current game board
    public static void printBoard(String[][] grid)
    {
        System.out.println(grid[0][0] + " " + grid[0][1] + " " + grid[0][2]);
        System.out.println(grid[1][0] + " " + grid[1][1] + " " + grid[1][2]);
        System.out.println(grid[2][0] + " " + grid[2][1] + " " + grid[2][2]);
    }

    // Displays the prompt based on the current player
    public static void promptPlayer(String player)
    {
        if (player.equals("x"))
        {
            System.out.println("Player 1 (x), choose a box (1-9):");
        }
        else if (player.equals("o"))
        {
            System.out.println("Player 2 (o), choose a box (1-9):");
        }
    }

    // Checks if player inputs number 1-9
    public static boolean isValidInput(String input)
    {
        return input.equals("1") || input.equals("2") || input.equals("3") ||
               input.equals("4") || input.equals("5") || input.equals("6") ||
               input.equals("7") || input.equals("8") || input.equals("9");
    }

    // This method gets the position of the grid based on input
    public static int[] getPosition(String input)
    {
        int row = 0;
        int col = 0;

        if (input.equals("1"))
        {
            row = 0; col = 0;
        }
        else if (input.equals("2"))
        {
            row = 0; col = 1;
        }
        else if (input.equals("3"))
        {
            row = 0; col = 2;
        }
        else if (input.equals("4"))
        {
            row = 1; col = 0;
        }
        else if (input.equals("5"))
        {
            row = 1; col = 1;
        }
        else if (input.equals("6"))
        {
            row = 1; col = 2;
        }
        else if (input.equals("7"))
        {
            row = 2; col = 0;
        }
        else if (input.equals("8"))
        {
            row = 2; col = 1;
        }
        else if (input.equals("9"))
        {
            row = 2; col = 2;
        }

        return new int[] { row, col };
    }

    // this method checks if the current player has won the game
    public static boolean isWinningMove(String[][] grid, String player)
    {
        return
            // Rows
            (grid[0][0].equals(player) && grid[0][1].equals(player) && grid[0][2].equals(player)) ||
            (grid[1][0].equals(player) && grid[1][1].equals(player) && grid[1][2].equals(player)) ||
            (grid[2][0].equals(player) && grid[2][1].equals(player) && grid[2][2].equals(player)) ||

            // Columns
            (grid[0][0].equals(player) && grid[1][0].equals(player) && grid[2][0].equals(player)) ||
            (grid[0][1].equals(player) && grid[1][1].equals(player) && grid[2][1].equals(player)) ||
            (grid[0][2].equals(player) && grid[1][2].equals(player) && grid[2][2].equals(player)) ||

            // Diagonals
            (grid[0][0].equals(player) && grid[1][1].equals(player) && grid[2][2].equals(player)) ||
            (grid[0][2].equals(player) && grid[1][1].equals(player) && grid[2][0].equals(player));
    }
}
