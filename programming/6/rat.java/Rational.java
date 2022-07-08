/**
 * Rational class by Team BangPi
 * Saranii Muller
 * collaborators: Kate Maschmeyer, Ashley Jufret, Nicole Cojuango
 */


/**
   class Rational
   An instance of this class will represent a rational number 
//(   p/q          s.t.           p,q                 ints     &&         q!=0), 
//numerator/den such that numerator, denominator are integers and denominator is not == 0 
   and facilitate mathematical operations with another instance of class Rational.

   Basic level (complete all):
   - toString✔️
   - default constructor✔️
   - multiply
   - divide

   Intermediate level (complete Basic methods plus these methods):
   - floatValue
   - overloaded constructor

   Advanced level (complete Basic + Intermediate + these methods):
   -

*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // ✔️basic #2 default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  { /* YOUR ELEGANT CODE HERE */
  _numerator = 0; //only 1 equal sign = needed to assign as equal to vs == checking to be equal to 
  _denominator = 1;   
    
  }


  // Intermediate #2 overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    /* YOUR ELEGANT CODE HERE */
  }


  // ✔️Basic#1 toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
    /* YOUR ELEGANT CODE HERE */

    return(n + "/" + d);
  }

  // Intermediate #1 floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    /* YOUR ELEGANT CODE HERE */
  }


  // Basic #2 multiply
  // takes a Rational parameter and multiplies it by this Rational
  // does not return a value
  // modifies this object
  // does not modify input
  // need not reduce
  public void multiply( Rational r )
  {
    /* YOUR ELEGANT CODE HERE */
  }


  // Bsic #3 divide
  // same as multiply, except operation is division
  public void divide( Rational r )
  {
    /* YOUR ELEGANT CODE HERE */
  }

}//end class