
import java.io.*;
import java.util.*;

/**
 * SuperArrayKate by Team KateisAwesome  

 * collaborators: Saranii Muller, Ashley Ufret, Kate Maschmeyer, Nicole Cojuangco
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
* ***Basic***
* Add/write:
* > #0:  SuperArray() ✅
*     Basic constructor that:
      1. Creates a new array of size 10 and assign data to refer to it. 
      2. Sets the numberElements variable to 0.
* > #1:   SuperArray(int size) ✅
*     Constructor that:
*     1. Creates a new array of size and assign data to refer to it. 
      2. Sets the numberElements variable to 0.
* > #2:   isEmpty() ✅
*     return true if the SuperArray is empty, false otherwise.
* > #3:  add(int value) ✅
*     adds value to the end of the SuperArray (after the last added element)
* > #4:  toString()  ✅
*    return a String version of SuperArray in human-readable format

* ***Intermediate ***
* Add/write:
* > #0: grow()  ✅
*   Enlarges the SuperArray. It should:
*      Create a new array, 5 units larger
*      Copy the old data to the new array
*      Set the data instance variable to point to the new array
*
* Modify:
* > #1: add(int value)  ✅
*   Modify code so that if the data array is filled it will:
*     1. Grow the array using the grow method you just wrote.
*     2. Add the new value to the array.
* 
* Add/write:
* > #2: get(int index)  ✅
*    return the value at location index 
* > #3: set(int index, int value)  
*    set the element at index to value  
*
*
* ***Advanced***
* Write:
* > #0: add(int index, int value)  ✅
*     Adds value at location index. You should shift the data to create an open space if you need to and you can use grow() if you need to make the array larger.
* > #1: remove(int index) ✅
    Removes the location at index by shifting all the elements after location index and subtracting one from numberElements
*
*/


public class SuperArray
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
  public SuperArray()
  {
     // NOTE: variables are already declared above (likely lines 96 & 97); you only have to create/instantiate them
    
    this.data = new int[10]; // data can fit 10 elements
    this.numberElements = 0; // no elements actually filled yet
  }

    /** Basic #1: SuperArray(int size)
  *
  * overloaded constructor -- takes in an integer called size which specifies the initial capacity
  * EXAMPLE of setting capacity with regular array of integers
  *  int[] myArr = new int[6]; // capacity of 6
  *  int[] myArr2 = new int[40]; // capacity of 40
  **/
  public SuperArray( int size )
  {
    this.data = new int[size]; // data can fit size # of elements
    this.numberElements = 0; // no elements actually filled yet
  }

 
 // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~

  /** Basic #2: isEmpty() 
  *
  * Determines whether the SuperArray is empty (returns true if empty, false if not)
  * 
  * @return boolean
  */
  public boolean isEmpty()
  {
    return this.numberElements == 0; // changed to this after demo/discussion
    // if(this.numberElements == 0) { // we have added 0 elts
    //   return true;
    // } else {
    //   return false; 
    // }
  }

  /** Basic #3: add(int value) add the value & increment (no special cases)
  * Intermediate #1: add(int value) Modify to deal with special cases
  *
  * Takes in an integer called value, and appends the value to our SuperArray 
  *
  * Note: makes sure to check the size of underlying array & grow/copy if possible, then appends
  *
  * NOTE: You will write version of this for Basic, then modify it to deal with special cases in Intermediate
  *
  * @param value  integer, we want to append this to our SuperArray
  */
  public void add( int value )
  {
    // test to see if we need to grow, then grow
  
    if(this.data.length == this.numberElements) { // we are currently at capacity
      //System.out.println("About to grow array");
      grow(); // grow the array first
     }
    
     //System.out.println("Added " + value + " at location " + numberElements);

    // NOTE: if numberElements fill in an array, then the last element is at (numberElements - 1).  We add the next value at the numberElements index.
    this.set(this.numberElements, value);
    //this.data[this.numberElements] = value; // add value to end 
    this.numberElements++; // make sure we update our count

  }//end add()

  

  /** Basic #4: toString() 
  *
  * Returns a human-friendly String for our SuperArray 
  * Example: {7, 2, 15, 4}
  *
  * @return String, human-friendly version of SuperArray
  */
  public String toString()
  {
    String sArr = ""; // initialize to empty String so that concatenated integers will be casted to Strings
    sArr = sArr + "["; // starting to print as array
    for(int i = 0; i < this.numberElements; i++) {
      if(i == 0) { // starting element
        sArr = sArr + this.get(i);
      } else {
         sArr = sArr + ", " + this.get(i);
      }
    }
    sArr = sArr + "]"; // end nicely-formatted array
    
    return sArr;
  }//end toString()


 // ************ END BASIC ************


