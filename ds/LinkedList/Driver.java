/* Collaborators (room 14):
* Shana Elizabeth Henry, Christoper de Silva, Ashley Ufret, Kate Maschmeyer
*
*/

import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("Chris");
    l.add("Kate");
    l.add("Shana");
    System.out.println(l);
    for (int i =0; i<4; i++){
      System.out.println("Value at index " + i + ": " + l.get(i)); //get gives the value at a specific index getData gets the list
    } 

    System.out.println("Size of list l: " + l.size());
    System.out.println(" Insert Ashley into list");
    l.add(2,"Ashley");
    System.out.println(l);
    System.out.println("The index of Kate is: " +l.indexOf("Kate"));
    System.out.println("This index is not in LinkedList: " +l.indexOf("Mike"));


     String[] a = l.toArray();
    for(int i = 0; i < a.length; i++) {
      System.out.println("a[" + i +"]: " +a[i]);
    }
    

  }
}