
import java.io.*;
import java.util.*;

/**
 * SuperArrayKate by Team KateisAwesome
 * Saranii Muller  
 * collaborators: Ashley Ufret, Kate Maschmeyer, Nicole Cojuangco
 */



/** ***** WHY DO WE WANT A SuperArray ANYWAY? ***** 
Regular arrays are cool.  We can store things in them and we can easily find out how many things we can store in them (capacity). However, if we want to know how many things are *actually* stored in array, we have to do extra work.  

We can keep track with a counter (another variable) to tell us how many elements we've stored in the array.  

If we want many, many arrays to store lots and lots of things, having to keep track of the arrays and each of their counters is annoying.  

So: we're going to write a class that will do this for us.  We can write the class once and then use it many, many times.
**/



/** ***** WHAT WILL SuperArray DO? ***** 

* It will store our information (in this case, integers) and keep count of how many integers we've stored.

With a SuperArray, we can:
  * get the value stored at a specified index
  * set a value at a specific index
  * write the SuperArray as a String, so we can easily print & read it
  * determine how many integers we've stored in our SuperArray (as opposed to the length, which tells us the capacity, not how many integers are stored!)
  * check if the SuperArray is empty
  * increase the size of our SuperArray
  * add an integer to the SuperArray (at the end or at a specified index)
  * remove the integer stored at a specified index from the SuperArray  
*/



/** ***** WHAT DO I DO MAKE A SuperArray? ***** 
* In the skeleton, there is a debug() function.  It is now placed as the last method in this class.  

* According to https://github.com/hunter-teacher-cert/cs-ed-cohort-3-summer-2022/tree/main/daily/6  as of 07.09.22 18:21
(added toString() in Basic as I didn't see it listed)

*
* 	🔰***Basic***
* Add/write:
* >✔️ #0:  SuperArray()
*     Basic constructor that:
      1. Creates a new array of size 10 and assign data to refer to it. 
      2. Sets the numberElements variable to 0.
* >✔️ #1:   SuperArray(int size)
*     Constructor that:
*     1. Creates a new array of size and assign data to refer to it. 
      2. Sets the numberElements variable to 0.
* > ✔️#2:   isEmpty()
*     return true if the SuperArray is empty, false otherwise.
* > ✔️#3:  add(int value)
*     adds value to the end of the SuperArray (after the last added element)
* > ✔️#4:  toString() 
*    return a String version of SuperArray in human-readable format

* 🎒***Intermediate ***
* Add/write:
* > ✔️#0: grow() 
*   Enlarges the SuperArray. It should:
*      Create a new array, 5 units larger
*      Copy the old data to the new array
*      Set the data instance variable to point to the new array
*
* Modify:
* > ✔️#1: add(int value) 
*   Modify code so that if the data array is filled it will:
*     1. Grow the array using the grow method you just wrote.
*     2. Add the new value to the array.
* 
* Add/write:
* > ✔️#2: get(int index)
*     return the value at location index 
*
*
* ✨***Advanced***
* Write:
* > #0: add(int index, int value) 
*     Adds value at location index. You should shift the data to create an open space if you need to and you can use grow() if you need to make the array larger.
* > #1: remove(int index) 
    Removes the location at index by shifting all the elements after location index and subtracting one from numberElements
*
*/

public class SuperArrayKate
{
 
  //instance variables
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements
  
 // ************ START BASIC ************
  
  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  
  /** Basic #0: SuperArray()
  *
  * default constructor -- initializes capacity to 10 
  * EXAMPLE of setting capacity with regular array of integers
  *  int[] myArr = new int[6]; // capacity of 6
  *  int[] myArr2 = new int[40]; // capacity of 40
  **/
  public SuperArrayKate()
  {
    // NOTE: variables are already declared above (likely lines 96 & 97); you only have to create/instantiate them
    
    // create an array of integers called data that has a capacity of 10
    data = new int[10];//creates new array of capacity of 10 
    
    // set numberElements to 0  (we haven't stored any integers in our SuperArray yet) - (empty array with nothing in it)
    numberElements = 0;
    
  } 

