import java.util.Scanner;

public class MaxandMin
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Size:");
        int n= input.nextInt();
        System.out.print("Enter Element:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int max =arr[0];
        int min=arr[0];
        for (int i = 1; i < n; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Maximum "+max);
        System.out.println("Minimum "+min);
    }
}

