public class Football {

    public static int[] generateRandomHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights();

        System.out.println("Football Team Player Heights (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }

        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);

        System.out.println("\nTeam Height Analysis:");
        System.out.println("Shortest player: " + shortest + " cm");
        System.out.println("Tallest player: " + tallest + " cm");
        System.out.println("Mean height: " + String.format("%.2f", mean) + " cm");
    }
}