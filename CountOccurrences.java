package lab3;
public class CountOccurrences {

    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        return count;
    }

    public static void main(String[] args) {
        String mainStr = "AIET is great. AIET is awesome.";
        String subStr = "AIET";

        int result = countOccurrences(mainStr, subStr);
        System.out.println("Occurrences: " + result);
    }
}