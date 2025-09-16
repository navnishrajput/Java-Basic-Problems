public class CountWords {
    public static void main(String[] args) {
        String name = "My name is Navnish";

        String[] words = name.split("\\s+");
        int wordCount = 0;

        for (int i = 0; i < words.length; i++) {
            wordCount++;
        }

        System.out.println("Total words: " + wordCount);
    }
}