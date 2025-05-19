package Inivis_Maze;

public class GameTile
{
    private boolean hasPlayer = false;
    private boolean isRevealed = false;
    private boolean isWall = false;

    public GameTile(boolean hp, boolean isR, boolean isW)
    {
        hasPlayer = hp;
        isRevealed = isR;
        isWall = isW;
    }

    public boolean getHasPlayer()
    {
        return hasPlayer;
    }

    public boolean getIsRevealed()
    {
        return isRevealed;
    }

    public boolean getIsWall()
    {
        return isWall;
    }

    public void setHasPlayer(boolean hp)
    {
        hasPlayer = hp;
    }

    public void setIsRevealed(boolean isR)
    {
        isRevealed = isR;
    }

    public void setIsWall(boolean isW)
    {
        isWall = isW;
    }

    public String toString()
    {
        if (hasPlayer)
        {
            return " * "; 
        }
        if (!isRevealed)
        {
            return " = "; 
        }
        else if (isRevealed)
        {
            if (isWall)
            {
                return " X "; 
            }
            else
            {
                return " O "; 
            }
        }
        return " = "; 
    }
}
