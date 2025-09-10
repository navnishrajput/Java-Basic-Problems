public class CourseDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discountAmount = fee * (discountPercent / 100);
        double finalFee = fee - discountAmount;

        System.out.printf("The discount amount is INR %.2f%n", discountAmount);
        System.out.printf("The final discounted fee is INR %.2f", finalFee);
    }
}