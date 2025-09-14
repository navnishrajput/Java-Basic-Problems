public class CollinearityCheck {

    // Method 1: Using Slope
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Avoid division by zero by cross-multiplying to compare slopes
        int lhs = (y2 - y1) * (x3 - x2);  // slopeAB * (x3 - x2)
        int rhs = (y3 - y2) * (x2 - x1);  // slopeBC * (x2 - x1)
        return lhs == rhs;
    }

    // Method 2: Using Area of Triangle
    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) +
                   x2 * (y3 - y1) +
                   x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        // Sample points
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        // Slope Method
        if (areCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Using Slope Method: Collinear");
        } else {
            System.out.println("Using Slope Method: Not Collinear");
        }

        // Area Method
        if (areCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Using Area Method: Collinear");
        } else {
            System.out.println("Using Area Method: Not Collinear");
        }
    }
}
