import java.util.Scanner;

public class TrafficLight
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("First letter should be Capital");
        System.out.print("Enter the Light Color:");
        String color = input.nextLine();
        switch (color)
        {
            case "Red":
                System.out.println("You have to stop");
                break;
            case "Yellow":
                System.out.println("You have to Wait and also get Ready");
                break;
            case "Green":
                System.out.println("You can Go now");
                break;
            default:
                System.out.println("Invalid input");
        }
    }

}
