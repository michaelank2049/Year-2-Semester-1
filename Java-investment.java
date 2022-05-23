/*
Michael Lankford
Homework 1 Question 2

1. Create variables
2. Ask user if they want to change part of their investment
3. Ask user if they want to change interest rate or initial investment
4. Assign new values to interest rate or initial investment
5. If no changes, assign default values
6. Output total value and earned total value
7. Code ends

*/

import java.util.Scanner;

public class Investment 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //Default amounts
            double principalAmount = 0;
            double monthly = 500;
            double intRate = 0;
            int years = 40;
            double total = 0;
            
        //Variables if user wishes to change amounts
            int changeInvest = 0;
            int changeIntRate = 0;
            int changeInvestAmount = 0;
            
        //Ask user if they want to change an investment variable
            System.out.println("Do you want to change part of your investment?"
                    + " If yes, input 1. If no, enter 0.");
            changeInvest = input.nextInt();
            if(changeInvest == 1)
            {
            
            //Ask user if they want to change interest rate    
                System.out.println("Do you want to change the interest rate?"
                        + "If yes, input 1. If no, enter 0.");
                changeIntRate = input.nextInt();
                
            //Assign new interest rate amount if user wants to change    
                if(changeIntRate == 1)
                {    
                    System.out.println("Input new interest rate.");
                    intRate = input.nextDouble();
                }
                
            //Assign default interest rate amount if user doesn't want to change    
                if(changeIntRate == 0)
                {   
                    intRate = .06;
                }
                
            //Ask user if they want to change initial investment    
                System.out.println("Do you want to change the initial investment?"
                        + "If yes, input 1. If no, enter 0.");
                changeInvestAmount = input.nextInt();
                
            //Assign new investment amount if user wants to change    
                if(changeInvestAmount == 1)
                {
                    System.out.println("Input new investment amount");
                    total = input.nextDouble();
                }
                
            //Assign default investment amount if user doesn't want to change    
                if(changeInvestAmount == 0)
                {
                    principalAmount = 2000;
                    total = principalAmount;
                }
            }
            
        //Assign default amounts if user doesn't want to change amounts    
            if(changeInvest == 0)
            {
                principalAmount = 2000;
                total = principalAmount; 
                intRate = .06;
            }
        
        //Start for loop
            for(int i = 1; i <= years; i++)
            {
                System.out.printf("Your total amount invested for year " + i + " is: " + total + "\n");
                total = ((total + (monthly * 12)) * (intRate + 1));
                System.out.printf("Your total amount earned for year " + i + " is: " + total + "\n\n");
            }
    }
}
