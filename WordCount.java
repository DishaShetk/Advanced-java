package lab3;
public class WordCount {

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String str = "Java is easy to learn";
        System.out.println("Word Count: " + countWords(str));
    }
}