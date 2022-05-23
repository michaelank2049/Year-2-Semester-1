/*
Michael Lankford
Homework 1 Question 1

1. Create varaibles
2. Ask user for grade
3. Code decides which letter grade corresponds to entered grade
4. output letter grade
5. Code ends or continues looping 

*/

import java.util.Scanner;

public class LetterGrade 
{
    public static void main(String[] args)
    {
        
    //Create Scanner
        Scanner input = new Scanner(System.in);
        
    //Create number for user input
        int num = 1;
        
    //Start while loop
        while( num >= 1)
        {
            
        //Asks user to input grade
            System.out.println("Input a number from 1-100. "
                    + "Input a number less than 0 to stop. ");
            
        //Assigns input to num
            num = input.nextInt();
            
        //If and else statements to output letter grade
            if(num > 0)
            {
                if(num <= 60)
                {
                    System.out.println("F\n");
                }
                else
                {
                    if(num <= 70)
                    {
                        System.out.println("D\n");
                    }
                    else
                    {
                        if(num <= 80)
                        {
                            System.out.println("C\n");
                        }
                        else
                        {
                            if(num <= 90)
                            {
                                System.out.print("B\n");
                            }
                            else
                            {
                                if(num <= 100)
                                {
                                    System.out.print("A\n");
                                }
                            }
                        }
                    }
                }    
            }            
        }
        
        System.out.println("Have a nice day!");
    }
}
