package lab2;
import java.util.Scanner;

public class StringOperationsDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("\nEquals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));
        System.out.println("CompareTo: " + str1.compareTo(str2));

        // 4. String Searching
        String sentence = "Java programming is fun";
        System.out.println("\nIndex of 'programming': " + sentence.indexOf("programming"));
        System.out.println("Contains 'Java': " + sentence.contains("Java"));

        // 5. Substring Operations
        System.out.println("\nSubstring (0 to 4): " + sentence.substring(0, 4));

        // 6. String Modification
        String modified = sentence.replace("fun", "awesome");
        System.out.println("\nModified String: " + modified);

        // 7. Whitespace Handling
        String spaced = "   Hello Java   ";
        System.out.println("\nBefore Trim: '" + spaced + "'");
        System.out.println("After Trim: '" + spaced.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + concat);

        // 9. String Splitting
        String fruits = "Apple,Mango,Banana";
        String[] fruitArray = fruits.split(",");
        System.out.println("\nSplit Strings:");
        for (String f : fruitArray) {
            System.out.println(f);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(5, "Core ");
        sb.replace(0, 4, "Advanced");
        System.out.println("\nStringBuilder Result: " + sb);

        // 11. String Formatting
        int age = 20;
        String formatted = String.format("My age is %d years.", age);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Email Validation using contains(), startsWith(), endsWith()
        System.out.print("\nEnter Email: ");
        String email = sc.nextLine();

        if (email.contains("@") && email.contains(".") &&
            !email.startsWith("@") && email.endsWith(".com")) {
            System.out.println("Valid Email Format");
        } else {
            System.out.println("Invalid Email Format");
        }

        sc.close();
    }
}