// ************ START INTERMEDIATE ************ 

  /** Intermediate #0: grow()
  *
  * Enlarges capacity of SuperArray by 5:
  *   1. Create a new array that is 5 units larger (as specified!)
  *   2. Copy elements from old array into new one
  *   3. Set data equal to your new array
  */
   // ✅ SWITCHED BACK TO PRIVATE AFTER TESTING
  private void grow()
  {
    //System.out.println("Growing array");
    // create a new array that is 5 units larger (as specified!)  
    int[] grownArr = new int[this.data.length + 5];

    // copy elements from old array into new one
    for(int i = 0; i < this.numberElements; i++) {
      //grownArr[i] = this.data[i];
      grownArr[i] = this.get(i);
    }

    this.data = grownArr;
    
  }//end grow()


   /** Intermediate #1: Go back up to add(int value) and modify it to deal with special cases (if you need to grow, then grow) **/

  /** Intermediate #2: get(index)
  *
  * Takes in an integer called index, and returns the value at that index
  * If we have not stored a value at that index, prints error message, will return Integer.MIN_VALUE
  *
  * @param   index   integer, we want to determine value at this index 
  * @return  integer, value at given index (if index does not exist, return Integer.MIN_VALUE)
  */
  public int get(int index)
  {
    if(index > this.numberElements) {
      System.out.println("Index is out of bounds");
      return Integer.MIN_VALUE;
    }
    return this.data[index];
  }

  /* Intermediate #3: set(int index, int value)  
  *    set the element at index to value  
  *
  */
  public void set(int index, int value) {
    this.data[index] = value;
  }

  
  // ************ END INTERMEDIATE ************


  // ************ START ADVANCED ************ 

  
   /** Advanced #0: add(index, value)
  *
  * Takes in an integer called index and an integer called value.  
  * NOTE: gaps are not allowed in this version of  SuperArray - if index > numberElements (past appending the value to the end of the array, warning statement will be printed and nothing will be added)
  * 
  *
  * @param  index  integer, location in array to add specified value 
  * @param  value  integer, value to add at specified index
  */
  public void add(int index, int value)
  {
    // NOT ALLOWING GAPS
    // while(index >= this.data.length) { // 
    //   System.out.println("Increasing capacity to reach desired index");
    //   grow();
    // }

    if(index > this.numberElements || index < 0) {
      System.out.println("Index out of bounds. Lowest index available for adding to array: 0, Greatest index available for adding to array: " + numberElements);
    
    } else {
      
      if(this.data.length == this.numberElements) { // we are currently at capacity 
        grow();
      }

       // shift elements toward the end of the array
      for(int i = this.numberElements - 1; i >= index; i--) { // start at last element, move inward
        //System.out.println("Setting location " + (i+1) + " to " + this.get(i));
        //this.data[i+1] = this.get(i);
        this.set(i+1, this.get(i));
      }

      // insert new element
      // System.out.println("Inserting " + value + " at location " + index);
      this.set(index, value);
      //this.data[index] = value;

      // increment numberElements
      this.numberElements++;
      
      // NO GAPS:
      // this.numberElements = Math.max(index+1, this.numberElements + 1);
    }
  }


  /** Advanced #1: remove(int index) 
  *
  * Takes in an integer called index and removes the value at the given index. 
  * If index is out of bounds, print error message and remove nothing
  *
  * @param index   integer, we'll remove value at given index 
  */
  public void remove(int index)
  {
    if(index < numberElements && index >= 0) { // valid index
      // shift items down to remove the item at index
      for(int i = index; i < numberElements-1; i++) {
        //this.data[i] = this.get(i+1);
        this.set(i, this.get(i+1));
      }

      // reduce numberElements by 1;
      this.numberElements--;
      
    } else {
       System.out.println("Index out of bounds. Lowest index available for removal: 0, Greatest index available for removal: " + (numberElements-1));
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