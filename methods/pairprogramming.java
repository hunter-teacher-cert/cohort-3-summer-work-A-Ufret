//Collaborators: Steven Sabaugh and Ashley Ufret

import java.io.*;
import java.util.*;
class BarGraph {
  public static String[] barGraphify(int [] arr){

    String [] resultString = new String [arr.length];


 //initialize all elements to empty string to avoid 'null' to be cat with =
    for(int i = 0;i < arr.length;i++){
      resultString[i] = "";
    }
    
    
    for (int i = 0;i < arr.length;i++){
      for (int j = 0;j < arr[i];j++){
           resultString[i] += "=";
         
      } 
    }
    return resultString;
  }
  public static void main(String [] args){

    //int num = 3;
    int [] nums = {0, 1, 2, 3};
    int [] nums2 = {1, 0, 3, 2};

    String [] barGraph1 = barGraphify(nums);
    String [] barGraph2 = barGraphify(nums2);
    //System.out.println(barGraph1[0]);
    //System.out.println();
    //System.out.println(barGraph2[0]);
    //System.out.println();


    
    
    for (int i = 0;i < barGraph1.length;i++){    
      
      System.out.println(i + ": " + barGraph1[i]);
    }
    System.out.println();

    for (int i = 0;i < barGraph2.length;i++){
      
      System.out.println(i + ": " + barGraph2[i]);
    }
  }
}