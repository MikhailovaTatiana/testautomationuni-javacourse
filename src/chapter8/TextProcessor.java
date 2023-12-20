package chapter8;

public class TextProcessor {
    public static void main(String[] args) {

        countWords("I love Test Auto Uni");
        reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'sMeTanya");
    }

    /**
     * Splits a String into an array by tokenizing it
     * Counts words and prints them
     * @param text Full string to be split
     */
    private static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.print(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */
    private static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0 ; i--) {
            System.out.print(text.charAt(i));
        }
    }

    /**
     * Adds spaces before each uppcase letter
     * @param text jumped text
     */
    private static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
