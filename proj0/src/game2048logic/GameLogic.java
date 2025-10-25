package game2048logic;

import game2048rendering.Side;
import static game2048logic.MatrixUtils.rotateLeft;
import static game2048logic.MatrixUtils.rotateRight;

/**
 * @author  Josh Hug
 */
public class GameLogic {
    /** Moves the given tile up as far as possible, subject to the minR constraint.
     *
     * @param board the current state of the board
     * @param r     the row number of the tile to move up
     * @param c -   the column number of the tile to move up
     * @param minR  the minimum row number that the tile can land in, e.g.
     *              if minR is 2, the moving tile should move no higher than row 2.
     * @return      if there is a merge, returns the 1 + the row number where the merge occurred.
     *              if no merge occurs, then return 0.
     */
    public static int moveTileUpAsFarAsPossible(int[][] board, int r, int c, int minR) {
        // TODO: Fill this in in tasks 2, 3, 4
        if (r==0 || r==minR)
        // If on the first row, no need to move up.
        {
            return 0;
        }

        int value=board[r][c];
        int min_row=r-1;
        for(;min_row>=0;min_row-=1)
        {
            if (board[min_row][c]!=0 )
            {
                if (min_row<minR)
                {
                    break;
                }

                if (board[min_row][c]==value)
                {
                    // merge occurs
                    value=2*value;
                    board[min_row][c]=value;
                    board[r][c]=0;
                    return 1+min_row;
                }
                break;
            }
        }


        if (min_row+1!=r) // if there need moving up
        {
            board[min_row + 1][c] = value; // Move up.

            board[r][c] = 0; // Original position is 0 now.
        }
        return 0;
    }

    /**
     * Modifies the board to simulate the process of tilting column c
     * upwards.
     *
     * @param board     the current state of the board
     * @param c         the column to tilt up.
     */
    public static void tiltColumn(int[][] board, int c) {
        // TODO: fill this in in task 5
        int num_rows=board.length;
        int merge_happen=0; // remember the row where merge happens, the next merge cannot happen
        // upper more than or equal this row
        for(int i=0;i<num_rows;i+=1)
        {
            int temp=moveTileUpAsFarAsPossible(board,i,c,merge_happen);
            if (temp>merge_happen)
            {
                merge_happen=temp;
            }
        }
        return;
    }

    /**
     * Modifies the board to simulate tilting all columns upwards.
     *
     * @param board     the current state of the board.
     */
    public static void tiltUp(int[][] board) {
        // TODO: fill this in in task 6
        int num_cols=board[0].length;
        for (int i=0;i<num_cols;i+=1)
        {
            tiltColumn(board,i);
        }
        return;
    }

    /**
     * Modifies the board to simulate tilting the entire board to
     * the given side.
     *
     * @param board the current state of the board
     * @param side  the direction to tilt
     */
    public static void tilt(int[][] board, Side side) {
        // TODO: fill this in in task 7
        if (side == Side.EAST) {
            rotateLeft(board);
            tiltUp(board);
            rotateRight(board);
            return;
        } else if (side == Side.WEST) {
            rotateRight(board);
            tiltUp(board);
            rotateLeft(board);
            return;
        } else if (side == Side.SOUTH) {
            rotateRight(board);
            rotateRight(board);
            tiltUp(board);
            rotateLeft(board);
            rotateLeft(board);
            return;
        } else {
            tiltUp(board);
            return;
        }
    }
}
