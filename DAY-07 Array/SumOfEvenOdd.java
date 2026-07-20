import java.util.Scanner;

public class SumOfEvenOdd
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Size:");
        int n = input.nextInt();
        System.out.print("Enter Element:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int evensum=0;
        int oddsum=0;
        for (int i = 0; i <n ; i++)
        {
            if (arr[i]%2==0)
            {
                evensum=evensum+arr[i];
            }
            else
            {
                oddsum=oddsum+arr[i];
            }
        }
        System.out.println("Even Sum = "+evensum);
        System.out.println("Odd Sum = "+oddsum);
    }
}
