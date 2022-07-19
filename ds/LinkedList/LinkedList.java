import java.io.*;
import java.util.*;

/* Collaborators (room 14):
* Shana Elizabeth Henry, Christoper de Silva, Ashley Ufret, Kate Maschmeyer
*
*/


/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).

Basic
-----
add(string value) Done 
get(int index); Done
toString() Done


Intermediate (at least add, size + one of the other two)
------------
size() Done
add(int index,String value) Done
indexOf(String value); Done
toArray()


Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  /**
  Parameters:
  value - the new string to add to the list

  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
    Node temp = new Node(value);
    temp.setNext(head);
    head = temp; 

  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index){
    Node walker = head;
    String temp = "Invalid Index";
    int count = 0;
    
    if(index < 0 ) { // badness
      return temp;
    }
    
    while (walker != null && count <= index){
      if (count == index) {
        temp = walker.getData();
      }
      walker = walker.getNext(); 
      count++;
    }
    return temp;
  }

  /**
  Return a string representation of the list
  */
  public String toString(){
    String temp = "";
    Node walker = head; 
    while(walker != null){
     temp = temp + walker; // eqv to temp += walker;
     walker = walker.getNext();
    }
    temp = temp + "null";
    return temp; 
  }

  
  public int size(){
    int count = 0;
    Node walker = head;
    while (walker != null){
      count++;
      walker = walker.getNext();
    }
    return count;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
        z
    "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  EXAMPLE:
  add(2, "q"):

  work:
            q
  "a"-> "z" -> "b" -> "c" -> "d"



  */
  public void add(int index, String value){
    if(index == 0 ) {
      this.add(value);
    } else if(index < 0 || index > this.size()) {
      System.out.println("Invalid index.  Nothing added");
    } else {
       int count = 0;
        Node walker = head;
        Node temp = new Node(value);
    
        while (walker != null && count <= (index - 1)){
          if(count == (index - 1) ) {
            temp.setNext(walker.getNext()); // z's next is b
            walker.setNext(temp); // a's next is z
          } 
          walker = walker.getNext();
          count++; 
        }
    }
    
   

  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  public int indexOf(String value){
    Node walker = head;
    int count = 0;
    while (walker.getData() != value){
      count++;
      walker = walker.getNext();
      if (walker.getNext() == null){
        System.out.println(value +" is not in LinkedList");
        return -1;
      }
      
    }
    return count;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  public String[] toArray(){
    String[] arr = new String[size()];
    Node walker = head;
    
    for (int i=0; i<arr.length; i++)
    {
    arr[i] = walker.getData();
    walker = walker.getNext();
    }
    return arr;
  }



  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
    Node walker = head;
    int count = 0;
    while (walker != null && count != index)
  }
}