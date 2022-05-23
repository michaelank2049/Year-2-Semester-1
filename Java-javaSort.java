/*
Michael Lankford
Homework 4

1. Prompt user for sorting option
2. Create array to be sorted
3. Choose sorting algorithm with switch case
4. Run algorithm
5. Output each pass from algorithm

*/

import java.util.Arrays;

public class JavaSort 
{
    public static int counter_qs = 0;
    public static int counter_ms = 0;
    
//Bubble Sort Algorithm from https://www.geeksforgeeks.org/bubble-sort/
    public static void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1]) 
                { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
            }

            System.out.print("Pass " + (i + 1) + ": [");
            for(int k = 0; k < n; k++)
            {
                System.out.print(" " + arr[k]);
            }
            System.out.print(" ]\n");
        } 
    } 
    
    
//Insertion Sort Alogrithm from https://www.geeksforgeeks.org/insertion-sort/
    public static void insertionSort(int[] arr)
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) 
        { 
            int key = arr[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arr[j] > key) 
            { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
            
            System.out.print("Pass " + (i) + ": [");
            for(int k = 0; k < n; k++)
            {
                System.out.print(" " + arr[k]);
            }
            System.out.print(" ]\n");
        } 
    }
    
    
//Shell Sort Algorithm from https://www.geeksforgeeks.org/shellsort/
    public static void shellSort(int[] arr)
    {
        int n = arr.length; 
        int count = 0;
  
        for (int gap = n/2; gap > 0; gap /= 2) 
        {  
            for (int i = gap; i < n; i += 1) 
            { 
                int temp = arr[i]; 
  
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                {
                    arr[j] = arr[j - gap]; 
                }
  
                arr[j] = temp; 
            }
            count++;
            System.out.printf("Pass %d: %s %n", count, Arrays.toString(arr)); 
        } 
    }
    
    
//Merge Sort Algorithm from https://www.geeksforgeeks.org/merge-sort/
    public static void mergeSort(int[] arr, int l, int r) 
    { 
        if (l < r) 
        { 
            int m = (l + r) / 2; 

            mergeSort(arr, l, m); 
            mergeSort(arr, m + 1, r); 
            mergeArray(arr, l, m, r); 
            
            System.out.printf("Pass %d: %s %n", JavaSort.counter_ms, Arrays.toString(arr));
        } 
    } 
    public static void mergeArray(int[] arr, int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
        
        for (int i = 0; i < n1; ++i) 
        {
            L[i] = arr[l + i]; 
        }
        
        for (int j = 0; j < n2; ++j) 
        {
            R[j] = arr[m + 1 + j];
        }
  
        int i = 0;
        int j = 0; 

        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++;     
            } 
            else 
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            
            k++; 
        } 

        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
        JavaSort.counter_ms++;
    }   
    
//Quick Sort Algorithm from https://www.geeksforgeeks.org/quick-sort/
    public static void quickSort(int[] arr, int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = quickArray(arr, low, high); 
            quickSort(arr, low, pi-1); 
            quickSort(arr, pi+1, high); 
        } 
    } 
    public static int quickArray(int[] arr, int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1);  
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++;
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        JavaSort.counter_qs++;
        System.out.printf("Pass %d: %s %n", JavaSort.counter_qs, Arrays.toString(arr)); 
        return i+1; 
    } 
}
