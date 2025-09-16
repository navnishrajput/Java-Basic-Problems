public class StringComp {
    public static void main(String arg[]) {
        String s1 = "hello";
        String s2 = "Hello";

        if (s1 == s2) {
            System.out.println("yes equal");
        } else {
            System.out.println("not equal");
        }

        if (s1.equals(s2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}