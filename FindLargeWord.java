public class FindLargeWord {
    
    public static void main(String[] args) {
        String sentence = "Hey, this is my accenture interview";
        System.out.println("Longest word in the sentence is: " + findLongestWord(sentence));
    }
    
    public static String findLongestWord(String sentence) {
       
        String[] words = sentence.split(" ");

        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            // Remove any punctuation marks from the word if require
         //   word = word.replaceAll("[^a-zA-Z]", "");
            
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }
}
