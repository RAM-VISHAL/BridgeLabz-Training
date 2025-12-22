import java.util.*;

public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        // Math.random() generates a double between 0.0 and 1.0
        // Multiply by 900000 and add 100000 to ensure 6-digit range [100000, 999999]
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            set.add(otp);
        }
        // If size of set == length of array, all are unique
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Print OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Validate uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println(" All OTPs are unique!");
        } else {
            System.out.println(" Duplicate OTPs found!");
        }
    }
}