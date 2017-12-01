/*  File: ArrayRecursion.java
 *
 *  Programmer: Octavio Avila-Cardet
 *
 */

import java.util.Random;

class ArrayRecursion
{
   // instance var's

   private int[] list;		// array of ints
   private int count = 0;	// number of elements used

   /**
    * Create an ArrayRecursion object. Create an array with between 10 and 15
    * elements, and fill it with random positive 2-digit ints
    */
   public ArrayRecursion()
   {
      Random r = new Random();
      count = r.nextInt(6) + 10;
      list = new int[count];

      for (int i = 0; i < count; i++)
      {
         list[i] = r.nextInt(90) + 10;
      }
   }

   /*
    * Return the list as a string
    * @return a string containing all ints stored in list
    */
   public String toString()
   {
      String out = "";
      for (int i = 0; i < count; i++)
      {
         out += list[i] + "  ";
      }
      return out + "\n";
   }

   /**
    * Reverse the order of the values stored in the list. (called by client to
    * reverse list using first algorithm)
    */
   public void reverse()
   { 
      reverseRecurse(list, 0, count);
   }

   // recursive "helper" method to reverse the values stored in the list 
   // (called by public method reverse1())
   private void reverseRecurse(int[] list, int start, int count)
   {
       int temp = 0;
       
       if (count-1 == start || count == start)
       {
           
       }
       else
       {
        temp = list[start];
        list[start] = list [count-1];
        list[count-1] = temp;
        start++;
        count--;
        reverseRecurse(list,start,count);
       }
       
       
   }

   /*
    * Returns the index of the largest value in the array.
    * @return the index of the largest value in the array
    */
   public int getIndexOfLargest()
   {
      return recursiveGetIndexOfLargest(list, count);
   }

   // recursive "helper" method to return index of largest value
   // (called by public method getLargest())
   private int recursiveGetIndexOfLargest(int[] list, int count)
   {
      return -999;   // bogus value to enable program skeleton to run
   }

   /*
    * Sort the array in ascending order using the selection sort
    */
   public void sort()
   {
      recursiveSort(list, count);
   }

   // recursive "helper" method to sort the array
   // (called by public method sort())
   private void recursiveSort(int[] list, int count)
   {
   }
}

/**
 * A test class for the ArrayRecursion class
 */
public class ArrayRecursionTest
{

   public static void main(String[] args)
   {
      ArrayRecursion list = new ArrayRecursion();

      System.out.println("\nOriginal:  " + list);
      list.reverse();
      System.out.println("\nReversed:    " + list);
      System.out.println("Largest value is at index: "
              + list.getIndexOfLargest());
      list.sort();
      System.out.println("\nSorted:    " + list);
   }
}