/*
Michael Lankford
Homework 3 Problem 3

1. Create array
2. Call method
3. Method searches to see if given element is in array
4. Return value

*/

public class BinarySearch 
{
    public static <AnyType extends Comparable<? super AnyType>> int binarySearch( AnyType [] a, AnyType x ) 
    {
        return binarySearch( a, x, 0, a.length - 1);
    }
    
    private static <AnyType extends Comparable<? super AnyType>> int binarySearch( AnyType [] a, AnyType x, int low, int high ) 
    {
        if (low > high) 
        {
            return -1; // NOT FOUND
        }
        int mid = (low + high) / 2;
        
        if (a[mid].compareTo(x) < 0)
        {
         return binarySearch(a, x, mid + 1, high);
        }
        else if (a[mid].compareTo(x) > 0)
        {
            return binarySearch(a, x, low, mid - 1);
        }
        else
        {
            return mid;
        }
    }
    
    public static void main(String[] args) 
    {
        String[] list1 = {"John", "Katlyn", "Lucy", "Casey", "Luke", "Kennedy"};
        System.out.println(binarySearch(list1, "Lucy"));
        
        String[] list2 = {"Clint", "Lake", "Bruce", "Casey", "Harley", "Kennedy"};
        System.out.println(binarySearch(list2, "Bruce"));
        
        Integer[] list3 = {1, 2, 3, 8, 12, 41};
        System.out.println(binarySearch(list3, 12));
        
        Integer[] list4 = {352, 3432, 864, 214};
        System.out.println(binarySearch(list4, 1));
    }
}










