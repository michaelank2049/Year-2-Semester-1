/*/*
Michael Lankford
Homework 2 Problem 2
Compare run times between algorithms
*/

import java.util.Random;

public class CompareAlgorithmsTest 
{
    public static final int ArraySize = 200;
    public static final int min = -10;
    public static final int max = 10;
    
//Cubic max contigious subsequence sum algorithm
    public static int maxSubsequenceSum1(int[] numbers)
    {
        int maxSum = 0;
        
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i; j < numbers.length; j++)
            {
                int thisSum = 0;
                
                for(int k = i; k <= j; k++)
                {
                    thisSum += numbers[k];
                }
                
                if(thisSum > maxSum)
                {
                    maxSum = thisSum;
                    int seqStart = i;
                    int seqEnd = j;
                }
            }
        }
        
        return maxSum;
    }
    
//Quadratic max contigious subsequence sum algorithm
    public static int maxSubsequenceSum2(int[] numbers)
    {
        int maxSum = 0;
        
        for(int i = 0; i < numbers.length; i++)
        {
            int thisSum = 0;
            
            for(int j = i; j < numbers.length; j++)
            {
                thisSum += numbers[j];
                
                if(thisSum > maxSum)
                {
                    maxSum = thisSum;
                    int seqStart = i;
                    int seqEnd = j;
                }
            }
        }
        
        return maxSum;
    }
    
//Linear max contihious subsequence sum algorithm
    public static int maxSubsequenceSum3(int[] numbers)
    {
        int maxSum = 0;
        int thisSum = 0;
        
        for(int i = 0, j = 0; j < numbers.length; j++)
        {
            thisSum += numbers[j];
            
            if(thisSum > maxSum)
            {
                maxSum = thisSum;
                int seqStart = i;
                int seqEnd = j;
            }
            else if(thisSum < 0)
            {
                i = j + 1;
                thisSum = 0;
            }
        }
        
        return maxSum;
    }
    
    public static void main(String[] args)
    {
        int[] numbers = new int[ArraySize + 1];
        Random random = new Random();
        
    //Generate numbers and put in array
        for(int i = 0; i < ArraySize; i++)
        {
            numbers[i] = random.nextInt(max - min) + min;
        }
        
    //Execution time
        long startTime1 = System.nanoTime();
        maxSubsequenceSum1(numbers);;
        
        long startTime2 = System.nanoTime();
        maxSubsequenceSum2(numbers);;
        
        long startTime3 = System.nanoTime();
        maxSubsequenceSum3(numbers);;
        long endTime = System.nanoTime();
        
    //Output time in nanoseconds
        System.out.println("The cubic max contigious subsequence sum algorithm took " + (endTime - startTime3) + " nanoseconds");
        System.out.println("The quadratic max contigious subsequence sum algorithm took " + (startTime3 - startTime2) + " nanoseconds");
        System.out.println("The linear max contigious subsequence sum algorithm took " + (startTime2 - startTime1) + " nanoseconds");
    }
}
