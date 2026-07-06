import java.util.Scanner;

public class smallesttwo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First num:");
        int x1 = input.nextInt();
        System.out.print("Enter the Second num:");
        int x2 = input.nextInt();
        if (x1 < x2) {
            System.out.println(x1 + " is Smallest");
        } else if (x1 == x2) {
            System.out.println("Both num are equal");
        } else {
            System.out.println(x2 + " is Smallest");
        }
    }
}
