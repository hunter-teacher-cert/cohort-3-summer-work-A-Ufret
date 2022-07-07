/**
 * nth Fibonacci number generator by Team 13 (July 7, 2022)
 * Yenmin Young
 * collaborators: Ashley Ufret, Jenna Lin, Erwin Lara
 */

public class Fib
{
  public static int fib(int x){ //creating method for fib Note: ps int (not ps void) for this method b/c we are looking for a return 
    if (x == 0) {
      return 0;
    }
    if (x == 1){ //2 base cases for fibanocci (in Williams example on slide deck it looked like only one condition because he had if (x == 0 && x==1) {return x;}                           <--AU NOTE: ASK whether && here SHOWS "OR"
      return 1;
    }
    else {
      return fib (x - 1) + fib (x - 2); //recursion referring to adding the numbers to follow fibanocci sequence
    }
  }

  //your implementation of fib(n) here


  public static void main( String[] args )
  {
    for (int i=0; i<25; i++){
      System.out.println(fib(i));
    }
    
      // System.out.println( fib(0) ); // -> 0
      // System.out.println( fib(1) ); // -> 1
      // System.out.println( fib(2) ); // -> 1
      // System.out.println( fib(3) ); // -> 2
      // System.out.println( fib(4) ); // -> 3
      // System.out.println( fib(5) ); // -> 5
      // System.out.println( fib(6));

      // System.out.println( fib(10) ); // -> 55
      // System.out.println( fib(20) ); // -> 6765
      // System.out.println( fib(40) ); // -> 102334155

  }//end main()

}//end class Fib