import java.util.Scanner;

public class Arrayutility
{
    public static int[] inputarray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        return arr1;
    }
    public  static void displayarray(int[] arr1)
    {
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
