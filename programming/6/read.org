#### Work: Gaining Familiarity with Classes via Rational (Number) Class

For this project you'll be completing and testing a class that represents a rational number, and facilites common mathematical operations.

#### Starter files and file locations

This folder has a subdirectory, `rat`, with
- Rational.java (skeleton you will fill in)
- Driver.java - the Driver file you will use to test it

Copy the **rat** directory contents into your own **/programming/6/rat** directory and make the files your own. (Fill in headings, etc)

#### Specifics

You will complete your class in Rational.java and you will write the code to test it in Driver.java (some test code is pre-written for you). Specific requirements and levels are in the Rational.java file.
	
#### Compiling and Running 

You can compile each file using
- `javac Rational.java`
- `javac Driver.java`

or you can compile them both at once using
- `javac Driver.java Rational.java`

To run your program, first compile __both__ .java files, then run using
- `java Driver`

Notice that you only specifiy the Driver on the java line.

```
TEAMS 	for RATIONAL
1	Steve S	Yanique S	Yenmin Y	Latoya B
2	Parmanand M	Yeidy L	usman a	Benjamin E
3	William L	Wayne T	Suzie S	Alicia W
4	Michael R	Tanya W	Sarah M	Alise B
5	Joshua H	Théa W	Patti E	Alana R
6	Kate M	Saranii M	Nicole C	Ashley U
7	Jihae P	Richard P	Seth A	Rachel K
8	Jessica N	Vanessa Z	Maxwell Y	Adam P
9	Kiana H	Mike P	Marieke T	Greg S
10	Erwin L	Shana Elizabeth H	Jing X	Joel B
11	Ed H	Kirk M	Dave C	Taylor G
12	Charles D	Jerusha T	Aasine C	stacy G
13	Christopher D	Jenna L	Harrison F	Sam L
14	adam d	Elizabeth R	David M	#N/A
15	Amanda L	Christine M	Marisa S	#N/A
```

* * *

#### Work: Implement SuperArray class

All SuperArray files are in the  **sa** subdirectory (folder)

#### Starter Files:

- SuperArray.java  - complete as much of this class as you can.
- SuperArrayDriver.java - the Driver file with main. Test your
  SuperArray class from here.

#### Other Files:
- subgoals0.java - subgoals for the SuperArray class. You may find it helpful to keep this file open, separately, as a to-do list (optional).
- encapsulation00.jpg - a visual diagram of a SuperArray. You are strongly encouraged to make your own like it, and refer to them as you implement your methods. _Breath life into your diagrams_ by using them as focal point of team discussions, marking them up, re-drawing them as necessary. Feel free to share in `#flex-your-kts`.

#### Instructions 

Copy the **sa** directory into your own **/programming/6/sa** directory and make the files your own. (Fill in headings, etc)

##### Compiling and Running

You can compile each file using

- javac SuperArray.java
- javac SuperArrayDriver.java

or you can compile them both at once using

- javac SuperArrayDriver.java SuperArray.java

To run your program, first compile *both* .java files, then run using:
- java SuperArrayDriver 

#### Specifics

Your SuperArray is a class that contains an array which will store int data. The reason to use our SuperArray instead of a plain array is that our SuperArray will allow fo the following:
- If you add to the end and there's no more room in the array, it will
  make a new, larger array (your code will have to do this).
- If you remove an item from the array, it will shift items down to
  fill the gap.
  
##### Basic 
- Add these methods 
  - SuperArray() - a basic constructor which will create a new array
    of size 10 and assign data to refer to it. Set the numberElements
    variable to 0.
  - SuperArray(int size) - create a new array of size and assign data
    to refer to it. Set the numberElements variable to 0.  0-
  - add(int value) -adds value to the end of the SuperArray (after the
    last added element)
  - isEmpty() - return true if the SuperArray is empty, false otherwise.
  
##### Intermediate
- First, add these methods
  - Write a methods grow() that will enlarge the SuperArray. It should:
	- Create a new array, 5 units larger
	- Copy the old data to the new array
	- Set the data instance variable to point to the new array
	
- Modify these methods
  - Modify add(int value) so that if the data array is filled it will
	1. First grow the array using the grow method you just wrote.
	2. Add the new value to the array.

- Then add this method
  - get(index) - return the value at location index
  
##### Advanced
  - Write these methods: 
    - add(index,value) which will add value at location index. You
	  should shift the data to create an open space if you need to and
	  you can use grow() if you need to make the array larger.
    - remove(index) - remove the location at index by shifting all the
      elements after location index and subtracting one from numberElements
  
  
  


