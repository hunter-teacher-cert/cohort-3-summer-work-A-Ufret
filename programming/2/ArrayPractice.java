/**
 * ArrayPractice by Team BossCoders
 * Worked on by self, then worked with partners to improve change while Alise drove & coded in her repo
 * collaborators: 
 * AliseBraick
 * Usman, Ahmed - usman0527
 * Maschmeyer, Kate - kmaschm 
 * Ashley Ufret
 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:
   1. buildIncreasingArray 👍
   2. buildRandomArray 👍
   3. printArray 👍
   4. arraySum 👍
   5. firstOccurence 👍
   6. isSorted 👍
   7. findMaxValue 👍
   8. countOdds 👍
   9. flip  ( I did not work for me??????)😩😩😩😩
   The stubs will have comments describing what they should do
   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   - buildRandomArray 
   - printArray 
   - arraySum 
   - firstOccurence 
   - findMaxValue 
   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray 
   - isSorted 
   - countOdds 
   Advanced:
   Complete all the methods 
*/

import java.util.*;
import java.io.*;

public class ArrayPractice
{

  public static int[] buildIncreasingArray( int size, int startValue, int step )
  {
    int[] data = new int[size];
    for(int i = 0; i < data.length; i++) {
        data[i] = startValue + step*i; 
    }
    return data;
  }

  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random();
    int[] data = new int[size];

      for(int i = 0; i < size; i++) {
          data[i] = r.nextInt(maxValue);
      }

    return data;
  }

  public static void printArray( int[] data )
  {
      for(int i = 0; i < data.length; i++) {
        System.out.print(data[i] + " ");
    }
      System.out.println();
  }

  public static int firstOccurence( int[] data, int value )
  {
    int index = -1; 
    for(int i = 0; i < data.length; i++) {
        if(data[i] == value && index == -1) { // make sure we haven't seen it yet
            index = i;
        }
    }
    
    return index; 
  }
  
  public static int arraySum( int[] data )
  {
    int sum = 0;
    for(int i = 0; i < data.length; i++) {
        sum += data[i];
    }

    return sum; 
  }


  public static boolean isSorted( int[] data )
  {
   // int currVal = data[0]; // where our pointer is
      // updated after demo, thanks!
    for(int i = 0; i < data.length-1; i++) {
        if(data[i] > data[i+1]) { // if current is bigger than next
            return false;
        } 
    }  
    return true; 

  }

  public static int findMaxValue( int[] data ) {
    int max = data[0];  // will hold the maximum value

    for(int i = 1; i < data.length; i++) {
        if(data[i] > max) {
            max = data[i];
        }
    }

    return max;
  }

  public static int countOdds( int[] data ) {
    int count = 0;

    for(int i = 0; i < data.length; i++) {
        if(data[i] % 2 == 1) { // if value is odd
            count += 1;
        }
    }
    return count;
  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter
     Postcondition:
     elements of the input array are in reverse order
     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  public static void flip( int[] data ) {
    
      
  }


  public static void main( String[] args )
  {

    int[] data = buildRandomArray(10, 20);
    int[] data2 = buildIncreasingArray(10,5,3);
    printArray(data);
    printArray(data2);

    // add calls to show that the methods you write work.
      System.out.println(arraySum(data2));

    // test firstOccurence:
    int testVal = 20;
    int[] data3 = new int[]{0, 15, 20, 20, 20, 50}; // mult occurence
    int[] data4 = new int[]{0, 15, 21, 22, 23, 24};  // no occurence
      
      System.out.println("The first occurence of " + testVal + " in data2 is " + firstOccurence(data2, testVal));  // 5 (single occurence)
      System.out.println("The first occurence of " + testVal + " in data3 is " + firstOccurence(data3, testVal));  // 2 (mult occurence)
      System.out.println("The first occurence of " + testVal + " in data4 is " + firstOccurence(data4, testVal));  // -1 (no occurence)

      // testing findMaxValue
      System.out.println("Max value in data2 is: " + findMaxValue(data2));


      // testing isSorted
    int[] data5 = new int[]{0, 15, 20, 20, 20, 50}; // sorted
    int[] data6 = new int[]{0, 15, 21, 24, 23, 24};  // not sorted
      System.out.println("data5 is sorted: " + isSorted(data5));
      System.out.println("data6 is sorted: " + isSorted(data6));

    // testing countOdds
      System.out.println("Array: ");
      printArray(data);
      System.out.println("# of odds: " + countOdds(data));

      System.out.println("Array: ");
      printArray(data2);
      System.out.println("# of odds: " + countOdds(data2)); 
      
      System.out.println("Array: ");
      printArray(data3);
      System.out.println("# of odds: " + countOdds(data3)); 
      
      System.out.println("Array: ");
      printArray(data4);
      System.out.println("# of odds: " + countOdds(data4)); 
      
      System.out.println("Array: ");
      printArray(data5);
      System.out.println("# of odds: " + countOdds(data5)); 
      
      System.out.println("Array: ");
      printArray(data6);
      System.out.println("# of odds: " + countOdds(data6)); 

     
      printArray(data2);

      
      
  }
}
