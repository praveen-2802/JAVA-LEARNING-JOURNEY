import java.util.Scanner;

public class Arrayutility2
{
    public static int[] inputarray2()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size Second Array:");
            int n = sc.nextInt();
            int[] arr2 = new int[n];
            System.out.print("Enter Elements of Second array:");
            for(int i=0;i<n;i++)
            {
                arr2[i] = sc.nextInt();
            }
            return arr2;
        }
    public  static void displayarray2(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


