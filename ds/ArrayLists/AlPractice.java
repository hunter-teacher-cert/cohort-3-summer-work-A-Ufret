import java.io.*;
import java.util.*;

/**
 * Room 14 (7/12/22)
 * Collaborators: Shana Elizabeth Henry, Christopher de Silva, Kate Maschmeyer, Ashley Ufret
 */

/** Methods to write
Basic level:
------------
DONEpublic static ArrayList<Integer> buildRandomList(int size, int maxval)
DONEpublic static int sumOfList(ArrayList<Integer> dataList)
Intermediate level:
-------------------
DONE public static void  swapElements(ArrayList<Integer> dataList, int indexA,int indexB)
public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)
Challenge level:
-------------------
public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
*/


public class AlPractice{

  /**
  Parameters:
  - size - an integer representing how many items to add to the list
  - maxval - the largest value to store in the list
  Preconditions:
  - size >= 0
  - maxVal > 0
  Returns:
  - A new ArrayList of Integers with each value being a random
    number between 0 and maxval (not including maxval).
  */
  //Notes of <Integer>:  The Integer class wraps a value of the primitive type int in an object. An object of type Integer contains a single field whose type is int.
  public static ArrayList<Integer> buildRandomList(int size, int maxval)
  {
    ArrayList<Integer> buildArray = new ArrayList <Integer>();
    Random rand = new Random();//Random object is a random number generator
    for (int i = 0; i<size;i++)// i is the value, size # of times, i increments by 1
    {
      buildArray.add(rand.nextInt(maxval));//() happens first with a random number generated and then added to the arraylist ....// Generate a random # including 0 and up to but not including maxval.  // add that random integer to buildArray.
    }
    return buildArray;//placeholder to compile. This is needed bc in the method we named ArrayList (an object) as being return
  }

  /**
  Parameters:
  - dataList - an ArrayList of integer values.
  Returns:
  - The sum of all of the elements of the ArrayList.
  */
  public static int sumOfList(ArrayList<Integer> dataList){
   int sum = 0;
    for (int i=0; i<dataList.size(); i++)
    {
        sum = sum + dataList.get(i);
    }
    
    return sum;//placeholder to compile.
  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - index1, index2 - the two locations to swap.
  Preconditions:
  - index1 and index2 are valid indecies of dataList
  Postconditions:
  - The ArrayList is modified such that
    The value that was in dataList[index1] is now in dataList[index2], and
    the value  that was in dataList[index2] is now in dataList[index1].
  - No other values should be modified.
  */
  public static void swapElements(ArrayList<Integer> dataList, int index1,int index2){
   int temp = dataList.get(index1); //put value of index1 in temp
   dataList.set(index1, dataList.get(index2)); //set index1 to the value of index 2
  dataList.set(index2, temp); // set index2 to the value of temp
  }

  /**
  Parameters:
  - dataList - an AraryList of Integers
  - valueToRemove - the value to remove
  Postconditions:
  - The dataList is modified such that all occurances of valueToRemove are removed.
  */
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove){
 for(int i= 0; i < dataList.size();i++)
 {
   if(dataList.get(i) == valueToRemove)
   {
     dataList.remove(i);
   }
 }
  }


  /**
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Preconditions:
  - ListA and ListB have equal lengths.
  Returns:
  - A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
    e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    return null;//placeholder to compile.
  }

  /** zipLists
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Returns:
  - A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
    When one list has no more values to add, continue adding the remaining values of the longer list.
    e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    return null;//placeholder to compile.
  }




public static void main(String[] args) {

    ArrayList<Integer> al;

    //Uncomment these to test buildRandomList and sumOfList
    al = buildRandomList(10,100);
    System.out.println("The sum of list: " +sumOfList(al));
    System.out.println(al);

    //Uncomment these to test swapElements
    swapElements(al,2,6); // NOTE: had to include al
    System.out.println(al);
   
    // Uncomment these to test removeValue
    al.add(5);
    al.add(10);
    al.add(5);
    al.add(13);
    al.set(2,5);
    al.set(3,5);
    System.out.println(al); //NOTE:  this was listed as a, not al
    removeValue(al,5);
    System.out.println(al); //NOTE:  this was listed as a, not al

  }



}