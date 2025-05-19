package Inivis_Maze;
import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        GameTile[][] grid = new GameTile[5][5];

        // Initialize the grid with default tiles
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                grid[i][j] = new GameTile(false, false, false);
            }
        }

        // Create walls at specific locations
        grid[1][1].setIsWall(true);
        grid[2][2].setIsWall(true);
        grid[3][3].setIsWall(true);

        // Create player at top-left corner
        Player player = new Player("Player 1", 0, 0);
        grid[player.getRow()][player.getCol()].setHasPlayer(true);

        int turn = 1;
        boolean gameOver = false;

        // Main game loop
        while (!gameOver)
        {
            System.out.println("Turn " + turn);
            printBoard(grid);
            System.out.println("Player's current position: (" + player.getRow() + ", " + player.getCol() + ")");
            gameOver = makeMove(player, grid);

            // Check if player reached bottom-right corner to win
            if (player.getRow() == 4 && player.getCol() == 4)
            {
                System.out.println("You reached the destination at (" + player.getRow() + ", " + player.getCol() + ")! You Win!");
                gameOver = true;
            }

            turn++;
        }

        System.out.println("Game Over.");
    }

    public static void printBoard(GameTile[][] grid)
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean makeMove(Player player, GameTile[][] grid)
    {
        boolean validMove = false;

        while (!validMove)
        {
            System.out.println("Enter your move (W = up, A = left, S = down, D = right):");
            char move = scanner.next().toLowerCase().charAt(0);

            int newRow = player.getRow();
            int newCol = player.getCol();

            if (move == 'w')
            {
                newRow--;
            }
            else if (move == 'a')
            {
                newCol--;
            }
            else if (move == 's')
            {
                newRow++;
            }
            else if (move == 'd')
            {
                newCol++;
            }
            else
            {
                System.out.println("Invalid input. Use W, A, S, or D.");
                continue;
            }

            // Check if move is within bounds
            if (newRow >= 0 && newRow < 5 && newCol >= 0 && newCol < 5)
            {
                // Check if there's no wall at the new position
                if (!grid[newRow][newCol].getIsWall())
                {
                    grid[player.getRow()][player.getCol()].setHasPlayer(false);
                    player.setRow(newRow);
                    player.setCol(newCol);
                    grid[newRow][newCol].setHasPlayer(true);
                    grid[newRow][newCol].setIsRevealed(true); 
                    validMove = true;
                }
                else
                {
                    System.out.println("You hit a wall");
                }
            }
            else
            {
                System.out.println("Invalid Move. Try again");
            }
        }

        return false;
    }
}
