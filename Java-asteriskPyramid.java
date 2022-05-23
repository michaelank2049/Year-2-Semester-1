/*
Michael Lankford
Homework 3 Problem 1B

1. Create scanner
2. Ask user for input
3. Call method to print first triangle
4. Print first triangle
5. Call method to print second triangle
6. Print second triangle

*/

import java.util.Scanner;

public class AsteriskPyramid 
{
//First pyramid half
    public static void pattern1(int n, int i)
    {
        if(n == 0)
        {
            return;
        }
        print1(i);
        System.out.println();
        pattern1(n - 1, i + 1);
    }
//Print asterisks
    public static void print1(int num)
    {
        if(num == 0)
        {
            return;
        }
        System.out.print("* ");
        print1(num - 1);
    } 
    
    
//Second pyramid half
    public static void pattern2(int n)
    {
        if(n < 1)
        {
            return;
        }
        print2(n);
        System.out.println();
        pattern2(n - 1);
    }
//Print asterisks
    public static void print2(int num)
    {
        if(num < 1)
        {
            return;
        }
        System.out.print("* ");
        print2(num - 1);
    }
    
//Main method   
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer 1-10 for a bar chart.");
        int n = input.nextInt();
        pattern1(n, 1);
        pattern2(n);
                
    }
    
}
