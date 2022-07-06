/**
 * Game of Nim by Team FirstLadies
 * Sarah McCoy
 * collaborators: Yeidy Levels, Stacy Goldstein, Ashley Ufret
 */
import java.io.*;
import java.util.*;

public class Nim
	{
		public static void main(String[] args) 
		{
			int stones = 12;
			int stonesTaken; //declaring this...user will give value
			Scanner input = new Scanner(System.in);
			//loop until game ends
			while(stones > 0) {
				//prompt user input
				System.out.println("There are " + stones + " stones in the pile.  How many would you like to take? You may take 1, 2, or 3 stones");
				stonesTaken = input.nextInt();
					//calculate number of stones remaining, print
				stones = stones - stonesTaken;
				System.out.println("You took " + stonesTaken+ ". There are now " + stones + " stones left in the pile. ");
					//check for win
				if (stones == 0)
					{
					System.out.println("You took the last stone! You won!");
					}
					//machine turn
				else {
					if (stones > 3){
						Random random = new Random();
        		stonesTaken = random.nextInt(3)+1;
				
					}else{
						stonesTaken = 3;
					}
				
				//calculate number of stones remaining, print
				stones = stones - stonesTaken;
				System.out.println("The machine took " + stonesTaken + " stones. There are now " + stones + " stones left in the pile. "  );
					//check win
				if (stones == 0)
					{
					System.out.println("The machine took the last stone! You lost!");
					}
					
				}
				
			}
			
		}
		
	}