import java.util.*;
public class StringCharComparison{


    // Convert String to char[] manually
    public static char[] userDefineCharArr(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    // Compare two char arrays
    public static boolean compareToCharArr(char arr1[], char arr2[]) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter String :");
        String str = sc.nextLine();

        // User-defined char array method
        char[] userDefine = userDefineCharArr(str);

        // Built-in method
        char[] buildIn = str.toCharArray();

        // Compare both
        boolean isEqual = compareToCharArr(userDefine, buildIn);

        // Display results
        System.out.println("User-defined char array:");
        for (char c : userDefine) {
            System.out.print(c + " ");
        }

        System.out.println("Built-in char array:");
        for (char c : buildIn) {
            System.out.print(c + " ");
        }

        // Compare both methods
        if (isEqual) {
            System.out.println("Both methods give Equal results.");
        } else {
            System.out.println("Both methods give Different results.");
        }
    }
}