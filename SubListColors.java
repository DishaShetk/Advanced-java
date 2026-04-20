package lab1;
import java.util.ArrayList;
import java.util.List;

public class SubListColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Colors: " + colors);

        List<String> subList = colors.subList(0, 2); // Extract 1st and 2nd
        System.out.println("SubList (1st and 2nd): " + subList);
    }
}
