import java.util.*;

public class CheckNumberPNZ {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Array input
        System.out.println("Enter 5 numbers:");
        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // Check Positive, Negative, Zero and Even/Odd
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is Positive and Even");
                } else {
                    System.out.println(arr[i] + " is Positive and Odd");
                }
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            } else {
                System.out.println(arr[i] + " is Zero");
            }
        }
         
        // Compare first and last element
        int first = arr[0];
        int last = arr[4];

        if (first == last) {
            System.out.println("First and Last are Equal: " + first);
        } else if (first > last) {
            System.out.println("First number is Greater: " + first);
        } else {
            System.out.println("Last number is Greater: " + last);
        }
    }
}
