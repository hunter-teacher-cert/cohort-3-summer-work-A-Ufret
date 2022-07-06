import java.io.*;
import java.util.*;

/**
 * Group 9 July 6, 2022 Conway's Game of Life by Team AreWeSentientYet?
 * Sarah Mccoy
 * collaborators: Kirk Martin, Ashley Ufret, Parmanand M
 */

/**
   The Rules of Life:

   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.

   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.

   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.

   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
			char[][] board = new char[rows][cols];
			return board;
  }


  //print the board to the terminal
  public static void printBoard( char[][] board )
  {
		int rows = board.length;
		int cols = board[0].length;
		//The length of the 2D array is the number of rows in that array (number of sublists)
		for (int i = 0; i < rows; i++) {
			//The number of columns in the array is the same as the length of one of the rows, so just use the first one.
      for (int j = 0; j < cols; j++) {
        System.out.print(board[i][j] + " ");
      }
				System.out.println();
  	}
  }


  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
		board[r][c]=val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  {
		int count =0;
		for (int i = row-1; i < row+2; i++) {
      for (int j = col-1; j < col+2; j++) {
        if(i > -1 && 
						i < board.length && 
						!(row==i && col==j) &&
						j > -1 &&
						j<board[0].length &&
						board[i][j]=='x')
					{
						count++;
					}
						
          
        }
      }
  }
  


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {
		return 'z';
  }


  //generate and return a new board representing next generation
  // public static char[][] generateNextBoard( char[][] board )
  // {

  // }


  public static void main( String[] args )
  {
    
    char[][] board;
    board = createNewBoard(25,25);

    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');

    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)

    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");

    //board = generateNextBoard(board);

    // System.out.println("Gen X+1:");
    // printBoard(board);
    // System.out.println("--------------------------\n\n");
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class