import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team Room 15 July 05, 2022 LucidThinkeren
 * Théa Williams
 * collaborators: Ashley Ufret, Steve Sabaugh
 */

/**
   INSTRUCTIONS:
   Place this file in a folder named programming/3/.
   This file contains the following completed method. Use it as a model
   to help you with the other methods:
   - buildBoard
   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):
   Basic level (complete all):
   - printBoard *
   - copyBoard *
   Intermediate level (complete Basic methods plus this method):
   - explodeSquare *
   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString
   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.
   Ex: buildBoard(3,4,'x') will return this 2D array:
   xxxx
   xxxx
   xxxx
   xxxx
   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) 
    {
      for (int j = 0; j < cols; j++) 
      {
        board[i][j]=value;
      }
    }
    return board;
  }


  /**
     pretty prints a 2D array of characters

     This should print the array as a grid
  */
  public static void printBoard( char[][] board )
  {
    for (int i = 0;i < board.length;i++){
      for (int j = 0;j < board[i].length;j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row

     Returns:
     Nothing

     Change the 2D array board so that all the elements in the
     specified row are set to value.

     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx

     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  public static void setRow( char[][] board, int row, char value )
  {
    for(int i = row;i < row + 1;i++){
      for(int j = 0;j < board[i].length;j++){
        board[i][j] = value;
      }
    }
  }


  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  public static char[][] copyBoard( char[][] original )
  {
    char tempArray [][] = new char [original.length][original[0].length];

    for (int i = 0;i < original.length;i++){
      for (int j = 0;j < original[0].length;j++){
        tempArray[i][j] = original[i][j];
      }
    }
    return tempArray;
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board

     Returns:
     nothing

     A location in a 2D array can be though of as having 6
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.

     oooooo
     o123oo
     o4Q5oo
     o678oo
     oooooo

     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col

     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ

     explodeSquare(board,1,1) will change the array to
     XXXQQ
     XQXQQ
     XXXQQ
     QQQQQ

     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  public static void explodeSquare( char[][] board, int row, int col )
  //https://docs.google.com/drawings/d/1zR4EbwbV0aBSJhCEGuiV6pko4QgdlNwhE6UoYGlwrEE/edit?usp=sharing
  {
    int startR = (row - 1 < 0) ? row : row - 1;
    int startC = (col - 1 < 0) ? col : col - 1;
    int rowLim = (row + 1 > board.length - 1) ? row + 1 : row + 2;  
    int colLim = (col + 1 > board[0].length - 1) ? col + 1 :  col + 2;
    
    for(int r = startR; r < rowLim;r++)
    {
      for(int c = startC;c < colLim;c++)
      {
        if (r == row && c == col)
        {
          board[r][c] = board[r][c];
        }
        else {
          board[r][c] = 'X';
        }
      }  
    }
    
  }

    /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).

     Example:

     Given the array

     qqzqq
     qqqqq
     qqqqq
     qqqqq
     qzqqq
     qqqqq
     qqqqz

     ...
     explodeAllchar(board,'z')
     will change board to

     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz

  */
 
  public static void explodeAllChar(char[][] board, char c)
  {
    for(int i = 0;i < board.length;i++){
      for(int  j= 0;j < board[i].length;j++){
        if (board[i][j] == c){
          int startRow;
          int startCol;
          int rowLimit;
          int colLimit;
          
          if (i - 1 < 0){
            startRow = i;
          }
          else{
            startRow = i - 1;
          }
          if (j - 1 < 0){
            startCol = j;
          }
          else{
            startCol = j - 1;
          }
          if (i + 1 > board.length - 1){
            rowLimit = i + 1;
          } 
          else{
            rowLimit = i + 2;
          }
          if (j + 1 > board[0].length - 1){
            colLimit = j + 1;
          } 
          else{
            colLimit = j + 2;
          }
          for (int row = startRow;row < rowLimit;row++){
            for(int col = startCol;col < colLimit;col++){
              if (row == i && col == j){
                board[row][col] = board[row][col];
              }    
              else {
                board[row][col] = 'X';
              }
            }
          }
      
        }
      }
    }
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.

     This will insert the parameter word into board in the downward
     direction. See examples below

     Example:

     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx

     downString(board,1,1,"Hello") will change board to:

     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx

     Given the above array, downString(board,4,3,"World") will
     change board to:

     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx

     Note that the method has to stop at the bottom of the array.
  */
  public static void downString( char[][] board, int row, int col, String word )
  {
    for (int i = row;i < board.length;i++){
      for(int j = col;j < col + 1;j++){
        if (i < word.length() + row ){
          board[i][j] = word.charAt(i-row);
        }
      }
    }
  }


  public static void main( String[] args )
  {
    char[][] b = buildBoard(5,10,'z');
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
    printBoard(b);
    char [][] bCopy = copyBoard(b);
    System.out.println("\ncopy of b");
    printBoard(bCopy);
    System.out.println("\nexplodeSquare()");
    explodeSquare(b,2,5);
    printBoard(b);
    System.out.println();
    explodeSquare(b,0,0);
    printBoard(b);
    System.out.println();
    explodeSquare(b,4,9);
    printBoard(b);
    System.out.println("\nsetRow() with copy of b");
    setRow(bCopy,1,'@');
    printBoard(bCopy);
    System.out.println("\ndownString()");
    char [][] c = buildBoard(7,6,'x');
    downString(c,1,1,"Hello");
    printBoard(c);
    System.out.println();
    downString(c,4,3,"World");
    printBoard(c);
    System.out.println("\nexplodeAllChar()");
    char [][] d =  {{'q','q','z','q','q'},
                    {'q','q','q','q','q'},
                    {'q','q','q','q','q'},
                    {'q','q','q','q','q'},
                    {'q','z','q','q','q'},
                    {'q','q','q','q','q'},
                    {'q','q','q','q','z'}};
    explodeAllChar(d,'z');
    printBoard(d);
    
    
  }
}