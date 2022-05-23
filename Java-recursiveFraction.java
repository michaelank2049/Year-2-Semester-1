/*
Michael Lankford
Homework 3 Problem 1A

1. Create variables
2. Ask user for integer
3. Call method
4. Calculate output
5. Print output

*/

import java.util.Scanner;


public class RecursiveFraction 
{
    public static double rFract(int n, double total)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            total = (double)1 / n + rFract(n - 1, total);
        }    
        return total;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer.");
        int n = input.nextInt();
        double total = 0;
        System.out.printf("The output is: %f", rFract(n, total));
    }
}
