/*
Michael Lankford
Homework 3 Problem 4

1. Declare variables
2. Call method
3. Method calculates gcd
4. Output gcd

*/

public class GreatestCommonDevisorTest 
{
    public static long gcd(long a, long b)
    {
        if(b == 0)
        {
            return a;
        }
        else
        {
            return gcd(b, a % b);
        }
    }
    
    public static void main(String[] args)
    {
        int a = 154;
        int b = 973;
        System.out.println(gcd(a, b));
    }
}








