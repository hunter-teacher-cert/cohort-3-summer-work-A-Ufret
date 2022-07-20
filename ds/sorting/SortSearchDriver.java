/* Task (July 19-20, 2022): SortSearch and SortSearch Driver
Group: Room 2
Collaborators: Yeidy Levels, Kate Maschmeyer, Davide Moste, and Ashley Ufret */


import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	
	SortSearch ss = new SortSearch(20);
	System.out.println("Original Random Array:\n" + ss);
  System.out.println("-----------------");
	
		
	// Uncomment these to test part 2

	int i;
	i = ss.findSmallestIndex(0);
	System.out.println("Starting at Index 0, your smallest search (ss) found the smallest value at Index["+ i +"] with the value = "+ss.get(i)+" : " + ss);
  System.out.println("-----------------");

	i = ss.findSmallestIndex(10);
	System.out.println("Starting at Index 10 your smallest search (ss) found the smallest value at Index["+ i + "] with the value = "+ss.get(i)+" : " + ss);
  System.out.println("-----------------");
	
	// Uncomment these to test part 3 (the sort search)

	System.out.println("Original Random Array:\n" + ss);
	ss.sort();
	System.out.println("Random Array After Sort (Min to Max):\n" + ss);
	


	      

    }
}