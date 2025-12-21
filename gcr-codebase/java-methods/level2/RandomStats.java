public class RandomStats {

    // Method to generate array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates random 4-digit number (1000 to 9999)
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }
        return arr;
    }

    // Method to find average, minimum, and maximum
    public double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;

        return new double[] { average, min, max };
    }

    // Main method
    public static void main(String[] args) {
        RandomStats obj = new RandomStats();

        // Generate 5 random 4-digit numbers
        int[] randomNumbers = obj.generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit Random Numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        // Find average, min, and max
        double[] result = obj.findAverageMinMax(randomNumbers);

        System.out.println("\n\nAverage Value: " + result[0]);
        System.out.println("Minimum Value: " + (int) result[1]);
        System.out.println("Maximum Value: " + (int) result[2]);
    }
}
