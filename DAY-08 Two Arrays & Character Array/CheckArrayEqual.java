public class CheckArrayEqual
{
    public static void main(String args[]) {
        int[] arr1 = Arrayutility.inputarray();
        int[] arr2 = Arrayutility2.inputarray2();
        int min;
        if (arr1.length !=arr2.length) {
            System.out.println("Arrays are not equal");
        } else {
            boolean check = true;

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Both arrays are the Equal");

            } else {
                System.out.println("Both arrays are not the Equal");
            }
        }
    }
}
