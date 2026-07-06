import java.util.Scanner;

public class Restaurantbill
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Pizza      -250:");
        System.out.println("2.Burger     - ₹120");
        System.out.println("3.Sandwich   - ₹100");
        System.out.println("4.Cold Drink - ₹40");
        System.out.print("Enter the item num:");
        int num = input.nextInt();
        System.out.print("How much you want:");
        int how = input.nextInt();
        int total=0;
        switch (num)
        {
            case 1:
                total=250*how;
                System.out.println(100);
                System.out.println("Total bill: "+total);
                break;
            case 2:
                total=120*how;
                System.out.println("Burger");
                System.out.println("Total bill: "+total);
                break;
            case 3:
                total=100*how;
                System.out.println("Sandwich");
                System.out.println("Total bill: "+total);
                break;
            case 4:
                total=40*how;
                System.out.println("Cold Drink");
                System.out.println("Total bill: "+total);
                break;
            default:
                System.out.println("Invalit item");
        }
    }
}
