package lab3;

public class CheckNumeric {

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "12345";
        System.out.println("Is Numeric: " + isNumeric(str));
    }
}