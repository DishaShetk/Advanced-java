package lab1;
import java.util.LinkedList;
import java.util.Iterator;

public class IterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("LinkedList: " + list);

        Iterator<String> iterator = list.listIterator(1); // start at index 1 (2nd element)
        System.out.println("Iterating from 2nd position:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
