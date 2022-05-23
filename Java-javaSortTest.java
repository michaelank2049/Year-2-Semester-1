/*
Michael Lankford
Homework 4

1. Prompt user for sorting option
2. Create array to be sorted
3. Choose sorting algorithm with switch case
4. Run algorithm
5. Output each pass from algorithm

*/

import java.util.Scanner;

public class JavaSortTest 
{
    public static void main(String[] args)
    {
    //Prompt user for sorting option
        Scanner input = new Scanner(System.in);
        System.out.println("Select a sorting option by typing in its name.");
        System.out.println("The available options are: Bubble Sort, Insertion Sort, "
                + "Shell Sort, Merge Sort, and Quick Sort.");
        String userSort = input.nextLine();
     
    //Create array
        int[] a = new int[13];
        int min = 1;
        int max = 99;
        for(int i = 0; i < a.length; i++)
        {
            a[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        
        switch(userSort)
        {
            case "Bubble Sort":
                JavaSort.bubbleSort(a);
                break;
                
            case "Insertion Sort":
                JavaSort.insertionSort(a);
                break;
                
            case "Shell Sort":
                JavaSort.shellSort(a);
                break;
                
            case "Merge Sort":
                JavaSort.mergeSort(a, 0, a.length - 1);
                break;
                
            case "Quick Sort":
                JavaSort.quickSort(a, 0, a.length - 1);
                break;
        }
        
    }
}
