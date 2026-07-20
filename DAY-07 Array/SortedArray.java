import java.util.Scanner;

public class SortedArray
{
     public static void main(String[] args)
     {
         int[] arr=Arrayutility.inputarray();
         boolean sorted=true;
         for (int i = 1; i < arr.length; i++)
         {
             if(arr[i]<arr[i-1])
             {
                 sorted=false;
             }
         }
         if(sorted)
         {
             System.out.println("Array is sorted");
         }else
         {
             System.out.println("Array is not sorted");
         }
     }
}
