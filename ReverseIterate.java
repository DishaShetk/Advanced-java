package lab1;
import java.util.LinkedList;
import java.util.Iterator;

public class ReverseIterate {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("LinkedList: " + list);

        Iterator<String> descIterator = list.descendingIterator();
        System.out.println("Iterating in reverse order:");
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }
    }
}
