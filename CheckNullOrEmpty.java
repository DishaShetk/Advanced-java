package lab3;
public class CheckNullOrEmpty {

    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        String str = "   ";

        if (isNullOrEmpty(str)) {
            System.out.println("String is null or contains only whitespace.");
        } else {
            System.out.println("String is not empty.");
        }
    }
}