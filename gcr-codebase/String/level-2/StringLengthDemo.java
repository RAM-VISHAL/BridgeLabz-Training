import java.util.*;

class StringLengthDemos{

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {   // infinite loop
                str.charAt(count);  // try to access character
                count++;            // increment if successful
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input using next() (single word)
        System.out.println("Enter a string:");
        String str = sc.next();

        // User-defined method
        int userLength = findLength(str);

        // Built-in method
        int builtInLength = str.length();

        // Display results
        System.out.println("User-defined length : " + userLength);
        System.out.println("Built-in length     : " + builtInLength);

        // Compare results
        if (userLength == builtInLength) {
            System.out.println("Both methods give equal result.");
        } else {
            System.out.println(" Results are not equal.");
        }
    }
}