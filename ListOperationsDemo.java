package lab1;
import java.util.*;

public class ListOperationsDemo {

    public static void main(String[] args) {
        // Initialize ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Adding elements
        addElements(arrayList, linkedList);

        // Adding element at specific index
        addAtIndex(arrayList, linkedList, 1, "Grapes");

        // Adding multiple elements
        addMultiple(arrayList, linkedList, Arrays.asList("Mango", "Pineapple"));

        // Accessing elements
        accessElements(arrayList, linkedList);

        // Updating elements
        updateElement(arrayList, linkedList, 2, "Strawberry");

        // Removing elements
        removeElement(arrayList, linkedList, "Banana");

        // Searching elements
        searchElement(arrayList, linkedList, "Apple");

        // List size
        listSize(arrayList, linkedList);

        // Iterating over list
        iterateList(arrayList, linkedList);

        // Using Iterator
        useIterator(arrayList, linkedList);

        // Sorting
        sortList(arrayList, linkedList);

        // Sublist
        subList(arrayList, linkedList, 1, 3);

        // Clearing the list
        clearList(arrayList, linkedList);
    }

    // 1. Adding elements
    static void addElements(List<String> arrayList, List<String> linkedList) {
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Added elements: " + arrayList + " | " + linkedList);
    }

    // 2. Adding element at specific index
    static void addAtIndex(List<String> arrayList, List<String> linkedList, int index, String element) {
        arrayList.add(index, element);
        linkedList.add(index, element);
        System.out.println("After adding at index " + index + ": " + arrayList + " | " + linkedList);
    }

    // 3. Adding multiple elements
    static void addMultiple(List<String> arrayList, List<String> linkedList, List<String> elements) {
        arrayList.addAll(elements);
        linkedList.addAll(elements);
        System.out.println("After adding multiple: " + arrayList + " | " + linkedList);
    }

    // 4. Accessing elements
    static void accessElements(List<String> arrayList, List<String> linkedList) {
        System.out.println("Access element at index 2: " + arrayList.get(2) + " | " + linkedList.get(2));
    }

    // 5. Updating elements
    static void updateElement(List<String> arrayList, List<String> linkedList, int index, String newElement) {
        arrayList.set(index, newElement);
        linkedList.set(index, newElement);
        System.out.println("After updating index " + index + ": " + arrayList + " | " + linkedList);
    }

    // 6. Removing elements
    static void removeElement(List<String> arrayList, List<String> linkedList, String element) {
        arrayList.remove(element);
        linkedList.remove(element);
        System.out.println("After removing " + element + ": " + arrayList + " | " + linkedList);
    }

    // 7. Searching elements
    static void searchElement(List<String> arrayList, List<String> linkedList, String element) {
        System.out.println("Searching '" + element + "': " +
                arrayList.contains(element) + " | " + linkedList.contains(element));
    }

    // 8. List size
    static void listSize(List<String> arrayList, List<String> linkedList) {
        System.out.println("List size: " + arrayList.size() + " | " + linkedList.size());
    }

    // 9. Iterating over list
    static void iterateList(List<String> arrayList, List<String> linkedList) {
        System.out.print("ArrayList iteration: ");
        for (String item : arrayList) {
            System.out.print(item + " ");
        }
        System.out.print("\nLinkedList iteration: ");
        for (String item : linkedList) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // 10. Using Iterator
    static void useIterator(List<String> arrayList, List<String> linkedList) {
        System.out.print("ArrayList using Iterator: ");
        Iterator<String> it1 = arrayList.iterator();
        while (it1.hasNext()) {
            System.out.print(it1.next() + " ");
        }

        System.out.print("\nLinkedList using Iterator: ");
        Iterator<String> it2 = linkedList.iterator();
        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }
        System.out.println();
    }

    // 11. Sorting
    static void sortList(List<String> arrayList, List<String> linkedList) {
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("After sorting: " + arrayList + " | " + linkedList);
    }

    // 12. Sublist
    static void subList(List<String> arrayList, List<String> linkedList, int start, int end) {
        System.out.println("Sublist (" + start + "," + end + "): " +
                arrayList.subList(start, end) + " | " + linkedList.subList(start, end));
    }

    // 13. Clearing the list
    static void clearList(List<String> arrayList, List<String> linkedList) {
        arrayList.clear();
        linkedList.clear();
        System.out.println("After clearing: " + arrayList + " | " + linkedList);
    }
}
