public class FootballTeamHeights {

    // Method to generate random heights between 150 and 250 cm
    public int[] generateHeights() {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // 150 to 250
        }
        return heights;
    }

    // Method to find sum of heights
    public int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to find mean height
    public double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            min = Math.min(min, h);
        }
        return min;
    }

    // Method to find tallest height
    public int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            max = Math.max(max, h);
        }
        return max;
    }

    // Main method
    public static void main(String[] args) {
        FootballTeamHeights obj = new FootballTeamHeights();

        int[] heights = obj.generateHeights();

        System.out.println("Heights of Football Players (in cm):");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\n\nShortest Height: " + obj.findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + obj.findTallest(heights) + " cm");
        System.out.println("Mean Height: " + obj.findMean(heights) + " cm");
    }
}
