import java.util.Scanner;

public class LeftRotateByOne
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
        int first=arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = first;
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);}
    }
}
