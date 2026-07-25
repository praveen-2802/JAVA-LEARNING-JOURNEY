import java.util.Scanner;

public class MergeTwoArrayAlternate
{
    public static void main(String[] args)
    {
        int[] arr1= Arrayutility.inputarray();
        int[] arr2= Arrayutility2.inputarray2();
        int[] merge=new int[arr1.length+arr2.length];
           for (int i = 0; i < arr1.length; i++)
           {
               merge[2*i]=arr1[i];
           }
           for (int i = 0; i < arr2.length; i++)
           {
               merge[2*i+1]=arr2[i];
           }
           System.out.println("The merged array is:");
           Arrayutility.displayarray(merge);
     }
}