  /** Basic #1: SuperArray(int size)
  *
  * overloaded constructor -- takes in an integer called size which specifies the initial capacity
  * EXAMPLE of setting capacity with regular array of integers
  *  int[] myArr = new int[6]; // capacity of 6
  *  int[] myArr2 = new int[40]; // capacity of 40
  **/
  public SuperArrayKate( int size )
  {
     // NOTE: variables are already declared above (likely lines 96 & 97); you only have to create/instantiate them
    
    // create an array of integers called data with capacity of size
    data = new int[size];
    
    // set numberElements to 0  (we haven't stored any integers in our SuperArray yet)
    numberElements = 0;
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~

  /** Basic #2: isEmpty() 
  *
  * Determines whether the SuperArray is empty (returns true if empty, false if not)
  */
  public boolean isEmpty()
  {
    // write code determine whether the SuperArray is empty or not
    /* YOUR CODE HERE */

    if (numberElements == 0) {
        return true;      
    }
    return false;
  }
  
  /** Basic #3: add(int value) add the value & increment (no special cases)
  * Intermediate #1: add(int value) Modify to deal with special cases
  *
  * Takes in an integer called value, and appends the value to our SuperArray
  *
  * NOTE: You will write version of this for Basic, then modify it to deal with special cases in Intermediate
  */
//adds value to the end of the SuperArray (after the last added element)
  public void add( int value )
  {
    // INTERMEDIATE: test to see if we need to grow, then grow    
    if (numberElements == data.length)    {
      grow(); //grow() is defined below see private void grow()
    }
    // BASIC: 
    // add item int to "end" (after last input integer)
    data[numberElements] = value;   
    // increment numberElements
    numberElements++;
  }
//if the number of elements = data.length of array then you have to grow
  /** Basic #4: toString() 
  *
  * Returns a human-friendly String for our SuperArray 
  */
  public String toString()
  {
    // return a String version of SuperArray that is human-readable - ie when this prints what do you want it to look like? 
    // EXAMPLE array: int[] highScores = {99,98,98,88,68};
    //next line starts what human read will  look like
    String sArr = "{";
    //next line traverses array to pull elements to "see"
    for(int i = 0; i < numberElements; i++) {
      //this then reassigns sArr  with the traversal
      sArr = sArr + data[i] + ", "; 
    }
    // re assigns sArr to "add in" prior
    sArr = sArr + "}";
    return sArr; 
  }
//system.out.println(sa)

 // ************ END BASIC ************
// ************ START INTERMEDIATE ************ 

  /** Intermediate #0: grow()
  *
  * Enlarges capacity of SuperArray by 5:
  *   1. Create a new array that is 5 units larger (as specified!)
  *   2. Copy elements from old array into new one
  *   3. Set data equal to your new array
  */
  private void grow()
  {
    
    // create a new array that is 5 units larger (as specified!)

    //temp is new array , data is old array , + 5 increases by 5
    int temp[] = new int[data.length + 5]; 

    // copy elements from old array into new one
    //traverses old array
    for(int i = 0; i < numberElements; i++) {
      //sets old array data per index to temp
      temp[i] = data[i];    
    }
    // set data equal to your new array
    data = temp;
    
  }

  /** Intermediate #1: Go back up to add(int value) and modify it to deal with special cases (if you need to grow, then grow) **/
  //if the number of elements is the same as the size of array then would need to grow the array to accommodate new info
  
  
  
  /** Intermediate #2: get(index)
  *
  * Takes in an integer, index, and returns the value at that index
  */
  //telling what number is in location of indicated index
  public int get(int index)
  {
    // return the value stored at the specifed index - the called index comes in driver file
      // if the index point is larger than the data point
      if(index > data.length) {
        //then print
        System.out.println("Index does not exist, returning Integer.MIN_VALUE");
        //returns what java defines as the smallest possible integer there is which is nothing recognisable to what you are looking for
        return Integer.MIN_VALUE;
      }
    //otherwise return the data you want
    return data[index];

  }
  // ************ END INTERMEDIATE ************

  // ************ START ADVANCED ************ 

   /** Advanced #0: add(index, value)
  *
  * Takes in an integer called index and an integer called value.  
  */
  public void add(int index, int value)
  {
    // see if there's enough room
   if(index > numberElements || index < 0) { // NOT ALLOWED -- no gaps allowed!
     System.out.println("Index out of bounds!");
   } else {

      if(this.data.length == this.numberElements) { // we are currently at capacity 
        grow();
      } 

      // shift elements toward the end of the array
      for(int i = numberElements - 1; i >= index; i--) {
        data[i+1] = data[i];//this shuffles to the next index spot
      }
       // insert new element
      /* YOUR CODE HERE */
       data[index] = value;
  
      // increment numberElements
      /* YOUR CODE HERE */ 
       numberElements++; //adds 1 to the number of elements 
     
   }
  }
 
  /** Advanced #1: remove(int index) 
  *
  * Takes in an integer called index and removes the value at the given index. 
  */
  public void remove(int index)
  {
    // shift items down to remove the item at index
    if(index > numberElements - 1 || index < 0) { // NOT ALLOWED
     System.out.println("Index out of bounds!");
   } else {
      for(int i = index; i < numberElements - 1; i++) {
        data[i] = data[i+1];//shuffles data down
      }
      // subtract 1 from numElements;
      numberElements--;

    }
  }

  // ************ END ADVANCED ************

 //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()






  
}//end class