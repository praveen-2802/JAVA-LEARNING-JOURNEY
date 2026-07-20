import java.util.Scanner;

public class CountEvenOdd
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Size:");
        int n = input.nextInt();
        System.out.print("Enter Element:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        int evencount=0;
        int oddcount=0;
        for (int i = 0; i <n ; i++)
        {
          if (arr[i]%2==0)
          {
              evencount++;
          }
          else
          {
              oddcount++;
          }
        }
        System.out.println("Even = "+evencount);
        System.out.println("Odd = "+oddcount);
    }
}
