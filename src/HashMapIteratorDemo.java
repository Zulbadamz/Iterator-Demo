import java.util.*;

public class HashMapIteratorDemo {
    public static void main(String[] args) {
        Map<String, Integer> categoryCount = new HashMap<>();
        categoryCount.put("Books", 12);
        categoryCount.put("Movies", 8);
        categoryCount.put("Games", 15);
        categoryCount.put("Music", 10);
        categoryCount.put("Electronics", 5);

        System.out.println("Original HashMap: " + categoryCount);

        // Iterate over HashMap and modify values
        Iterator<Map.Entry<String, Integer>> iterator = categoryCount.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());

            // Increase count of Books
            if (entry.getKey().equals("Books")) {
                entry.setValue(entry.getValue() + 5);
            }

            // Remove Electronics
            if (entry.getKey().equals("Electronics")) {
                iterator.remove();
            }
        }

        System.out.println("Updated HashMap: " + categoryCount);
    }
}
