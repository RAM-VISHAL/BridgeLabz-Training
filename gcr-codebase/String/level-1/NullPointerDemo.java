public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;  // variable initialized to null

        // Trying to call a method on null reference

        System.out.println("Length of text: " + text.length()); 
        // This line will throw NullPointerException
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null;  // variable initialized to null
        try {
            // Attempting to call a method on null reference
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            // Handling the exception gracefully
            System.out.println("Caught NullPointerException: Cannot call methods on a null object!");
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("=== Generating Exception ===");
        // This will throw an exception and terminate program if not caught
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("Handling Exception ");
        // This will safely handle the exception
        handleException();
    }
}