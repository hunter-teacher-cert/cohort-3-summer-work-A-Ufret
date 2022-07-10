import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 * Jenna Lin
 * collaborators: Ashley Ufret, Yenming Young, Erwin Lara.
 */


public class Time 
{
    // Instance Variable(s)
    private int hours;
    private int minutes;
    private int seconds;

    // Default Constructor that takes no arguments. 
    public Time()
    {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;	
    }

    
    // Value Constructor 
    public Time(int hrs, int mins, int secs)
    {
        this.hours = hrs;
        this.minutes = mins;
        this.seconds = secs;
    }
    
      
    public String toString()
    {
	    return String.format("%d:%d:%d", this.hours, this.minutes, this.seconds);
    }

    
    public void set(int hrs, int mins, int secs)
    {
        this.hours = hrs;
        this.minutes = mins;
        this.seconds = secs;
    }

    

    /**
       Parameters:
       - other - a variable of type Time

       modifies this instance to represent the result of adding it and
       the time other.
    */
    public void add(Time other)
    {
        this.hours += other.hours;
        this.minutes += other.minutes;
        this.seconds += other.seconds;

        if (this.seconds >= 60)
        {
            this.seconds -= 60;
            this.minutes += 1;
        }

        if (this.minutes >= 60)
        {
            this.minutes -= 60;
            this.hours += 1;
        }

    }


    /**
       Parameters:
       other - a variable of type Time

       Returns:
       True if this instance and other represents the same time
       false otherwise.
    */
    public boolean equals(Time other)
    {
        return this.hours == other.hours && this.minutes == other.minutes && this.seconds == other.seconds;
    }

    /**
       Parameters:
       other - a variable of type Time

       Returns:
       A positive number if this instance represents a time greater
       than the time of other (this > other)

       A negative number if this instance represents a time less
       than the time of other (this < other)

       0 if the two instances represent the same time.

    */
    
    // Convert time to seconds 
    // public int convertTime (Time other)
    // {
    //     return this.hours * 3600 + this.minutes * 60 + this.seconds;
    // }
    
    public int compareTo(Time other)
    {
	    if (this.hours == other.hours && this.minutes == other.minutes && this.seconds == other.seconds)
        {
            return 0;
        }

      
        else if ((this.hours * 3600 + this.minutes * 60 + this.seconds) > (other.hours * 3600 + other.minutes * 60 + other.seconds))
        {
            return 1;
        }

        else 
        {
            return -1;
        }
    }
    

    
}