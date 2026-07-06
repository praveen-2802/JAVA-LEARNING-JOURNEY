import java.util.Scanner;

public class Studentportal
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====== STUDENT PORTAL =======");
        System.out.println("1.View Student Details:");
        System.out.println("2.View Marks");
        System.out.println("3.View Attendance");
        System.out.println("4.View Fees");
        System.out.print("Enter the num:");
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println("Name= Praveen\nRoll no= 1558\nBranch= cse");
                break;
            case 2:
                System.out.println("English=88\nMaths=55\nJava=82");
                break;
            case 3:
                System.out.println("Attendence = 78%");
                break;
            case 4:
                System.out.println("Fees= 1,37,500 per sem");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
