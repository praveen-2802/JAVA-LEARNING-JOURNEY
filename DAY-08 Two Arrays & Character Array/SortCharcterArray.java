import java.util.Scanner;

public class SortCharcterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: ");
        int n = sc.nextInt();
        System.out.print("Enter Characters: ");
        char[] ch = new char[n];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);

        }
        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i] > ch[j])
                {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }
}
