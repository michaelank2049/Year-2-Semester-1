/*/*
Michael Lankford
Homework 2 Problem 3

1. Create scanner and arrays
2. Prompt user for array length and values
3. Clone array for max and min methods
4. Calculate max and min and add values to array
5. Print original array 
6. Print each pass of array

*/

import java.util.Scanner;
import java.util.Arrays;

public class SortingArray 
{

//Find max method
    public static int getMax(int[] ArrayMax, int i)
    {
        int max = ArrayMax[i];
        int val = ArrayMax[i];
        int maxIndex = 0;
 
    //Find array max value    
        for (int j = i; j < ArrayMax.length; j++) 
        {
            if(ArrayMax[j] > max)
            {
                max = ArrayMax[j];
                maxIndex = j;
            }
        }
     
    //Return max value    
        ArrayMax[i] = max;
        ArrayMax[maxIndex] = val;
        return max;
    }   
    
//Find min method
    public static int getMin(int[] ArrayMin, int i)
    {
        int min = ArrayMin[i];
        int val = ArrayMin[i];
        int minIndex = 0;
 
    //Find array min value
        for (int j = i; j < ArrayMin.length; j++) 
        {
            if(ArrayMin[j] < min)
            {
                min = ArrayMin[j];
                minIndex = j;
            }
        }
       
    //Return min value    
        ArrayMin[i] = min;
        ArrayMin[minIndex] = val;
        return min;
    }   

    public static void main(String[] args)
    {
        
    //Create scanner for user input
        Scanner input = new Scanner(System.in);
        
    //Ask user for array size    
        System.out.println("How big of an array do you want?");
        int ArraySize = input.nextInt();
        int[] Array = new int[ArraySize];
        
    //Add integers to array    
        for(int i = 0; i < ArraySize; i++)
        {
            System.out.println("Enter integer for array.");
            Array[i] = input.nextInt();
        }
        
    //Clone array for max and min methods    
        int[] ArrayMin = Array.clone();
        int[] ArrayMax = Array.clone();
        
    //Create array for sorted values    
        int[] SortedArray = new int[ArraySize];
        
    //Print original array    
        System.out.printf("Input Array: %s%n", Arrays.toString(Array));
   
        int g = 1;
        
    //Print array passes   
        for (int i = 0; i < Array.length; i++) 
        {
            SortedArray[i] = getMin(ArrayMin, i);
            SortedArray[Array.length - g] = getMax(ArrayMax, i);
            g++;
            
            if(i < ((Array.length)/2) && ((Array.length % 2) == 0))
            {
                System.out.printf("Pass %d: %s%n", i+1, Arrays.toString(SortedArray));
            }
           
            if(i < 1 + ((Array.length)/2) && ((Array.length) % 2) != 0)
            {
                System.out.printf("Pass %d: %s%n", i+1, Arrays.toString(SortedArray));
            }
        }
    }
}
