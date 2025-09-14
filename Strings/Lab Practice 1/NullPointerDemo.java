public class NullPointerDemo {

    public static void generateException() {
        String text = null;
       
        System.out.println(text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Cannot call methods on a null object.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling method to generate Exception:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\nCalling method to handle Exception properly:");
        handleException();
    }
}
