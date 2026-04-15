public class ReverseWords {
    public static void main(String[] args) {

        // Combine all command-line arguments into one string
        String str = String.join(" ", args);

        String[] words = str.split(" ");

        System.out.print("Reversed sentence: ");

        // Print words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
