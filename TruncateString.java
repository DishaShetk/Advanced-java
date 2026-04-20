package lab3;

public class TruncateString {

    public static String truncate(String str, int length) {
        if (str.length() <= length) {
            return str;
        }
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        String str = "Java is a powerful programming language";
        System.out.println("Truncated: " + truncate(str, 15));
    }
}