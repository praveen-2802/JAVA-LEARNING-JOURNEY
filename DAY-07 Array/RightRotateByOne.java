import java.util.Scanner;

public class RightRotateByOne
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
        int last=arr[n-1];
        for (int i = n-1; i >=1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);}
    }
}
