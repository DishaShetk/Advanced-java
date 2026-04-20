package lab1;
import java.util.LinkedList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Before swap: " + list);

        Collections.swap(list, 0, 2); // swap first (index 0) and third (index 2)

        System.out.println("After swap: " + list);
    }
}
