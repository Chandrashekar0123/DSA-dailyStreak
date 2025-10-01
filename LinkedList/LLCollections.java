import java.util.LinkedList;

class LLCollections {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("is");
        list.addFirst("This");
        list.addLast("LinkedList");
        list.add("Example");

        // Print list
        System.out.println("LinkedList: " + list);

        // Get elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Remove elements
        list.removeFirst();
        System.out.println("After removeFirst: " + list);

        list.removeLast();
        System.out.println("After removeLast: " + list);

        list.remove("is");
        System.out.println("After remove(\"is\"): " + list);

        // Add at specific index
        list.add(1, "Java");
        System.out.println("After add at index 1: " + list);

        // Set element
        list.set(0, "Updated");
        System.out.println("After set at index 0: " + list);

        // Check size
        System.out.println("Size: " + list.size());

        // Check if contains
        System.out.println("Contains 'Java'? " + list.contains("Java"));

        // Clear list
        list.clear();
        System.out.println("After clear: " + list);
    }
}

/*
Output :
LinkedList: [This, is, LinkedList, Example]
First Element: This
Last Element: Example
Element at index 2: LinkedList
After removeFirst: [is, LinkedList, Example]
After removeLast: [is, LinkedList]
After remove("is"): [LinkedList]
After add at index 1: [LinkedList, Java]
After set at index 0: [Updated, Java]
Size: 2
Contains 'Java'? true
After clear: []

 */