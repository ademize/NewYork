package CrossBrowserTest;

import java.util.HashMap;
import java.util.Map;

public class Question1 {

	public static void countRepeatedWords(String sentence) {
        // Use a HashMap to store word counts
        Map<String, Integer> wordCounts = new HashMap<String, Integer>();

        // Normalize the sentence: convert to lowercase and remove punctuation
        // This regex matches one or more non-word characters (including spaces, punctuation)
        // and replaces them with a single space. Then trim leading/trailing spaces.
        String normalizedSentence = sentence.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "").trim();

        // Split the sentence into words using space as a delimiter
        // "\\s+" matches one or more whitespace characters
        String[] words = normalizedSentence.split("\\s+");

        // Iterate through the words array to populate the map
        for (String word : words) {
            // Ensure the word is not empty (can happen if there are multiple spaces)
            if (!word.isEmpty()) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        // Iterate through the map to find and print repeated words
        System.out.println("Original Sentence: \"" + sentence + "\"");
        System.out.println("Normalized Sentence: \"" + normalizedSentence + "\"");
        System.out.println("Words found: " + java.util.Arrays.toString(words));

        boolean foundRepeated = false;
        System.out.println("\nRepeated words and their counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " times");
                foundRepeated = true;
            }
        }

        if (!foundRepeated) {
            System.out.println("No words are repeated in the sentence.");
        }
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        // Test cases
        countRepeatedWords("The quick brown fox jumps over the lazy dog. The dog is lazy.");
        countRepeatedWords("Java is great. Java programming is fun. Great!");
        countRepeatedWords("No repeated words here.");
        countRepeatedWords("apple banana apple cherry banana");
    }
}