package lab1;
import java.util.ArrayList;

public class DeleteNthColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original Colors: " + colors);

        int n = 2; // Example: delete 3rd element (index 2)
        if (n < colors.size()) {
            colors.remove(n);
            System.out.println("After deleting element at index " + n + ": " + colors);
        } else {
            System.out.println("Index out of range!");
        }
    }
}
