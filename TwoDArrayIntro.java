public class TwoDArrayIntro
{
    public static void main(String[] args)
    {
        //1
        int[][] gridNums = new int[4][6];

        //2
        int[][] gridNum = {
            {4, 5, 7},
            {2, -1, 8},
            {0, 1, 3}
        };

        //3
        gridNums[0][0] = 17;
        gridNum[0][0] = 17;

        //4
        gridNums[1][2] = 20;
        gridNum[1][2] = 20;

        //5
        gridNums[0][gridNums[0].length - 1] = -5;
        gridNum[0][gridNum[0].length - 1] = -5;

        //6
        gridNums[gridNums.length - 1][0] = -7;
        gridNum[gridNum.length - 1][0] = -7;

        //7
        gridNums[gridNums.length - 1][gridNums[0].length - 1] = -30;
        gridNum[gridNum.length - 1][gridNum[0].length - 1] = -30;

        for (int i = 0; i < gridNums.length; i++)
        {
            for (int j = 0; j < gridNums[0].length; j++)
            {
                System.out.print(" " + gridNums[i][j]);
            }
        }

        System.out.println();

        for (int i = 0; i < gridNum.length; i++)
        {
            for (int j = 0; j < gridNum[0].length; j++)
            {
                System.out.print(" " + gridNum[i][j]);
            }
        }

        System.out.println();

        //8
        printElementsRow(gridNum);

        //9
        printElementsColumn(gridNum);

        //10
        printElementsRowMajorOrder(gridNum);

        //11
        printElementsColumnMajorOrder(gridNum);
    }

    //8
    public static void printElementsRow(int[][] nums)
    {
        for (int i = 0; i < nums[0].length; i++)
        {
            System.out.print(" " + nums[0][i]);
        }
    }

    //9
    public static void printElementsColumn(int[][] nums)
    {
        System.out.println();
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(" " + nums[i][0]);
        }
    }

    //10
    public static void printElementsRowMajorOrder(int[][] nums)
    {
        System.out.println();
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums[0].length; j++)
            {
                System.out.print(" " + nums[i][j]);
            }
        }
    }

    //11
    public static void printElementsColumnMajorOrder(int[][] nums)
    {
        System.out.println();
        for (int j = 0; j < nums[0].length; j++)
        {
            for (int i = 0; i < nums.length; i++)
            {
                System.out.print(" " + nums[i][j]);
            }
        }
    }
}
