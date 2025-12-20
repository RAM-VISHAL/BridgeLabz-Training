import java.util.Scanner;

public class FactorsDynamicArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Take input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        //  Initialize array and variables
        int maxFactor = 10;                 // initial size
        int[] factors = new int[maxFactor]; // array to store factors
        int index = 0;                      // index for array

        //  Loop through numbers from 1 to number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // check if i is a factor
                // Step 4: Resize array if full
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2; // double the size
                    int[] temp = new int[maxFactor];
                    // copy old values into temp
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // assign temp back to factors
                }

                //  Store factor
                factors[index] = i;
                index++;
            }
        }

        //  Display factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}